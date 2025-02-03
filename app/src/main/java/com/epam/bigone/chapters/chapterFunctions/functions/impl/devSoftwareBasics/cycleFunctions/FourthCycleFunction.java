package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import static java.lang.String.format;
import static java.lang.System.out;

import java.math.BigInteger;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 4. Make a program for finding the multiplication of the squares of the first
 * two hundred numbers.
 **/
public class FourthCycleFunction implements Function<CustomArray> {

	private BigInteger bigInteger;

	@Override
	public void calcFunction(CustomArray array) {
		bigInteger = BigInteger.valueOf(1L);
		for (int index = 2; index <= 200; index++) {
			bigInteger = bigInteger.multiply(BigInteger.valueOf((long) Math.pow(index, 2)));
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 4. Cycle function ";
			addString[1] = " Multiplication of the squares of the first two hundred numbers:";
			return format("%n%s%n%s%n %d %n", addString[0], addString[1], bigInteger);
		} finally {
			Function.super.setDefaults();
		}
	}
}
