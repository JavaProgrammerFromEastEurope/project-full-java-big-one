package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Form a square matrix of order N according to the rule:
 **/
public class SevenMatrixFunction implements Function<CustomArray> {

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
		array.setMatrix(new Double[(int) variables[0]][(int) variables[0]]);
		for (int i = 0; i < array.getMatrix().length; i++) {
			for (int j = 0; j < array.getMatrix().length; j++) {
				array.getMatrix()[i][j] = sin(pow(i, 2) - pow(j, 2)) / variables[0];
				if ((double) array.getMatrix()[i][j] > 0)
					operation[0]++;
			}
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 7. Matrix\n";
			addString[1] = " Number of positive elements:";
			addString[2] = format(" %s%s %.0f", array.setFormattedMatrix(array.getMatrix()),
					addString[1], operation[0]);
			return format("%n%s%s%n", addString[0], addString[2]);
		} finally {
			Function.super.setDefaults();
		}
	}

}
