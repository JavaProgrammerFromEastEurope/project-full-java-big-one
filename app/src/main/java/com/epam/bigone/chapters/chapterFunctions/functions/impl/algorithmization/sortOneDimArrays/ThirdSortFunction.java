package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import com.epam.bigone.app.sortComparator.impl.function.SortByHigherObject;
import com.epam.bigone.app.util.Sort;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import static com.epam.bigone.app.util.Sort.sortLineObjects;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Sort by Selection.
 **/
public class ThirdSortFunction implements Function<CustomArray> {

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
		array.setFirstArray(CustomArray.initLineObjects(true, false, (int) variables[0]));
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			out.println(Function.warning);
			addString[0] = " 3. Sorted One Dimension Array\n";
			addString[1] = " General Array";
			addString[2] = " Sorted by Selection Array";
			addString[3] = format("%s %s", addString[0],
					array.getArray(addString[1],
							sortLineObjects(array.getFirstArray(),
									new SortByHigherObject().reversed())));
			Sort.sortSelection(array.getFirstArray());
			addString[4] = format("%s", array.getArray(addString[2], array.getFirstArray()));
			return format("%n%s%s%n", addString[3], addString[4]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
