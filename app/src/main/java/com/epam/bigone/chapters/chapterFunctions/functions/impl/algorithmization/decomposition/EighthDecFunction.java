package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import com.epam.bigone.app.util.Maths;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Determine the following sums:
 * D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
 **/
public class EighthDecFunction implements Function<CustomArray> {

	@Override
	public void calcFunction(CustomArray array) {
		array.setFirstArray(CustomArray.initLineObjects(true, true, 6));
		Integer[] firstArray = java.util.Arrays.stream(array.getFirstArray())
				.map(Object::toString).map(Integer::valueOf).toArray(Integer[]::new);
		operation[0] = Maths.sumOfIndexValues(firstArray, 1, 3);
		operation[1] = Maths.sumOfIndexValues(firstArray, 3, 5);
		operation[2] = Maths.sumOfIndexValues(firstArray, 4, 6);
	}

	@Override
	public String getResultString(CustomArray array) {
			try {
				var resultList = new ArrayList<>();
				out.println(Function.warning);
				addString[0] = " 8. Decomposition function ";
				addString[1] = "\n The integer array itself:";
				addString[2] = "Sum of elements between elements";
				resultList.add(addString[0]);
				resultList.add(array.getArray(addString[1], array.getFirstArray()));
				resultList.add(
								format(" %s 1 & 3: %.0f%n " +
												"%s 3 & 5: %.0f%n " +
												"%s 4 & 6: %.0f%n",
								addString[2], operation[0], addString[2],
								operation[1], addString[2], operation[2]));
				return format("%n%s%n", List.of(resultList));
		} finally {
				Function.super.setDefaults();
		}
	}
}
