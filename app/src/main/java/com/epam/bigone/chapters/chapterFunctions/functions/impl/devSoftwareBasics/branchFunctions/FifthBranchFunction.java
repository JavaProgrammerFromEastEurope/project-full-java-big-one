package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.branchFunctions;

import static java.lang.Math.pow;
import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.app.util.Input;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 5. Calculate the value of the function:
 * (x <= 3) - x^2 - 3x + 9
 * (x > 3) - 1 / (x^3 + 6)
 **/
public class FifthBranchFunction implements Function<CustomArray> {

	@Override
	public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
		try {
			variables[0] = Input.anyIntInitialize("Please, input value:");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void calcFunction(CustomArray array) {
		operation[0] = (variables[0] > 3)
				? 1 / (pow(variables[0], 3) + 6)
				: pow(variables[0], 2) - 3 * variables[0] + 9;

	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 5. Branch function ";
			addString[1] = " see pattern in the file";
			return format("%n%s%n%s, x[%.0f], result[%.3f]%n",
					addString[0], addString[1], variables[0], operation[0]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
