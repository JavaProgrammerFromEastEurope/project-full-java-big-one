package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import com.epam.bigone.app.sortComparator.impl.function.SortByHigherObject;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;

import static com.epam.bigone.app.util.Sort.sortLineObjects;
import static java.lang.String.*;
import static java.lang.System.out;

/**
 * Two sequences are given a1 <= a2 <= ... <= an and b1 <= b2 <= ... <= bm.
 * Form a new sequence from them numbers so that it is also non-decreasing.
 **/
public class SecondSortFunction implements Function<CustomArray> {

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
				CustomArray.initLineObjects(false, (int) variables[0], (int) variables[1]));
		array.setExtraArray(
				CustomArray.initLineObjects(true, false, (int) variables[1]));
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 2. Sorted One Dimension Array\n";
			addString[1] = "First sorted Array is";
			addString[2] = "Second sorted array is";
			addString[3] = "Resulting array is";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1],
					sortLineObjects(array.getFirstArray(), new SortByHigherObject().reversed())));
			resultList.add(array.getArray(addString[2],
					sortLineObjects(array.getExtraArray(), new SortByHigherObject().reversed())));
			resultList.add(array.getArray(addString[3],
					sortLineObjects(array.combineArrays(array.getFirstArray(), array.getExtraArray()),
							new SortByHigherObject().reversed())));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
