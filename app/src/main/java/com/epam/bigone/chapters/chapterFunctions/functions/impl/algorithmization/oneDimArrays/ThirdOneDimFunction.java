package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * An array of real numbers is given, the dimension of which is N.
 * Calculate how many negative numbers there are in it,
 * positive and zero elements.
 **/
public class ThirdOneDimFunction implements Function<CustomArray> {

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
		array.setFirstArray(CustomArray.initLineObjects(false, false, (int) variables[0]));
		for (Object number : array.getFirstArray()) {
				if ((double) number < 0) operation[2]++;
				else if ((double) number > 0) operation[1]++;
				else if ((double) number == 0) operation[0]++;
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
				var resultList = new ArrayList<>();
				out.println(Function.warning);
				addString[0] = " 3. One Dimension Array\n";
				addString[1] = "General Array"; addString[2] = "positive";
				addString[3] = "negative";      addString[4] = "equal";
				addString[5] = "elements";
				resultList.add(addString[0]);
				resultList.add(array.getArray(addString[1], array.getFirstArray()));
				resultList.add(format(" %s %s - %.0f, %s %s - %.0f, %s %s - %.0f",
								addString[2], addString[5], operation[1],
								addString[3], addString[5], operation[2],
								addString[4], addString[5], operation[0]));
				return format("%n%s%n", List.of(resultList));
		} finally {
				Function.super.setDefaults();
		}
	}
}
