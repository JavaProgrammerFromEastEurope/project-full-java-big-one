package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Generate a random m x n matrix consisting of zeros and ones,
 * and in each column the number units is equal to column number.
 **/
public class FourteenMatrixFunction implements Function<CustomArray> {

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
		array.setMatrix(new Integer[(int) variables[0]][(int) variables[1]]);
		for (int i = 0; i < variables[0]; i++)
			for (int j = 0; j < variables[1]; j++)
				array.getMatrix()[i][j] = (j >= i) ? 1 : 0;
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = "14. Matrix\n";
			return format("%n%s %s%n", addString[0],
					array.setFormattedMatrix(array.getMatrix()));
		} finally {
			Function.super.setDefaults();
		}
	}
}
