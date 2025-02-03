package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.linearFunctions;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.stream.IntStream;

import com.epam.bigone.app.util.Coordinate;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 6. For a given area, compose a linear program that prints true - if the point with coordinates (x, y)
 * belongs to the filled area, and false - otherwise.
 **/
public class SixthLinearFunction implements Function<CustomArray>{

	private boolean bTotal, bSide;
	private Coordinate[] coordinates;

	private boolean checkAreaX(int start, int finish, int x) {
			return IntStream.rangeClosed(start, finish)
							.filter(index -> index != 0)
							.anyMatch(index -> x == index);
	}

	private boolean checkAreaY(int start, int finish, int y) {
			return IntStream.rangeClosed(start, finish)
							.anyMatch(index -> y == index);
	}

	@Override
	public void calcFunction(CustomArray array) {
			bSide = false;
			coordinates = new Coordinate[(int) 1];
			Function.super.inputAnyCoordinate(coordinates);
			bTotal = (checkAreaX(-2, 2, coordinates[0].getX())
							&& checkAreaY(1, 4, coordinates[0].getY())
							? bSide = true
							: (checkAreaX(-4, 4,  coordinates[0].getX())
							&& checkAreaY(-3, -1, coordinates[0].getY())));
	}

	@Override
	public String getResultString(CustomArray array) {
			try {
					out.println(Function.warning);
					addString[5] = " 6. Linear function ";
					addString[0] = "upper side"; addString[1] = "below side";
					addString[2] = "other side"; addString[3] = " The point with parameters: ";
					addString[4] = bTotal ? bSide ? addString[0] : addString[1] : addString[2];
					return format("%n%s%n%s[%d,%d] - %s%n",
									addString[5], addString[3],coordinates[0].getX(),
									coordinates[0].getY(), addString[4]);
			} finally {
					Function.super.setDefaults();
			}
	}
}