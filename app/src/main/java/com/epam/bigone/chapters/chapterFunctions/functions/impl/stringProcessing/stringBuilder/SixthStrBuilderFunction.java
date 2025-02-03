package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import static java.lang.String.*;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.StringList;

/** Double every string character **/
public class SixthStrBuilderFunction implements Function<ParagraphMap> {

	StringList stringList = new StringList();

	@Override
	public void calcFunction(ParagraphMap paragraph) {
		addString[1] = "Sample text string";
		stringList.setStringBuilder(new StringBuilder(addString[1]));
		for (int i = 0; i < addString[1].length(); i++) {
			stringList.getStringBuilder().insert(i + i, addString[1].charAt(i));
		}
	}

	@Override
	public String getResultString(ParagraphMap paragraph) {
		try {
			out.println(Function.warning);
			addString[0] = " 6. String Builder Function\n";
			addString[2] = "The string:";
			addString[3] = "The result string:";
			return format("%n%s%s%n%s%n%s%n%s%n",
					addString[0], addString[2],
					addString[1], addString[3], stringList.getStringBuilder());
		} finally {
			Function.super.setDefaults();
		}
	}
}
