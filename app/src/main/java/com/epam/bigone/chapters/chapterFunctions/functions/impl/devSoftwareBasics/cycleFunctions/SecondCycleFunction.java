package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import com.epam.bigone.app.util.Input;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 1. Write a program where the user enters any positive integer.
 * And the program sums up all numbers from 1 to a user-entered number.
 **/
public class SecondCycleFunction implements Function<CustomArray> {

	private TreeMap<Integer, Integer> iTreeMap;

	@Override
	public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
		try {
			variables[0] = Input.anyIntInitialize("Start segment:");
			variables[1] = Input.anyIntInitialize("End segment:");
			variables[2] = Input.anyIntInitialize("Step:");
		} catch (IllegalStateException e) {
			e.getMessage();
		}
	}

	@Override
	public void calcFunction(CustomArray array) {
		iTreeMap = new TreeMap<>();
		for (int i = (int) variables[0]; i <= variables[1]; i += variables[2]) {
			iTreeMap.put(i, i > 2 ? i : -i);
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 2. Cycle function ";
			addString[1] = " The values of function on array - ";
			resultList.add(format("%s%n%s[%.0f,%.0f] with step %.0f:%n",
					addString[0], addString[1],
					variables[0], variables[1], variables[2]));
			iTreeMap.forEach((key, value) -> resultList.add(format("[%d : %s] ", key, value)));
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
