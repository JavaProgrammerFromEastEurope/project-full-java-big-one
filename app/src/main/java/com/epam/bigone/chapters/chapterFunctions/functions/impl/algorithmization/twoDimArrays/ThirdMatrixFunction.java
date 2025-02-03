package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.*;
import static java.lang.System.out;

/**
 * A matrix is given. Print the k-th row and p-th column of the matrix.
 **/
public class ThirdMatrixFunction implements Function<CustomArray> {

	@Override
	public void calcFunction(CustomArray array) {
		array.setMatrix(new Integer[][] { { 9, 8, 7, 6 }, { 5, 4, 3, 2 }, { 1, 0, 1, 2 }, { 3, 4, 5, 6 } });
		array.setFormattedMatrix(array.getMatrix());
		operation[0] = inputPosition(array.getMatrix().length) - 1;
		operation[1] = inputPosition(array.getMatrix().length) - 1;
	}

	private List<Object> printMatrixElement(CustomArray array, boolean bLine, int element) {
		var numberList = new ArrayList<>();
		for (int i = 0; i < array.getMatrix().length; i++)
			numberList.add(format(" %s", bLine
					? array.getMatrix()[element][i]
					: array.getMatrix()[i][element]));
		numberList.add("\n");
		return numberList;
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 3. Matrix\n";
			addString[1] = format(" %s %s", addString[0], array.setFormattedMatrix(array.getMatrix()));
			addString[2] = format(" Print %.0f Line:%n  %s", operation[0] + 1,
					printMatrixElement(array, true, (int) operation[0]));
			addString[3] = format(" Print %.0f Column:%n  %s", operation[1] + 1,
					printMatrixElement(array, false, (int) operation[1]));
			return format("%n%s%s%s%n", addString[1], addString[2], addString[3]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
