package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.StringList;

public class SecondStrBuilderFunction implements Function<ParagraphMap> {

	StringList stringList = new StringList();

	@Override
	public void calcFunction(ParagraphMap paragraph) {
		addString[1] = "So perhaps,  you've  generated some fancy text, and you're content that you can now\n" +
				" copy and paste your fancy text in   the comments section of funny cat videos, but perhaps\n" +
				" you're wondering how  it's even     possible to change     the font of your text?";

		stringList.setStringBuilder(new StringBuilder(addString[1]));
		for (int i = 0; i < stringList.getStringBuilder().length(); i++) {
			if (stringList.getStringBuilder().charAt(i) == 'a') {
					stringList.getStringBuilder().insert(i + 1,'b');
			}
		}
	}

	@Override
	public String getResultString(ParagraphMap paragraph) {
		try {
			out.println(Function.warning);
			addString[0] = " 2. String Builder Function\n";
			addString[3] = "The real string:";
			addString[4] = "The modified string:";
			return format("%n%s%s%n%s%n%s%n%s%n",
					addString[0], addString[3],
					addString[1], addString[4],
					stringList.getStringBuilder());
		} finally {
			Function.super.setDefaults();
		}
	}
}
