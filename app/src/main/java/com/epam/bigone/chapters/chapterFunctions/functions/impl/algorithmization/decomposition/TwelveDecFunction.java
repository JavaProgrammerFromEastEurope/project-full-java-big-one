package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import com.epam.bigone.app.util.Maths;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * Format of array A, whose elements
 * are numbers and sum of digits is equal to K and which are not greater than N
 **/
public class TwelveDecFunction implements Function<CustomArray> {

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
		for (int i = 1; i < variables[1]; i++) {
			if (Maths.sumOfNumberDigits(i) == variables[0]) {
				arrayList.add(i);
			}
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 12. Decomposition function\n";
			addString[1] = format("The Array with elements " +
					"those sum of digits equals %.0f and less then %.0f%n",
					variables[0], variables[1]);
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], new List[] { arrayList }));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}

}
