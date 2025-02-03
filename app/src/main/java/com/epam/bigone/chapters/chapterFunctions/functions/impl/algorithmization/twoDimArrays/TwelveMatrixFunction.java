package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import static java.lang.String.format;

import com.epam.bigone.app.sortComparator.impl.function.SortByHigherObject;
import com.epam.bigone.app.util.Sort;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static java.lang.System.out;

/**
 * Sort matrix rows in ascending and descending order of element values.
 **/
public class TwelveMatrixFunction implements Function<CustomArray> {

	@Override
	public void calcFunction(CustomArray array) {
		variables[0] = 10;
		variables[1] = 20;
		array.setMatrix(CustomArray.initMatrix((int) variables[0], (int) variables[1]));
		System.out.println("Method is working");
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 12. Matrix\n";
			addString[1] = " Sorting matrix rows in ascending and descending order\n";
			addString[2] = format("%s %s", addString[1], array.setFormattedMatrix(array.getMatrix()));
			addString[3] = format("%s",
					array.setFormattedMatrix(Sort.sortMatrixObjects(array.getMatrix(),
							new SortByHigherObject())));
			addString[4] = format("%s",
					array.setFormattedMatrix(Sort.sortMatrixObjects(array.getMatrix(),
							new SortByHigherObject().reversed())));
			System.out.println("Method is working");
			return format("%n%s%s%s%s%n", addString[0],
					addString[2], addString[3], addString[4]);
		} finally {
			Function.super.setDefaults();

		}
	}
}
