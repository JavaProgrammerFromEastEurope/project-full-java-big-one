package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.stream.IntStream.rangeClosed;

import java.util.ArrayList;
import java.util.List;

import com.epam.bigone.app.util.Maths;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * Find all Armstrong numbers from 1 to k.
 **/
public class FourteenDecFunction implements Function<CustomArray> {

	List<Integer> arrayList;

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
		arrayList = new ArrayList<>();
		rangeClosed(1, (int) variables[0])
				.filter(this::isArmstrongNumber)
				.forEach(index -> arrayList.add(index));
	}

	private boolean isArmstrongNumber(int number) {
		return Maths.sumOfPowerElements(number) == number;
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 14. Decomposition function\n";
			addString[1] = String.format("The Armstrong numbers " +
					"from %d to %.0f", 1, variables[0]);
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], new Object[] { arrayList }));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
