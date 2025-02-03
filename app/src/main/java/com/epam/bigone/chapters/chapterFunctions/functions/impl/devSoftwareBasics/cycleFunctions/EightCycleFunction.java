package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import static java.lang.String.format;
import static java.lang.String.valueOf;
import static java.lang.System.out;

import java.util.Arrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 8. Two numbers are given.
 * Determine the digits included in the recording of both the first and second numbers.
 **/
public class EightCycleFunction implements Function<CustomArray> {

	private char[] firstNumberDigits;
	private char[] secondNumberDigits;

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
		firstNumberDigits 	= valueOf((int) variables[0]).toCharArray();
		secondNumberDigits 	= valueOf((int) variables[1]).toCharArray();
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 8. Cycle function ";
			addString[1] = " There are couple arrays of digits from two inputted numbers:";
			return format("%n%s%n%s%n %.0f - %s,%n %.0f - %s %n%n",
					addString[0], addString[1],
					variables[0], Arrays.toString(firstNumberDigits),
					variables[1], Arrays.toString(secondNumberDigits));
		} finally {
			Function.super.setDefaults();
		}
	}
}
