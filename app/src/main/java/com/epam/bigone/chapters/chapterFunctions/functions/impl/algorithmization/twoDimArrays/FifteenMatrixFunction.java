package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import java.util.TreeSet;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static java.lang.Math.max;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Find the largest element of the matrix and replace all odd elements with it.
 **/
public class FifteenMatrixFunction implements Function<CustomArray> {

	private TreeSet<Object> sortedElementsSet;

	private void initArray(CustomArray array) {
		variables[0] = 10;
		variables[1] = 20;
		sortedElementsSet = new TreeSet<>();
		array.setMatrix(CustomArray.initMatrix((int) variables[0], (int) variables[1]));
	}

	private void findMaxElement(CustomArray array) {
		for (Object[] numbers : array.getMatrix()) {
			sortedElementsSet.addAll(
					java.util.Arrays.asList(numbers).subList(0, numbers.length));
			operation[0] = max((int) sortedElementsSet.last(), operation[0]);
		}
	}

	private void initOddElements(CustomArray array) {
		for (int i = 0; i < variables[0]; i++)
			for (int j = 0; j < variables[1]; j++)
				if ((j % 2) == 0)
					array.getMatrix()[i][j] = (int) operation[0];
	}

	@Override
	public void calcFunction(CustomArray array) {
		this.initArray(array);
		array.setFormattedMatrix(array.getMatrix());
		this.findMaxElement(array);
		this.initOddElements(array);
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 15. Matrix\n";
			addString[1] = format(" The largest element of the matrix %.0f\n" +
					" and replace all odd elements with it\n", operation[0]);
			return format("%n%s%s %s%n", addString[0],
					addString[1], array.setFormattedMatrix(array.getMatrix()));
		} finally {
			Function.super.setDefaults();
		}
	}
}
