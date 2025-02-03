package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * A sequence of real numbers a1, a2, ..., an is given.
 * Replace all its members larger than the given Z with this number.
 * Count the number of substitutions.
 **/
public class SecondOneDimFunction implements Function<CustomArray> {

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
		array.setExtraArray(array.getFirstArray().clone());
		int bound = array.getFirstArray().length;
		for (int index = 0; index < bound; index++) {
			if ((double) array.getFirstArray()[index] > variables[1]) {
				array.getFirstArray()[index] = variables[1];
				operation[0]++;
			}
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 2. One Dimension Array\n";
			addString[1] = "General Array";
			addString[2] = "Modified array";
			addString[3] = "with elements higher then";
			addString[4] = "number of replacements";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], array.getExtraArray()));
			resultList.add(array.getArray(addString[2], array.getFirstArray()));
			resultList.add(format(" %s %.0f %s %.0f%n%n",
					addString[4], operation[0], addString[3], variables[1]));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}