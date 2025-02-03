package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.regExpressions;

import static java.lang.String.format;
import static java.lang.System.out;

import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap.SortEnum;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.StringList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


/**
 * Sort words sentences by number inputted character
 **/
public class ThirdRegExpFunction implements Function<ParagraphMap>{

	StringList stringList = new StringList();

	@Override
	public void calcFunction(ParagraphMap paragraph) {
		paragraph.setPattern(Pattern.compile("[\\t]"));
		stringList.setFirstList(Arrays.stream(
				paragraph.getPattern().split(paragraph.getStringFromFile()))
				.collect(Collectors.toCollection(ArrayList::new)));
		stringList.getFirstList().remove("");
		paragraph.setEntrySet(paragraph.initEntrySet(stringList.getFirstList()));
		paragraph.setParagraphMap(paragraph.sortByEntrySet(
				paragraph.getEntrySet(), SortEnum.SORT_BY_CHAR));
	}

	@Override
	public String getResultString(ParagraphMap paragraph) {
				var resultList = new ArrayList<>();
		out.println(Function.warning);
		addString[0] = " 3. Regular Expression Function\n";
		resultList.add("Sort paragraphs by number inputted character:");
		paragraph.getParagraphMap().forEach((k, v) ->
			paragraph.getParagraphMap().get(k).forEach((key, value) -> {
				resultList.add(format("%n%s: - %s", k, value));
				key.forEach(o ->
							resultList.add(format(" - [%2s]", o)));
		}));
		return format("%n%s%s%n", addString[0], List.of(resultList));
	}
}
