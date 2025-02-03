package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.branchFunctions;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 2. Find max{min(a, b), min(c, d)}
 **/
public class SecondBranchFunction implements Function<CustomArray> {

	@Override
	public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
		try {
			Function.super.inputVariables(length, bEvenValue, bDouble);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void calcFunction(CustomArray array) {
		operation[3] = 	max(min(variables[0], variables[1]),
												min(variables[2], variables[3]));
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 2. Branch function ";
			addString[1] = " The max value from:";
			return format("%n%s%n%s max(min(%.0f,%.0f), min(%.0f,%.0f)) - %.0f%n",
					addString[0], addString[1], variables[0],
					variables[1], variables[2],
					variables[3], operation[3]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
