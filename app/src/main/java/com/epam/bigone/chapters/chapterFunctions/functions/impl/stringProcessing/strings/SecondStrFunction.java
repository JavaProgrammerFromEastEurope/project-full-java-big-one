package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.strings;

import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;

/** The 'Word' to 'Letter' replacement **/
public class SecondStrFunction implements Function<ParagraphMap> {

	@Override
	public void calcFunction(ParagraphMap paragraph) {
		addString[1] = "Is the word great? How many words you can pronounce?";
		addString[2] = "word";
		addString[3] = "letter";
		addString[4] = addString[1].replaceAll(addString[2], addString[3]);
	}

	@Override
	public String getResultString(ParagraphMap paragraph) {
		try {
			out.println(Function.warning);
			addString[0] = " 2. String Function\n";
			addString[2] = " The natural string:";
			addString[3] = " The modified string:";
			return format("%n%s%s%n%s%n%s%n%s%n",
					addString[0], addString[2], addString[1],
					addString[3], addString[4]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
