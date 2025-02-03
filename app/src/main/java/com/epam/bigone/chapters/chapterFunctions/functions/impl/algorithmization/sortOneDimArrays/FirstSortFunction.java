package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * Two one-dimensional arrays with different elements and a natural number k are
 * given. Combine them into one array, including the second array between the
 * kth and (k + 1).
 **/
public class FirstSortFunction implements Function<CustomArray> {

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
		array.setFirstArray(
				CustomArray.initLineObjects(true, (int) variables[0], (int) variables[1]));
		array.setExtraArray(
				CustomArray.initLineObjects(true, true, (int) variables[1]));
		operation[0] = inputPosition((int) variables[0]);
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 1. Sorted One Dimension Array\n";
			addString[1] = "First Array is";
			addString[2] = "Second array is";
			addString[3] = "Resulting array is";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], array.getFirstArray()));
			resultList.add(array.getArray(addString[2], array.getExtraArray()));
			resultList.add(array.getArray(addString[3],
					array.combineArrays(array.getFirstArray(), array.getExtraArray(), (int) operation[0])));
			return String.format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
