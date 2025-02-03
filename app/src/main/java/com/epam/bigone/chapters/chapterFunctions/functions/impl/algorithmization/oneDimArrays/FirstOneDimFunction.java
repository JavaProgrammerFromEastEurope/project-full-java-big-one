package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * The Array A[N] contains natural numbers.
 * Find the sum of those elements that are multiples of a given K
 **/
public class FirstOneDimFunction implements Function<CustomArray> {

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
		array.setFirstArray(CustomArray.initLineObjects(true, true, (int) variables[0]));
		for (Object number : array.getFirstArray()) {
			if ((int) number % variables[1] == 0) {
				operation[0] += (int) number;
			}
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 1. One Dimension Array";
			addString[1] = "\n General array";
			addString[2] = " Sum of elements multiple";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], array.getFirstArray()));
			resultList.add(format(" %s %.0f is %.0f",
					addString[2], variables[1], operation[0]));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
