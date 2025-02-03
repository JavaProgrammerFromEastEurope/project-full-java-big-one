package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.List;
import java.util.ArrayList;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Fill the 10x20 matrix with random numbers from 0 to 15.
 * Display the matrix itself and the row numbers,
 * in which the number 5 occurs three or more times.
 **/

public class ElevenMatrixFunction implements Function<CustomArray> {

	private List<Number> numberElementArray;

	private void initArray(CustomArray array) {
		numberElementArray = new ArrayList<>();
		variables[0] = 10;
		variables[1] = 20;
		array.setMatrix(
				CustomArray.initMatrix((int) variables[0], (int) variables[1]));
	}

	@Override
	public void calcFunction(CustomArray array) {
		this.initArray(array);
		for (int i = 0; i < variables[0]; i++) {
			for (int j = 0; j < variables[1]; j++) {
				if (array.getMatrix()[i][j].equals(5))
					operation[0]++;
			}
			if (operation[0] >= 3)
				numberElementArray.add(i + 1);
			operation[0] = 0;
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 11. Matrix\n";
			addString[1] = " Numbers of lines in which number '5'" +
					" occurs three or more times:";
			System.out.println("Method is working");
			return format("%n%s %s%s%n",
					addString[0], array.setFormattedMatrix(array.getMatrix()),
					array.getArray(addString[1], numberElementArray.toArray()));
		} finally {
			Function.super.setDefaults();
		}
	}
}
