package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import java.util.ArrayList;
import java.util.List;

import com.epam.bigone.app.sortComparator.impl.function.SortByHigherObject;
import com.epam.bigone.app.util.Sort;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static com.epam.bigone.app.util.Sort.sortLineObjects;
import static java.lang.System.out;

/**
 * Sort by inserts.
 **/
public class FifthSortFunction implements Function<CustomArray> {

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
				CustomArray.initLineObjects(true, false, (int) variables[0]));
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 5. Sorted One Dimension Array\n";
			addString[1] = "General Array";
			addString[2] = "Insert sorted Array";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1],
					sortLineObjects(array.getFirstArray(),
							new SortByHigherObject())));
			Sort.sortInsert(array.getFirstArray());
			resultList.add(array.getArray(addString[2], array.getFirstArray()));
			return String.format("%s%n%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
