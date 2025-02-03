package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import com.epam.bigone.app.util.Maths;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

public class SixthDecFunction implements Function<CustomArray> {

	@Override
	public void calcFunction(CustomArray array) {
		array.setFirstArray(CustomArray.initLineObjects(true, true, 3));
	}

	private boolean areCoprimes(int first, int second, int third) {
		return Maths.gcd(Maths.gcd(first, second), third) == 1;
	}

	@Override
	public String getResultString(CustomArray array) {
		try {
			var resultList = new ArrayList<>();
			out.println(Function.warning);
			addString[0] = " 6. Decomposition function\n";
			addString[1] = " The Array itself: ";
			resultList.add(addString[0]);
			resultList.add(array.getArray(addString[1], array.getFirstArray()));
			resultList.add(
					areCoprimes((int) array.getFirstArray()[0], (int) array.getFirstArray()[1], (int) array.getFirstArray()[2])
							? "Numbers are coprimes"
							: "Numbers are not coprimes");
			resultList.add(
					Maths.gcd((int) array.getFirstArray()[0], (int) array.getFirstArray()[1]) == 1 &&
							Maths.gcd((int) array.getFirstArray()[1], (int) array.getFirstArray()[2]) == 1 &&
							Maths.gcd((int) array.getFirstArray()[2], (int) array.getFirstArray()[0]) == 1
									? "and which pairwise coprimes \n"
									: "and which not pairwise coprimes \n");
			return format("%n%s%n", List.of(resultList));
		} finally {
			Function.super.setDefaults();
		}
	}
}
