package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Form a square matrix of order n according to a given pattern (n is even):
 **/
public class FourthMatrixFunction implements Function<CustomArray> {

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
		for (int i = 0; i < array.getMatrix().length; i++)
			for (int j = 0; j < array.getMatrix().length; j++)
				array.getMatrix()[i][j] = ((i % 2) == 0)
						? (int) ++operation[0]
						: (int) operation[0]--;
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = "4. Matrix\n";
			return format("%n%s %s%n", addString[0], array.setFormattedMatrix(array.getMatrix()));
		} finally {
			Function.super.setDefaults();
		}
	}
}
