package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;

/** The Cake is Fake **/
public class FourthStrBuilderFunction implements Function<ParagraphMap> {

	@Override
	public void calcFunction(ParagraphMap paragraph) {
		addString[1] = "informatics";
		addString[2] = format("%s%s%s", addString[1].charAt(7),
			addString[1].substring(3, 5), addString[1].charAt(7));

	}

	@Override
	public String getResultString(ParagraphMap paragraph) {
		try {
			out.println(Function.warning);
			addString[0] = " 4. String Builder Function\n";
			addString[3] = "The string:";
			addString[4] = "The result string:";
			return format("%n%s%s%n%s%n%s%n%s%n",
					addString[0], addString[3],
					addString[1], addString[4], addString[2]);
		} finally {
			Function.super.setDefaults();
		}
	}

}
