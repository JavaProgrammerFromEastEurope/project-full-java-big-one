package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import java.util.ArrayList;
import java.util.List;

import com.epam.bigone.app.util.Coordinate;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static com.epam.bigone.app.util.Coordinate.getDistance;
import static java.lang.Math.abs;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Determine between which
 * of pairs of points, the greatest distance.
 **/
public class FourthDecFunction implements Function<CustomArray> {

	private Coordinate[] coordinates;

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
		coordinates = new Coordinate[(int) variables[0]];
		Function.super.inputAnyCoordinate(coordinates);
		double maxDistance;
		for (int i = 0; i < variables[0] - 1; i++) {
			for (int j = i + 1; j < variables[0]; j++) {
				maxDistance = Coordinate.getDistance(
						coordinates[i].getX(), coordinates[i].getY(),
						coordinates[j].getX(), coordinates[j].getY());
				if (operation[0] < maxDistance) {
					operation[0] = maxDistance;
				}
			}
		}
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 4. Decomposition function\n";
			resultList.add(addString[0]);
			for (int i = 0; i < variables[0] - 1; i++) {
				for (int j = i + 1; j < variables[0]; j++)
					if (abs(getDistance(
							coordinates[i].getX(), coordinates[i].getY(),
							coordinates[j].getX(), coordinates[j].getY()) - operation[0]) == 0) {
						resultList.add(format("Pair of point with max distance(%d:[%d,%d], %d:[%d,%d])%n",
								i + 1, coordinates[i].getX(), coordinates[i].getY(),
								j + 1, coordinates[j].getX(), coordinates[j].getY()));
					}
			}
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
