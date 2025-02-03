package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.lang.Math.max;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Find the most frequent number in an array of integers with n elements. If
 * such there are several numbers, then determine the smallest of them
 **/
public class NinthOneDimFunction implements Function<CustomArray> {

	private TreeMap<Object, Integer> treeMap;
	private TreeSet<Object> sortedElementsSet;

	@Override
	public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
		try {
			Function.super.inputVariables(length, bEvenValue, bDouble);
		} catch (IllegalStateException e) {
			e.getMessage();
		}
	}

	private void initArray(CustomArray array) {
		sortedElementsSet = new TreeSet<>();
		array.setFirstArray(CustomArray.initLineObjects(true, false, (int) variables[0]));
		sortedElementsSet.addAll(
				java.util.Arrays.asList(array.getFirstArray()).subList(0, array.getFirstArray().length));
	}

	private void initTreeMap() {
		treeMap = new TreeMap<>();
		int localBound = sortedElementsSet.size();
		for (int index = 0; index < localBound; index++) {
			treeMap.put(sortedElementsSet.pollFirst(), 0);
		}
	}

	private void incValueMap(CustomArray array) {
		for (Object number : array.getFirstArray()) {
			treeMap.put(number, treeMap.get(number) + 1);
			operation[0] = max(operation[0], treeMap.get(number));
		}
	}

	private void addMaxValueToSet() {
		treeMap.forEach((key, value) -> {
			if (value.equals((int) operation[0])) {
				sortedElementsSet.add(key);
			}
		});
	}

	@Override
	public void calcFunction(CustomArray array) {
		initArray(array);
		initTreeMap();
		incValueMap(array);
		addMaxValueToSet();
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 9. One Dimension Array\n";
			addString[1] = "Most frequent number key (lowest)";
			addString[2] = "The Map with key - array number, and value - frequent number:\n";
			resultList.add(addString[0]);
			resultList.add(addString[2]);
			treeMap.forEach((key, value) -> resultList.add(format(" [ %s : %d ]", key, value)));
			resultList.add(format("%n %s[%s]", addString[1], sortedElementsSet.first()));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
