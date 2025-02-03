package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * You are given a sequence of integers a1, a2, ..., an.
 * Form a new sequence by throwing out the original terms
 * that are equal to min (a1, a2, ..., an)
 **/
public class EightOneDimFunction implements Function<CustomArray> {

	private TreeSet<Object> sortedElementsSet;
	private List<Object> numberElementArray;

	@Override
	public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
		try {
			Function.super.inputVariables(length, bEvenValue, bDouble);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}

	private void initArray(CustomArray array) {
		sortedElementsSet = new TreeSet<>();
		numberElementArray = new ArrayList<>();
		array.setFirstArray(CustomArray.initLineObjects(true, false, (int) variables[0]));
		sortedElementsSet.addAll(
				java.util.Arrays.asList(
					array.getFirstArray()).subList(0, array.getFirstArray().length));
	}

	@Override
	public void calcFunction(CustomArray array) {
		initArray(array);
		for (Object number : array.getFirstArray())
			if (!number.equals(sortedElementsSet.first()))
				numberElementArray.add(number);

	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 8. One Dimension Array";
			addString[1] = "\nGeneral Array:";
			addString[2] = "Lis of elements higher then min:";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], array.getFirstArray()));
			resultList.add(format("%s%n %s",
					addString[2], numberElementArray));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
