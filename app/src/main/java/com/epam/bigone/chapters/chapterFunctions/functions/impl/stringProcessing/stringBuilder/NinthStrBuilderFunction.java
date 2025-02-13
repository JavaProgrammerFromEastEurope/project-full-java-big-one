package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;


/** Count of Upper & Lower case symbols **/
public class NinthStrBuilderFunction implements Function<ParagraphMap> {

	@Override
	public void calcFunction(ParagraphMap paragraph) {
		addString[1] = "So perhaps, you've generated some fancy text, and you're content that you can now\n" +
				" copy and paste your fancy text in the comments section of funny cat videos. But perhaps\n" +
				" you're wondering how it's even possible to change the font of your text?";

		for (int i = 0; i < addString[1].length(); i++) {
			if (Character.isUpperCase(addString[1].charAt(i))) {
				operation[0] += 1;
			} else if (Character.isLowerCase(addString[1].charAt(i))) {
				operation[1] += 1;
			}
		}
	}

	@Override
	public String getResultString(ParagraphMap paragraph) {
		try {
			out.println(Function.warning);
			addString[0] = " 9. String Builder Function\n";
			addString[2] = "The string:";
			addString[3] = "The number of Upper case symbols:";
			addString[4] = "The number of Lower case symbols:";
			return format("%n%s%s%n%s%n%s%n%d%n%s%n%d%n",
					addString[0],
					addString[2], 			addString[1],
					addString[3], (int) operation[0],
					addString[4], (int) operation[1]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
