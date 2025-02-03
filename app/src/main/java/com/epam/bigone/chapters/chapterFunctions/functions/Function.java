package com.epam.bigone.chapters.chapterFunctions.functions;

import static com.epam.bigone.app.util.Input.anyIntInitialize;
import static com.epam.bigone.app.util.Input.doubleInitialize;
import static com.epam.bigone.app.util.Input.intInitialize;
import static java.lang.System.out;

import com.epam.bigone.app.util.Coordinate;
import com.epam.bigone.app.util.Input;
import com.epam.bigone.app.util.Tuple;

public interface Function<T> {

	String[] addString = new String[6];
	double[] variables = new double[6];
	double[] operation = new double[4];

	final String warning = ("\nThe Result of function printed on Server side.\n");

	default void inputVariables(
			int length, boolean bEvenValue, boolean bDouble) throws IllegalStateException {
		String evenLengthInvitation = " Enter even value ";
		String theValueOfVariable = " Enter any position value ";
		switch (length) {
			case 1: case 2: case 3:
			case 4: case 5: case 6:
				for (int index = 0; index < length; index++) {
					if (bEvenValue)
						do {
							out.printf("%s%c: ", evenLengthInvitation, (char) 78);
							variables[index] = intInitialize();
						} while (variables[index] % 2 == 1);
					else {
						out.printf("%s%c: ", theValueOfVariable, (char) (index + 77));
						variables[index] = bDouble
								? doubleInitialize()
								: intInitialize();
					}
				}
				return;
			default:
				throw new IllegalStateException("Unexpected value: " + length);
		}
	}

	default void inputAnyCoordinate(Coordinate[] coordinates) {
		int bound = coordinates.length;
		Coordinate coordinate;
		for (int i = 0, coordinatesLength = coordinates.length; i < coordinatesLength; i++) {
			coordinate = new Coordinate();
			out.printf("Enter the X coordinate: %d out of %d%n", i + 1, bound);
			coordinate.setX(anyIntInitialize());
			out.printf("Enter the Y coordinate: %d out of %d%n", i + 1, bound);
			coordinate.setY(anyIntInitialize());
			coordinates[i] = coordinate;
		}
	}

	default Tuple<Integer, Integer> inputAnyPositionOfTuple() {
		return new Tuple<>(
					anyIntInitialize("Input first:"),
					anyIntInitialize("input second:"));
	}

	default int inputPosition(int bound) {
		out.printf("Input a position that is below %d:", bound);
		return Input.inputPosition(bound);
	}

	default void setDefaults() {
		java.util.Arrays.fill(operation, 0);
		java.util.Arrays.fill(variables, 0);
		java.util.Arrays.fill(addString, null);
	}

	void calcFunction(T array);

	String getResultString(T array);
}