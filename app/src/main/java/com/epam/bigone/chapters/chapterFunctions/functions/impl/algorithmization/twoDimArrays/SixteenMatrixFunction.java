package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.*;
import static java.lang.System.out;

/**
 * A magic square of order n is a square nxn matrix composed of numbers 1, 2, 3,
 * ..., n2 so that the sums for each column, each row, and each of the two large
 * diagonals are equals.
 **/
public class SixteenMatrixFunction implements Function<CustomArray> {

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
		if (variables[0] % 2 == 1)
			initOddMagicSquare(array);
		else
			initEvenMagicSquare(array);
	}

	private void initOddMagicSquare(CustomArray array) {
		operation[0] = (int) variables[0] >> 1;
		operation[1] = 1;
		for (int i = 0; i < array.getMatrix().length; i++)
			for (int j = 0; j < array.getMatrix().length; j++) {
				operation[2] = (-operation[0] + i + j + variables[0]) % variables[0];
				operation[3] = ( operation[0] + i - j + variables[0]) % variables[0];
				array.getMatrix()[(int) operation[2]][(int) operation[3]] = (int) operation[1]++;
			}
	}

	private void initEvenMagicSquare(CustomArray array) {
		for (int i = 0; i < variables[0]; i++)
			for (int j = 0; j < variables[0]; j++)
				array.getMatrix()[i][j] = ((int) variables[0] * i) + j + 1;

		addEvenMagicOperation(
				0, (int) variables[0] >> 2,
				0, (int) variables[0] >> 2, array);
		addEvenMagicOperation(
				3 * (int) variables[0] 	>> 2, (int) variables[0],
				3 * (int) variables[0] 	>> 2, (int) variables[0], array);
		addEvenMagicOperation(
				(int) variables[0] >> 2, 3 * (int) variables[0] >> 2,
				(int) variables[0] >> 2, 3 * (int) variables[0] >> 2, array);
		addEvenMagicOperation(
				0,  (int) variables[0] >> 2,
				3 * (int) variables[0] >> 2, (int) variables[0], array);
		addEvenMagicOperation(
				3 * (int) variables[0] >> 2, (int) variables[0],
				0,  (int) variables[0] >> 2, array);
	}

	private void addEvenMagicOperation(
		int xStart, int xFinish, int yStart, int yFinish, CustomArray array) {
		for (int x = xStart; x < xFinish; x++)
			for (int y = yStart; y < yFinish; y++)
				array.getMatrix()[x][y] =
					((int) variables[0] * (int) variables[0] + 1)
						- (int) array.getMatrix()[x][y];
	}

	private List<Object> reverseIndexPrintMatrix(CustomArray array) {
		var objectList = new ArrayList<>();
		for (int i = (int) variables[0] - 1; i >= 0; i--) {
			objectList.add(array.getLineObjects(array.getMatrix()[i]));
			objectList.add("\n");
		}
		objectList.add("\n");
		return objectList;
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 16. Matrix\n";
			addString[1] = "Magic Square";
			if ((int) variables[0] % 2 == 1)
						addString[2] = format("%s Odd %s for %.0f%n %s", addString[0],
						addString[1], variables[0], reverseIndexPrintMatrix(array));
			else
						addString[2] = format("%s Even %s for %.0f%n %s", addString[0],
						addString[1], variables[0], array.setFormattedMatrix(array.getMatrix()));
			return format("%n%s%n", addString[2]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
