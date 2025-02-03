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
 * Find and print all pairs of "twins" from the segment [n, 2n],
 * where n is a given natural number greater than 2
 **/
public class ThirteenDecFunction implements Function<CustomArray> {

	List<Integer> arrayList;

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
		arrayList = new ArrayList<>();
		rangeClosed((int) variables[0], (int) (2 * variables[0] - 2))
				.filter(this::isPrimeNumber)
				.forEach(index -> arrayList.add(index));
	}

	private boolean isPrimeNumber(int index) {
		return Maths.isPrimeNumber(index)
				&& Maths.isPrimeNumber(index + 2);
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 13. Decomposition function\n";
			addString[1] = format(" General Array with twins prime numbers " +
					"from %.0f to %.0f%n", variables[0], variables[0] * 2);
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], new List[] { arrayList }));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
