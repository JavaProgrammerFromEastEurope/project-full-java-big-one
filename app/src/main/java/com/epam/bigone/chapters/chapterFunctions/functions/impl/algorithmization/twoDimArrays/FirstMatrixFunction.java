package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.stream.IntStream.iterate;

public class FirstMatrixFunction implements Function<CustomArray> {

	private ArrayList<Object> numberElementArray;

	@Override
	public void calcFunction(CustomArray array) {
		numberElementArray = new ArrayList<>();
		array.setMatrix(new Integer[][] { { 9, 2, 4, 5 }, { 8, 3, 4, 5 }, { 7, 5, 3, 6 }, { 6, 2, 5, 5 } });
		int localBound = array.getMatrix().length - 1;
		for (Object[] numbers : array.getMatrix()) {
			iterate(0, column -> column <= localBound, column -> column + 2)
					.filter(column -> (int) array.getMatrix()[0][column] >
						(int) array.getMatrix()[localBound][column])
					.forEach(column -> numberElementArray.add(numbers[column]));
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = "1. Matrix\n";
			addString[1] = "First Element Odd Columns greater than the last";
			addString[2] = format("%s:%n%s%n", addString[1], numberElementArray);
			return format("%n%s%s %s%n", addString[0],
					addString[2], array.setFormattedMatrix(array.getMatrix()));
		} finally {
			Function.super.setDefaults();
		}
	}
}
