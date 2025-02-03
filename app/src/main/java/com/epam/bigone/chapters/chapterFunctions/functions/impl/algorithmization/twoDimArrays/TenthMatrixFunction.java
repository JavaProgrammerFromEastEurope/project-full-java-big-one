package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Find the positive elements of the main diagonal of a square matrix.
 **/
public class TenthMatrixFunction implements Function<CustomArray> {

	private List<Object> numberElementArray;

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
		array.setMatrix(CustomArray.initMatrix((int) variables[0], (int) variables[0]));
		numberElementArray = new ArrayList<>();
		IntStream.range(0, array.getMatrix().length)
				.filter(i -> (int) array.getMatrix()[i][i] > 0)
				.forEach(i -> numberElementArray.add(array.getMatrix()[i][i]));
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 10. Matrix\n";
			addString[1] = "Positive elements of the main diagonal:";
			addString[2] = format("%s %s", addString[0], array.setFormattedMatrix(array.getMatrix()));
			addString[3] = format(" %s", array.getArray(addString[1], numberElementArray.toArray()));
			return format("%n%s%s%n", addString[2], addString[3]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
