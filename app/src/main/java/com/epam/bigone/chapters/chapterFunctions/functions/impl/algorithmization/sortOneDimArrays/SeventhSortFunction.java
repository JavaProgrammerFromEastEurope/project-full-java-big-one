package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import com.epam.bigone.app.util.Sort;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Arrays.*;

/**
 * It is required to indicate the places where you want to insert
 * the elements of the sequence in the first sequence.
 **/
public class SeventhSortFunction implements Function<CustomArray> {

	private List<Double> firstList;
	private List<Double> secondList;
	private List<Integer> indexesList;

	@Override
	public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
		try {
			Function.super.inputVariables(length, bEvenValue, bDouble);
		} catch (IllegalStateException e) {
			e.getMessage();
		}
	}

	private List<Double> initArrayList(int bound) {
		return stream(
				Sort.sortHoare(
						CustomArray.initLineObjects(false, false, bound), 0, bound - 1))
				.map(object -> (double) object)
				.collect(Collectors.toCollection(ArrayList::new));
	}

	private ArrayList<Integer> getIndexes(List<Double> firstSample, List<Double> secondSample) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < secondSample.size(); i++) {
			int index = Collections.binarySearch(firstSample, secondSample.get(i));
			if (index < 0)
				list.add(-(index + 1) + i);
			else
				list.add(index + i);
		}
		return list;
	}

	@Override
	public void calcFunction(CustomArray array) {
		firstList  = initArrayList((int) variables[0]);
		secondList = initArrayList((int) variables[1]);
		indexesList = getIndexes(firstList, secondList);
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 7. Sorted One Dimension Array\n";
			addString[1] = "First Array - Sort of Hoare:";
			addString[2] = "Second Array - Sort of Hoare:";
			addString[3] = "Places to insert sequence elements:";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], firstList.toArray()));
			resultList.add(array.getArray(addString[2], secondList.toArray()));
			resultList.add(array.getArray(addString[3], new List[] { indexesList }));
			for (int i = 0; i < indexesList.size(); i++)
				firstList.add(indexesList.get(i), secondList.get(i));
			resultList.add(array.getArray("Result Array", firstList.toArray()));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
