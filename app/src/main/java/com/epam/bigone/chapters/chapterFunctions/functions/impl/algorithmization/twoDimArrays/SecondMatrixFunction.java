package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import java.util.ArrayList;
import java.util.stream.IntStream;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static java.lang.String.format;
import static java.lang.System.out;

public class SecondMatrixFunction implements Function<CustomArray> {

	@Override
	public void calcFunction(CustomArray array) {
		array.setMatrix(new Integer[][] { { 9, 2, 4, 4 }, { 8, 3, 4, 4 }, { 7, 5, 3, 4 }, { 6, 2, 3, 1 } });
		array.setFormattedMatrix(array.getMatrix());
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 2. Matrix\n";
			addString[1] = " The elements on general diagonal is:\n";
			resultList.add(format("%s%s %s", addString[0], addString[1],
					array.setFormattedMatrix(array.getMatrix())));
			IntStream.range(0, array.getMatrix().length)
					.forEach(i -> resultList.add(format(" %s", array.getMatrix()[i][i])));
			return format("%n%s%n", resultList);
		} finally {
			Function.super.setDefaults();
		}
	}
}
