package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import com.epam.bigone.app.util.Maths;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;


/**
 * Determine which of the given two numbers has more digits.
 **/
public class EleventhDecFunction implements Function<CustomArray> {

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
		operation[0] = Maths.countOfElements((int) variables[0]);
		operation[1] = Maths.countOfElements((int) variables[1]);
		operation[2] = (operation[0] != operation[1])
						?  operation[0] > operation[1]
						?  variables[0] : variables[1] : 0;
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 11. Decomposition function ";
			addString[1] = " The number with max elements between";
			resultList.add(String.format("%s%n%s %.0f & %.0f is %.0f",
							addString[0], addString[1],
							variables[0], variables[1], operation[2]));
			return format("%n%s%n", List.of(resultList));
		} finally {
				Function.super.setDefaults();
		}
	}
}
