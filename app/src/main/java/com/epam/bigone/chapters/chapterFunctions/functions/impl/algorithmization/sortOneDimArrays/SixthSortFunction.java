package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.app.util.Sort;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * Shells sorting
 **/
public class SixthSortFunction implements Function<CustomArray> {

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
		array.setFirstArray(
				CustomArray.initLineObjects(false, false, (int) variables[0]));
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 6. Sorted One Dimension Array\n";
			addString[1] = " General Array:";
			addString[2] = " Sorted Array - Shells Method:";
			addString[3] = format("%s%s%n %s", addString[0], addString[1],
					array.getArray("", array.getFirstArray()));
			Sort.sortShells(array.getFirstArray());
			addString[4] = format("%s%n %s", addString[2],
					array.getArray("", array.getFirstArray()));
			return format("%n%s%s%n", addString[3], addString[4]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
