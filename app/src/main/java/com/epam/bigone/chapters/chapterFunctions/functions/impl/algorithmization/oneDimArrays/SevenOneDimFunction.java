package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import static java.lang.Math.max;
import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * You are given real numbers a1, a2, ..., an.
 * To fin
 **/
public class SevenOneDimFunction implements Function<CustomArray> {

	private double isMax(CustomArray array, int index, int localBound) {
		return (double) array.getFirstArray()[index] +
				(double) array.getFirstArray()[localBound - index];
	}

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
		array.setFirstArray(CustomArray.initLineObjects(false, true, (int) variables[0]));
		int halfBound = array.getFirstArray().length / 2;
		for (int index = 0; index < halfBound; index++) {
			operation[0] = max(isMax(array, index,
					array.getFirstArray().length - 1), operation[0]);
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 7. One Dimension Array\n";
			addString[1] = "General Array";
			addString[2] = "Max sum of twins elements - %.3f";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], array.getFirstArray()));
			resultList.add(format(addString[2], operation[0]));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
