package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.linearFunctions;

import static java.lang.String.format;
import static java.lang.String.valueOf;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 4. You are given a real number R of the form nnn.ddd (three digital digits in
 * fractional and integer parts).
 * Swap fractional and integer parts of the number and display the resulting
 * value of the number.
 * use input with comma -',', not dot '.'
 **/
public class FourthLinearFunction implements Function<CustomArray> {

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
		/** Empty method */
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 4. Linear function ";
			addString[1] = " The number write back of ";
			String[] splitter = valueOf(variables[0]).split("\\.");
			return format("%n%s%n%s%.3f - %.3f %n",
					addString[0], addString[1], variables[0],
					Double.parseDouble(format("%s.%s", splitter[1], splitter[0])));
		} finally {
			Function.super.setDefaults();
		}
	}
}
