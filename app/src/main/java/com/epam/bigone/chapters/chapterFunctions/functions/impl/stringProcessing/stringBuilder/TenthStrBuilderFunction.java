package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.StringList;

/** Dividing string by exclamation marks **/
public class TenthStrBuilderFunction implements Function<ParagraphMap> {

	StringList stringList;

	@Override
	public void calcFunction(ParagraphMap paragraph) {
		addString[1] = "So perhaps, you've generated some fancy text, and you're content that you can now\n" +
				" copy and paste your fancy text in the comments section of funny cat videos. But perhaps\n" +
				" you're wondering how it's even possible to change the font of your text?";
		stringList = new StringList();
		Pattern pattern = Pattern.compile("[.!?]");
		stringList.setFirstList(Arrays.stream(pattern.split(addString[1]))
				.map(String::toString).collect(Collectors.toCollection(ArrayList::new)));
	}

	@Override
	public String getResultString(ParagraphMap paragraph) {
		try {
			out.println(Function.warning);
			addString[0] = " 10. String Builder Function\n";
			addString[2] = "The string:";
			addString[3] = "The number of sentences:";
			return format("%n%s%s%n%s%n%s%n%d%n",
					addString[0], addString[2], stringList.getFirstList(),
					addString[3], stringList.getFirstList().size());
		} finally {
			Function.super.setDefaults();
		}
	}
}
