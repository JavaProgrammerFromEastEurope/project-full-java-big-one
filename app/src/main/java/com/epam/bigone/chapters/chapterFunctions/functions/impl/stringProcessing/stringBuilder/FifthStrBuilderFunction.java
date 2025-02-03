package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import static com.epam.bigone.app.util.CharArrays.sumOfCharValues;
import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;

/** Find the number of a character 'a' **/
public class FifthStrBuilderFunction implements Function<ParagraphMap> {

	@Override
	public void calcFunction(ParagraphMap paragraph) {
		addString[1] = "So perhaps, you've generated some fancy text, and you're content that you can now\n" +
				" copy and paste your fancy text in the comments section of funny cat videos, but perhaps\n" +
				" you're wondering how it's even possible to change the font of your text?";

		operation[0] = sumOfCharValues(addString[1].toCharArray(), 0, 'a');
	}

	@Override
	public String getResultString(ParagraphMap paragraph) {
		try {
			out.println(Function.warning);
			addString[0] = " 5. String Builder Function\n";
			addString[2] = "The string:";
			addString[3] = "The number of a character 'a':";
			return format("%n%s%s%n%s%n%s %.0f%n",
					addString[0], addString[2],
					addString[1], addString[3], operation[0]);
		} finally {
			Function.super.setDefaults();
		}
	}

}
