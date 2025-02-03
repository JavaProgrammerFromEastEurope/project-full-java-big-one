package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import com.epam.bigone.app.util.Maths;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Finding the greatest common divisor and least common multiple of two
 * natural numbers.
 **/
public class FirstDecFunction implements Function<CustomArray> {

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
		operation[0] = Maths.gcf((int) variables[0], (int) variables[1]);
		operation[1] = Maths.gcd((int) variables[0], (int) variables[1]);
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 1. Decomposition function";
			addString[1] = " The numbers";
			addString[2] = "Greatest Common Factor is:";
			addString[3] = "Greatest Common Multiple is:";
			addString[4] = (format("%s%n%s[%.0f,%.0f]%n %s[%.0f]%n %s[%.0f]",
					addString[0], addString[1], variables[0], variables[1],
					addString[2], operation[0], addString[3], operation[1]));
			return format("%n%s%n", addString[4]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
