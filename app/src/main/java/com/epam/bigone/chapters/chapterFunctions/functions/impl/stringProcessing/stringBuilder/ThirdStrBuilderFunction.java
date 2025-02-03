package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.StringList;

/** The list of palindrome strings **/
public class ThirdStrBuilderFunction implements Function<ParagraphMap> {

	StringList stringList = new StringList();

	@Override
	public void calcFunction(ParagraphMap array) {
		addString[1] = "Mr. redivider ate my metal worm, Do geese see God?,\n " +
				"Was it deified or civic you saw?, Murder for radar of level rum.\n " +
				"Go rotor salami, I'm kayak hog.";

		stringList.setStringBuilder(new StringBuilder(addString[1]));
		stringList.setFirstList(StringList.initArrayStringList(stringList.getStringBuilder()));
		stringList.setExtraList(new ArrayList<>());

		for (String string : stringList.getFirstList()) {
			StringBuffer rev = new StringBuffer(string).reverse();
			if (string.equals(rev.toString())) {
				stringList.getExtraList().add(string);
			}
		}
	}

	@Override
	public String getResultString(ParagraphMap array) {
		try {
			out.println(Function.warning);
			addString[0] = " 3. String Builder Function\n";
			addString[2] = " The string:";
			addString[3] = " The list of a palindrome strings:";
			return format("%n%s%s%n%s%n%s%n%s%n%n",
					addString[0], addString[2],
					addString[1], addString[3],
					stringList.getExtraList());
		} finally {
			Function.super.setDefaults();
		}
	}
}
