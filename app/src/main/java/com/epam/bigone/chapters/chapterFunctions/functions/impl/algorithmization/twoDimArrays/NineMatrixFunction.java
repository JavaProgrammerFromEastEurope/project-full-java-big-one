package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import com.epam.bigone.app.util.Input;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * A matrix of non-negative numbers is given.
 * Calculate the sum of the items in each column.
 * Determine which the column contains the maximum amount
 **/
public class NineMatrixFunction implements Function<CustomArray> {

	private List<Number> numberElementArray;

	@Override
	public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
		try {
			variables[0] = Input.anyIntInitialize("Enter any positive value:");
			variables[1] = variables[0];
		} catch (IllegalStateException e) {
			e.getMessage();
		}
	}

	@Override
	public void calcFunction(CustomArray array) {
		numberElementArray = new ArrayList<>();
		array.setMatrix(CustomArray.initMatrix((int) variables[0], (int) variables[1]));
		for (int i = 0; i < variables[0]; i++) {
			for (int j = 0; j < variables[1]; j++) {
				operation[0] += (int) array.getMatrix()[j][i];
			}
			numberElementArray.add((int) operation[0]);
			if ((int) operation[1] < operation[0]) {
				operation[1] = (int) operation[0];
				operation[2] = i + 1;
			}
			operation[0] = 0;
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = "9. Matrix\n";
			addString[1] = "Max column value";
			addString[2] = "The column itself";
			addString[3] = "The sum of elements at columns\n";
			resultList.add(format("%n%s %s%n", addString[0],
				array.setFormattedMatrix(array.getMatrix())));
			resultList.add(array.getArray(addString[3],
					numberElementArray.toArray()));
			resultList.add(format("%s - %.0f,%n - %s %.0f",
					addString[1], operation[1],
					addString[2], operation[2]));
			return format("%n%s%n", resultList);
		} finally {
			Function.super.setDefaults();
		}
	}
}
