package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Arrays.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import com.epam.bigone.app.util.Maths;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * Find all natural n-digit numbers whose digits form a strictly increasing
 * sequence.
 **/
public class SixteenDecFunction implements Function<CustomArray> {

	List<Integer> oddElTreeSet;

	private boolean isStrictlyOddNumber(int number) {
		return Maths.isStrictlyOddNumberSequence(number);
	}

	private void initOddElementTreeSet() {
		oddElTreeSet = new ArrayList<>();
		IntStream.rangeClosed(Maths.setDimension((int) variables[0]),
				Maths.setDimension((int) variables[0] + 1))
				.filter(this::isStrictlyOddNumber)
				.forEach(index -> oddElTreeSet.add(index));
	}

	private int sumOfOddElementsTreeSet() {
		Integer[] sampleArray = stream(oddElTreeSet.toArray())
				.map(Object::toString).map(Integer::valueOf).toArray(Integer[]::new);
		return Maths.sumOfIndexValues(sampleArray, 1, oddElTreeSet.size());
	}

	@Override
	public void calcFunction(CustomArray array) {
		variables[0] = inputPosition(6);
		this.initOddElementTreeSet();
		operation[0] = sumOfOddElementsTreeSet();
		operation[1] = Maths.countOfEvenElements((int) operation[0]);
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 16. Decomposition function\n";
			addString[1] = format("The Strictly Odd Numbers Sequence " +
					"to %.0f%n", variables[0]);
			addString[2] = format("The Sum of Odd Numbers is %.0f", operation[0]);
			addString[3] = format("The Number of even digits of Odd Number Sum " +
					"is %.0f", operation[1]);
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], new Object[] { oddElTreeSet }));
			resultList.add(format("%s %n%s", addString[2], addString[3]));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
