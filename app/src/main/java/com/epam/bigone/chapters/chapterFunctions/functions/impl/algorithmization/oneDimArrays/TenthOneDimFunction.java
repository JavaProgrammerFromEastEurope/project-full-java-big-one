package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Arrays.copyOf;

/**
 * An integer array is given with the number of elements n.
 * Compress the array by throwing out every second element (fill the vacated
 * elements with zeros).
 * Note. Do not use additional array.
 **/
public class TenthOneDimFunction implements Function<CustomArray> {

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
	}

	private void makeCalculation(CustomArray array) {
		int localBound = array.getFirstArray().length;
		int index = 0;
		for (int step = 0; step < localBound; step += 2) {
			array.getFirstArray()[index++] = array.getFirstArray()[step];
		}
		array.setFirstArray(copyOf(array.getFirstArray(),
				(localBound + array.getFirstArray().length % 2) / 2));
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 10. One Dimension Array\n";
			addString[1] = " General Array";
			addString[3] = " Array compressed by double:";
			addString[2] = format("%s%s%n%s%n", addString[0],
					addString[1], List.of(array.getFirstArray()));
			resultList.add(addString[2]);
			makeCalculation(array);
			resultList.add(format("%s",
					List.of(array.getArray(addString[3], array.getFirstArray()))));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
