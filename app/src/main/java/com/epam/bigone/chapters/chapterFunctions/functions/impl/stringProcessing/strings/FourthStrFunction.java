package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.strings;

import static com.epam.bigone.app.util.CharArrays.sumOfDigits;
import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;

/** Counter of numbers in the string **/
public class FourthStrFunction implements Function<ParagraphMap> {

	@Override
	public void calcFunction(ParagraphMap paragraph) {
		addString[1] = "Is 1 the 2 word 35 great? 255 How many words 7 you 23 can 53 pronounce?";
		for (int i = 0; i < addString[1].length(); i++) {
			if (Character.isDigit(addString[1].toCharArray()[i])) {
				operation[0] = sumOfDigits(addString[1].toCharArray(), i);
				i += (int) operation[0];
				operation[1]++;
			}
		}
	}

	@Override
	public String getResultString(ParagraphMap paragraph) {
		try {
			out.println(Function.warning);
			addString[0] = " 4. String Function\n";
			addString[2] = " The natural string:";
			addString[3] = " Counter of numbers - ";
			return format("%n%s%s%n%s%n%s%.0f%n",
					addString[0], addString[2], addString[1], addString[3], operation[1]);
		} finally {
			Function.super.setDefaults();
		}
	}
}
