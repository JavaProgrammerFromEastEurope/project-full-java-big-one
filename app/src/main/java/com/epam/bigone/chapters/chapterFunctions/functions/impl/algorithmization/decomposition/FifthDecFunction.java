package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import com.epam.bigone.app.util.Maths;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

/**
 * Print a number, which is less than the maximum element of the array,
 * but more than all other elements.
 **/
public class FifthDecFunction implements Function<CustomArray> {

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
		operation[0] = Maths.previousMax(java.util.Arrays.stream(array.getFirstArray())
				.map(Object::toString).map(Integer::valueOf).toArray(Integer[]::new));
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 5. Decomposition function\n";
			addString[1] = " The Array:";
			addString[2] = " The Next Before Max element is:";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], array.getFirstArray()));
			resultList.add(format("%s %.0f",
					addString[2], operation[0]));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
