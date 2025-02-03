package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import static com.epam.bigone.app.util.CharArrays.sumOfSequenceChar;
import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;

public class FirstStrBuilderFunction implements Function<ParagraphMap> {

	@Override
	public void calcFunction(ParagraphMap paragraph) {
		addString[1] = "So perhaps,  you've  generated some fancy text, and you're content that you can now\n" +
				" copy and paste your fancy text in   the comments section of funny cat videos, but perhaps\n" +
				" you're wondering how  it's even     possible to change     the font of your text?";
		for (int i = 0; i < addString[1].length(); i++) {
			if (addString[1].toCharArray()[i] == ' ') {
				operation[0] = sumOfSequenceChar(addString[1].toCharArray(), i, ' ');
				if (operation[1] < operation[0]) {
						operation[1] = operation[0];
				}
			}
		}
	}

	@Override
	public String getResultString(ParagraphMap paragraph) {
		try {
			out.println(Function.warning);
			addString[0] = " 1. String Builder Function\n";
			addString[3] = "The string:";
			addString[4] = "The Max number in a sequence of a space literal in a string:";
			return format("%n%s%s%n%s%n%s %.0f%n",
					addString[0], addString[3],
					addString[1], addString[4], operation[1]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
