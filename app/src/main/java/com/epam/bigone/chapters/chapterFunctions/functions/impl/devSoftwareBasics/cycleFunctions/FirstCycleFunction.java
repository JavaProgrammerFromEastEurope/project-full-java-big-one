package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 1. Write a program where the user enters any positive integer.
 * And the program sums up all numbers from 1 to a user-entered number.
 **/
public class FirstCycleFunction implements Function<CustomArray> {

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
		for (int i = 1; i <= variables[0]; i++) {
			operation[0] += i;
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 1. Cycle function ";
			addString[1] = " Sum of numbers from 1 to ";
			return format("%n%s%n%s%.0f = %.0f%n",
					addString[0], addString[1], variables[0], operation[0]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
