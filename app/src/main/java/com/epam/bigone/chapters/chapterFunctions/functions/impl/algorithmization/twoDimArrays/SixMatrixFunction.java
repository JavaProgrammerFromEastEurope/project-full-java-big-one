package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Form a square matrix of order n according to a given pattern (n is even):
 **/
public class SixMatrixFunction implements Function<CustomArray> {

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
		array.setMatrix(new Integer[(int) variables[0]][(int) variables[0]]);
		operation[0] = array.getMatrix().length >> 1;
		operation[1] = array.getMatrix().length;
		for (int i = 0; i < (int) operation[0]; i++) {
			for (int j = 0; j < array.getMatrix().length; j++) {
				array.getMatrix()[i][j] = (j < (int) operation[1] && j >= (int) operation[2]) ? 1 : 0;
			}
			--operation[1];
			operation[2]++;
		}
		for (int i = (int) operation[0]; i < array.getMatrix().length; i++) {
			--operation[1];
			for (int j = 0; j < array.getMatrix().length; j++) {
				array.getMatrix()[i][j] = (j >= operation[1] && j <= operation[2]) ? 1 : 0;
			}
			operation[2]++;
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 6. Matrix\n";
			addString[1] = " Matrix for given";
			return format("%n%s%s[%.0f]%n %s%n", addString[0],
					addString[1], variables[0], array.setFormattedMatrix(array.getMatrix()));
		} finally {
			Function.super.setDefaults();
		}
	}

}
