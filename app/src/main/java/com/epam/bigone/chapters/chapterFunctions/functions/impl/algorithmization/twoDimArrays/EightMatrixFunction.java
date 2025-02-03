package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * In a numeric matrix, swap two columns of any column, i.e. put all elements of
 * one column
 * to the corresponding positions of the other,
 * and move its elements of the second to the first.
 * Column numbers introduces keyboard user.
 **/
public class EightMatrixFunction implements Function<CustomArray> {

	@Override
	public void calcFunction(CustomArray array) {
		variables[0] = 10;
		variables[1] = 20;
		operation[1] = Function.super.inputPosition((int) variables[1]);
		operation[2] = Function.super.inputPosition((int) variables[1]);
		array.setMatrix(CustomArray.initMatrix((int) variables[0], (int) variables[1]));
	}

	private void changePositions(CustomArray array) {
		int localBound = array.getMatrix().length;
		for (int index = 0; index < localBound; index++) {
			operation[0] = (int) array.getMatrix()[index][(int) (operation[1] - 1)];
			array.getMatrix()[index][(int) (operation[1] - 1)] = array.getMatrix()[index][(int) (operation[2] - 1)];
			array.getMatrix()[index][(int) (operation[2] - 1)] = (int) operation[0];
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 8. Matrix\n";
			addString[1] = format(" Swap %.0f to %.0f matrix columns:\n", operation[1], operation[2]);
			addString[2] = format("%s %s", addString[0], array.setFormattedMatrix(array.getMatrix()));
			this.changePositions(array);
			addString[3] = format("%s %s", addString[1], array.setFormattedMatrix(array.getMatrix()));
			return format("%n%s%s%n", addString[2], addString[3]);
		} finally {
			Function.super.setDefaults();
		}
	}

}
