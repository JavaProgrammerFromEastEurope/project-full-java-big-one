package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.IntStream;

import com.epam.bigone.app.util.Maths;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * Find all natural n-digit numbers whose digits form a strictly increasing
 * sequence.
 **/
public class FifteenDecFunction implements Function<CustomArray> {

	TreeSet<Integer> treeSet;

	@Override
	public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
		try {
			variables[0] = Function.super.inputPosition(10);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void calcFunction(CustomArray array) {
		treeSet = new TreeSet<>();
		IntStream.rangeClosed(Maths.setDimension((int) variables[0]),
				Maths.setDimension((int) variables[0] + 1))
				.filter(Maths::isStrictlyOrderedSequence)
				.forEach(index -> treeSet.add(index));
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 15. Decomposition function";
			addString[1] = format("\n The Strictly Ordered Sequence to %.0f%n", variables[0]);
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], new Object[] { treeSet }));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
