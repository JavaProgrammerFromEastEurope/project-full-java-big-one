package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.linearFunctions;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.String.*;
import static java.lang.System.out;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 2. Calculate the value of the expression using the formula (all variables are
 * valid):
 * (𝑏 + √𝑏2 + 4𝑎𝑐) / 2𝑎 − 𝑎3𝑐 + 𝑏−2
 **/
public class SecondLinearFunction implements Function<CustomArray> {

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
						/* sqrt(b^2 + 4ac) */
		operation[0] = sqrt(pow(variables[1], 2) + (4 * variables[0] * variables[2]));
						/* (b + sqrt(b^2 + 4ac)) / 2a */
		operation[1] = (variables[1] + operation[0]) / (2 * variables[0]);
						/* a^3c + b^-2 */
		operation[2] = pow(variables[0], 3) * variables[2] + pow(variables[1], -2);
						/* ((b + sqrt(b^2 + 4ac)) / 2a) - (a^3c + b^-2) */
		operation[3] = operation[1] - operation[2];
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = format("2. Linear Function:\n" +
					" ((%.0f + sqrt(%.0f^2 + 4*%.0f*%.0f)) / 2*%.0f)" +
					" - (%.0f^3*%.0f + %.0f^-2) =",
					variables[1], variables[1], variables[0],
					variables[2], variables[0], variables[0],
					variables[2], variables[1]);
			return format("%n%s %.1f%n", addString[0], operation[3]);
		} finally {
			Function.super.setDefaults();
		}
	}

}
