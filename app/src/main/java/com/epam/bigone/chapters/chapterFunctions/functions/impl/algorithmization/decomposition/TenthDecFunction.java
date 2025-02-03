package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import com.epam.bigone.app.util.Maths;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * Forming an array, the elements of which
 * are the digits of the number N
 **/
public class TenthDecFunction implements Function<CustomArray> {

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
		operation[0] = variables[0];
		operation[1] = Maths.countOfElements((int) variables[0]);
		array.setFirstArray(new Number[(int) operation[0]]);
		for (int i = (int) operation[1]; i > 0; i--) {
			array.getFirstArray()[i] = (int) operation[0] % 10;
			operation[0] /= 10;
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 10. Decomposition function\n";
			addString[1] = "The Array with elements of a variable";
			resultList.add(addString[0]);
			resultList.add(array.getArray(format("%s %d", addString[1],
					(int) variables[0]), array.getFirstArray()));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
