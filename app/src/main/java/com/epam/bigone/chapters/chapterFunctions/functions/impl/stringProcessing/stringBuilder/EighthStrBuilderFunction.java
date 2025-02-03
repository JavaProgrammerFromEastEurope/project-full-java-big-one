package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.StringList;

/** Find the longest words **/
public class EighthStrBuilderFunction implements Function<ParagraphMap> {

	TreeSet<String> treeSet;
	TreeMap<String, Integer> treeMap;
	StringList stringList;

	@Override
	public void calcFunction(ParagraphMap paragraph) {
		treeMap = new TreeMap<>();
		treeSet = new TreeSet<>();
		addString[1] = "Mr. redivider ate my metal worm, Do geese see God?,\n " +
				"Was it deified or metallics civic you saw?, Murder for radar of level rum.\n " +
				"Go rotor salami, I'm kayak hog.";
		stringList = new StringList();
		stringList.setStringBuilder(new StringBuilder(addString[1]));
		stringList.setFirstList(StringList.initArrayStringList(stringList.getStringBuilder()));
		treeSet.addAll(Arrays.stream(stringList.getFirstList().toArray(String[]::new)).map(String::toString)
				.collect(Collectors.toCollection(TreeSet::new)));

		IntStream.range(0, treeSet.size())
				.forEach(index -> {
					addString[2] = treeSet.pollFirst();
					operation[0] = Math.max(operation[0], addString[2].length());
					treeMap.put(addString[2], addString[2].length());
				});
	}

	private ArrayList<String> printLongestWords() {
		var arraylist = new ArrayList<String>();
		treeMap.forEach((key, value) -> {
			if (value == operation[0])
				arraylist.add(format(" %s ", key));
		});
		return arraylist;
	}

	@Override
	public String getResultString(ParagraphMap paragraph) {
		try {
			out.println(Function.warning);
			addString[0] = " 8. String Builder Function\n";
			addString[3] = "The string:";
			addString[4] = "The longest words are:";
			return format("%n%s%s%n%s%n%s %d%n%s%n",
					addString[0], addString[3], addString[1],
					addString[4], (int) operation[0],
					List.of(printLongestWords()));
		} finally {
			Function.super.setDefaults();
		}
	}
}
