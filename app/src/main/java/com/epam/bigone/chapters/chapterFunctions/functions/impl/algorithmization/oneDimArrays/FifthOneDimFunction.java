package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * Integers a1, a2, ..., aN - are given.
 * Print only those numbers for which aI > I.
 **/
public class FifthOneDimFunction implements Function<CustomArray> {

	private List<Object> numberElementArray;

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
		array.setFirstArray(CustomArray.initLineObjects(true, true, (int) variables[0]));
		numberElementArray = new ArrayList<>();
		java.util.stream.IntStream.range(0, array.getFirstArray().length)
				.filter(index -> (int) array.getFirstArray()[index] > index)
				.forEach(index -> numberElementArray.add(array.getFirstArray()[index]));
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 5. One Dimension Array";
			addString[1] = "\nGeneral Array:";
			addString[2] = "List of elements higher then index:";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], array.getFirstArray()));
			resultList.add(format("%s%n %s",
					addString[2], numberElementArray));
			return format("%s%n%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}