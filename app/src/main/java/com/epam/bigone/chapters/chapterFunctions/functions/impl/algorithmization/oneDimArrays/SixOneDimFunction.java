package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import java.util.ArrayList;
import java.util.List;

import com.epam.bigone.app.util.Maths;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.stream.IntStream.range;

/**
 * Calculate the sum of numbers whose ordinal numbers
 * are prime numbers.
 **/
public class SixOneDimFunction implements Function<CustomArray> {

	@Override
	public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
		try {
			Function.super.inputVariables(length, bEvenValue, bDouble);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void calcFunction(CustomArray array) {
		array.setFirstArray(CustomArray.initLineObjects(false, true, (int) variables[0]));
		range(0, array.getFirstArray().length)
				.filter(Maths::isPrimeNumber)
				.forEach(index -> operation[0] += (double) array.getFirstArray()[index]);
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 6. One Dimension Array\n";
			addString[1] = "General Array";
			addString[2] = "Sum of numbers whose ordinal indexes are prime";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], array.getFirstArray()));
			resultList.add(format(" %s - %.3f", addString[2], operation[0]));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}

}
