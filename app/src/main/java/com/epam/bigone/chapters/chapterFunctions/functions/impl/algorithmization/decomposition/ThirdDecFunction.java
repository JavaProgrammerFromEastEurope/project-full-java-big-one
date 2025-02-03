package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import static java.lang.Math.*;
import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * Calculate the area of a regular hexagon with side 'a'
 * using the area calculation method triangle.
 **/
public class ThirdDecFunction implements Function<CustomArray> {

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
		operation[0] = pow(variables[0], 2) * sqrt(3) / 4;
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 3. Decomposition function";
			addString[1] = " Area of a regular hexagon with side:";
			addString[2] = format("%s%n%s %.0f - %.0f",
					addString[0], addString[1], variables[0], operation[0]);
			return format("%n%s%n", addString[2]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
