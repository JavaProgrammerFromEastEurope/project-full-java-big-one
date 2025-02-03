package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.StringList;

/** def cde abc **/
public class SeventhStrBuilderFunction implements Function<ParagraphMap> {

	TreeSet<Character> treeSet;
	TreeMap<Character, Integer> treeMap;
	StringList stringList;

	private void initVars() {
		addString[1] = "def cde abc";
		treeMap = new TreeMap<>();
		stringList = new StringList();
		stringList.setStringBuilder(new StringBuilder());
		treeSet = addString[1].chars().mapToObj(c -> (char) c)
				.collect(Collectors.toCollection(TreeSet::new));
		IntStream.range(0, treeSet.size())
				.forEach(index -> treeMap.put(treeSet.pollFirst(), 0));
	}

	private void incValueMap() {
		for (Character object : addString[1].toCharArray()) {
			treeMap.put(object, treeMap.get(object) + 1);
			if (treeMap.get(object) == 1 && !object.equals(' '))
				stringList.getStringBuilder().append(object);
		}
	}

	@Override
	public void calcFunction(ParagraphMap array) {
		this.initVars();
		this.incValueMap();
	}

	@Override
	public String getResultString(ParagraphMap array) {
		try {
			out.println(Function.warning);
			addString[0] = " 7. String Builder Function\n";
			addString[2] = "The string:";
			addString[3] = "The result string:";
			return format("%n%s%s%n%s%n%s%n%s%n%n",
					addString[0], addString[2],
					addString[1], addString[3], stringList.getStringBuilder());
		} finally {
			Function.super.setDefaults();
		}
	}
}
