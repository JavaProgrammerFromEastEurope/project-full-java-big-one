package com.epam.bigone.chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

/**
 * 6. Display the correspondences between symbols
 * and their numerical designations in the computer memory.
 **/
public class SixthCycleFunction implements Function<CustomArray> {

	@Override
	public void calcFunction(CustomArray array) {
		/** Empty Method **/
	}

	@Override
	public String getResultString(CustomArray array) {
		var resultList = new ArrayList<>();
		for (int i = 200000; i <= 250000; i++) {
			if (i % 15 == 0) {
				resultList.add("\n");
			}
			resultList.add(format("- [%d:%c] ", i, (char) (i)));
		}
		try {
			out.println(Function.warning);
			addString[0] = " 6. Cycle function ";
			return format("%n%s%n%s%n", addString[0], List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
