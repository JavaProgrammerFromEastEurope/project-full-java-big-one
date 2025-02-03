package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Form a square matrix of order n according to a given pattern (n is even):
 **/
public class FifthMatrixFunction implements Function<CustomArray> {

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
		int bound = array.getMatrix().length;
		for (int i = 0; i < array.getMatrix().length; i++) {
			for (int j = 0; j < array.getMatrix().length; j++)
				array.getMatrix()[i][j] = (j >= bound) ? 0 : i + 1;
			bound--;
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 5. Matrix\n";
			addString[1] = " Matrix for given";
			return format("%n%s%s[%.0f]%n %s%n", addString[0],
					addString[1], variables[0], array.setFormattedMatrix(array.getMatrix()));
		} finally {
			Function.super.setDefaults();
		}
	}

}
