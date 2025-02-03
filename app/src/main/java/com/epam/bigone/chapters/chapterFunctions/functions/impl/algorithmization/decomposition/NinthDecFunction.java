package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * Given the numbers X, Y, Z, T - the lengths of the sides of the quadrilateral.
 * Write a method (methods) for calculating its area, +
 * if the angle between the sides of length X and Y is straight.
 **/
public class NinthDecFunction implements Function<CustomArray> {

	@Override
	public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
		try {
			out.println("Input the sides of quadrangle:");
			Function.super.inputVariables(length, bEvenValue, bDouble);
		} catch (IllegalStateException e) {
			e.getMessage();
		}
	}

	private double firstSquare(int x, int y) {
		return x * y * 0.5;
	}

	private double secondSquare(int d, int z, int t) {
		double p = (z + t + d) * 0.5;
		return Math.sqrt(p * (p - z) * (p - t) * (p - d));
	}

	@Override
	public void calcFunction(CustomArray array) {
		array.setFirstArray(new Number[] {
					(int) variables[0], (int) variables[1], (int) variables[2], (int) variables[3] });
		operation[0] = Math.sqrt((int) Math.pow((int) variables[0], 2)
				+ (int) Math.pow((int) variables[1], 2));
		operation[1] = firstSquare((int) variables[0], (int) variables[1]);
		operation[2] = secondSquare((int) operation[0], (int) variables[2], (int) variables[3]);
		operation[3] = operation[1] + operation[2];
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 9. Decomposition function\n";
			addString[1] = "The values - [x, y, z, t]:";
			addString[2] = "Area of a quadrangle";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], array.getFirstArray()));
			resultList.add(format(" %s %.0f", addString[2], operation[3]));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
