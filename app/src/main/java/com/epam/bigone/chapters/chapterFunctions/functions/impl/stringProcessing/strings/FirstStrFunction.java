package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.strings;

import static java.lang.String.format;
import static java.lang.String.valueOf;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.StringList;

/** Camel case and Snake case **/
public class FirstStrFunction implements Function<ParagraphMap> {

	StringList stringList;

	@Override
	public void calcFunction(ParagraphMap paragraph) {
		stringList = new StringList();
		stringList.setFirstList(Arrays.stream(new String[] { "firstString", "secondString", "thirdString", "fourthString" })
				.collect(Collectors.toCollection(ArrayList::new)));
		stringList.setExtraList(new ArrayList<>(stringList.getFirstList()));

		for (int i = 0; i < stringList.getExtraList().size(); i++) {
			addString[0] = valueOf(stringList.getExtraList().get(i));
			operation[0] = addString[0].length();
			for (int j = 0; j < operation[0]; j++) {
				if (Character.isUpperCase(addString[0].toCharArray()[j])) {
					addString[1] = addString[0].substring(0, j);
					addString[2] = addString[0].substring(j + 1, (int) operation[0]);
					addString[3] = valueOf(Character.toLowerCase(addString[0].toCharArray()[j]));
					stringList.getExtraList().set(i, format("%s_%s%s", addString[1], addString[3], addString[2]));
				}
			}
		}
	}

	@Override
	public String getResultString(ParagraphMap paragraph) {
		try {
			out.println(Function.warning);
			addString[0] = " 1. String Function\n";
			addString[1] = " The camel case strings List:";
			addString[2] = " The snake case strings List:";
			return format("%n%s%s%n%s%n%s%n%s%n",
					addString[0], addString[1], stringList.getFirstList(),
					addString[2], stringList.getExtraList());
		} finally {
			Function.super.setDefaults();
		}
	}
}
