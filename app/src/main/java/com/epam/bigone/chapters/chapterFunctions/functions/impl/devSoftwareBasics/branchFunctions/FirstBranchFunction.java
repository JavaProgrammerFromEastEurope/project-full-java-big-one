package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.branchFunctions;

import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 1. Given two angles of the triangle (in degrees).
 * Determine whether such a triangle exists, and if so,
 * whether there will be it is rectangular.
 **/
public class FirstBranchFunction implements Function<CustomArray> {

	private boolean bRect, bExist = true;

	@Override
	public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
		try {
			Function.super.inputVariables(length, bEvenValue, bDouble);
		} catch (IllegalStateException e) {
			e.getMessage();
		}
	}

	@Override
	public void calcFunction(CustomArray array) {
		int angle = (int) variables[0] + (int) variables[1];
		bRect = (angle > 180)
				? bExist = false
				: (180 - angle == 90 || variables[0] == 90 || variables[1] == 90);
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[4] = " 1. Branch function ";
			addString[0] = "rectangular"; addString[1] = "not rectangular";
			addString[2] = "not exist";		addString[3] = " The triangle with angles:";
			String isRectangular = bExist ? bRect ? addString[0]
																		: addString[1] : addString[2];
			return format("%n%s%n%s [%.0f,%.0f] - %s%n",
					addString[4], addString[3], variables[0], variables[1], isRectangular);
		} finally {
			Function.super.setDefaults();
		}
	}
}
