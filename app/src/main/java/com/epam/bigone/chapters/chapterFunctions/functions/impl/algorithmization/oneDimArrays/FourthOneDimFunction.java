package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * You are given real numbers a1, a2, ..., an.
 * Swap the largest and smallest items.
 **/
public class FourthOneDimFunction implements Function<CustomArray> {

	private TreeSet<Object> sortedElementsSet;

	private void initArray(CustomArray array) {
		sortedElementsSet = new TreeSet<>();
		array.setFirstArray(CustomArray.initLineObjects(true, true, (int) variables[0]));
		sortedElementsSet.addAll(java.util.Arrays.asList(
				array.getFirstArray()).subList(0, array.getFirstArray().length));
		array.setExtraArray(array.getFirstArray().clone());
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
		this.initArray(array);
		int localBound = array.getFirstArray().length;
		for (int index = 0; index < localBound; index++) {
			if (array.getFirstArray()[index].equals(sortedElementsSet.first())) {
				array.getFirstArray()[index] = sortedElementsSet.last();
			} else if (array.getFirstArray()[index].equals(sortedElementsSet.last())) {
				array.getFirstArray()[index] = sortedElementsSet.first();
			}
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
				var resultList = new ArrayList<>();
				out.println(Function.warning);
				addString[0] = " 4. One Dimension Array\n";
				addString[1] = "General Array"; addString[2] = "Modified Array";
				addString[3] = "largest";       addString[4] = "smallest";
				addString[5] = "element";
				resultList.add(addString[0]);
				resultList.add(array.getArray(addString[1], array.getExtraArray()));
				resultList.add(array.getArray(addString[2], array.getFirstArray()));
				resultList.add(format(" %s %s - %s, %s %s - %s",
								addString[3], addString[5], sortedElementsSet.last(),
								addString[4], addString[5], sortedElementsSet.first()));
				return format("%n%s%n", List.of(resultList));
		} finally {
				Function.super.setDefaults();
		}
	}
}