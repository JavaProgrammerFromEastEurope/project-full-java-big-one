package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import com.epam.bigone.app.util.Maths;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * The sum of its digits was subtracted from the given number.
 * The sum of its digits was again subtracted from the result, etc.
 * How many such actions need to be performed to get zero?
 **/
public class SeventeenthDecFunction implements Function<CustomArray> {

	@Override
	public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
		try {
			variables[0] = Function.super.inputPosition(123500);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}

	private long countOfOperations(int number, int sumOfElements) throws StackOverflowError {
		return number <= sumOfElements ? 1
				: 1L + countOfOperations(
						number - sumOfElements, sumOfElements);
	}

	@Override
	public void calcFunction(CustomArray array) {
		operation[0] = variables[0];
		operation[1] = Maths.sumOfNumberDigits((int) operation[0]);
		try {
			operation[2] = this.countOfOperations((int) operation[0], (int) operation[1]);
		} catch (Exception e) {
			out.println(e.getMessage());
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 17. Decomposition function";
			addString[1] = "The number:";
			addString[2] = format("The sum of number digits[%.0f]", operation[1]);
			addString[3] = format("Count of operations[%.0f] to achieve zero", operation[2]);
			resultList.add(format("%s%n %s[%.0f]%n %s%n %s",
					addString[0], addString[1], variables[0],
					addString[2], addString[3]));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
