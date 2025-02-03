package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.linearFunctions;

import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 1. Find the value of the function:
 * z = ((a - 3) * b / 2) + c
 **/
public class FirstLinearFunction implements Function<CustomArray>{

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
			operation[0] = variables[0] - 3;            /* (a - 3) */
			operation[1] = variables[1] / 2;            /* (b / 2) */
			operation[2] = operation[0] * operation[1]; /* (a - 3) * (b / 2) */
			operation[3] = operation[2] + variables[2]; /* (a - 3) * (b / 2) + c */
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = format("1. Linear Function:\n" +
									"((%.0f - 3) * %.0f / 2) + %.0f =",
											variables[0],variables[1],variables[2]);
				return format("%n%s %.1f%n", addString[0], operation[3]);
		} finally {
				Function.super.setDefaults();
		}
	}
}
