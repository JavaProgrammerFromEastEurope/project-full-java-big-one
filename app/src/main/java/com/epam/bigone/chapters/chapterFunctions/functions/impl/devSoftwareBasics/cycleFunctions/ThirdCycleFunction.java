package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import static java.lang.Math.pow;
import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 3. Find the sum of the squares of the first hundred numbers.
 **/
public class ThirdCycleFunction implements Function<CustomArray> {

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
		for (int index = 1; index <= 100; index++) {
			operation[3] += pow(index, 2);
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 3. Cycle function ";
			addString[1] = " Sum of the squares of the first hundred numbers:";
			return format("%n%s%n%s %.0f%n",
					addString[0], addString[1], operation[3]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
