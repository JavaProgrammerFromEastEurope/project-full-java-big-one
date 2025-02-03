package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing;

import static com.epam.bigone.app.util.CharArrays.sumOfCharValues;
import static com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.StringList.makeTemplateString;
import static java.lang.String.format;
import static java.lang.System.out;
import static java.nio.file.Files.newBufferedReader;
import static java.util.Comparator.comparingInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.epam.bigone.app.sortComparator.impl.function.SortByLengthWord;
import com.epam.bigone.app.util.Input;

public class ParagraphMap {

	private TreeMap<Integer, Map<List<String>, Integer>> paragraphMap;
	private Map<List<String>, Integer> entrySet;
	private Pattern pattern;
	private StringList stringList = new StringList();

	public void setParagraphMap(TreeMap<Integer, Map<List<String>, Integer>> paragraphMap) {
		this.paragraphMap = paragraphMap;
	}

	private static final String PATH = "regExpressions/AliceWonderland.txt";

	public Pattern getPattern() {
		return pattern;
	}

	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}

	public Map<List<String>, Integer> getEntrySet() {
		return entrySet;
	}

	public void setEntrySet(Map<List<String>, Integer> entrySet) {
		this.entrySet = entrySet;
	}

	public TreeMap<Integer, Map<List<String>, Integer>> getParagraphMap() {
		return paragraphMap;
	}

	public String getStringFromFile() {
		var stringFromFile = new AtomicReference<String>();
		try (BufferedReader bufferedReader = newBufferedReader(Paths.get(
				getClass().getResource(format("/%s", PATH)).toURI()))) {
			stringFromFile.set(bufferedReader.lines().collect(Collectors.joining(" ")));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		return stringFromFile.get();
	}

	public Map<List<String>, Integer> initEntrySet(List<String> text) {
		setPattern(Pattern.compile("(\\.\\s+)"));
		var entrySet = new HashMap<List<String>, Integer>();

		for (String paragraph : text) {
			stringList.setExtraList(Arrays.stream(getPattern().split(paragraph))
					.collect(Collectors.toCollection(ArrayList::new)));
			entrySet.put(stringList.getExtraList(), stringList.getExtraList().size());
		}
		return entrySet;
	}

	public TreeMap<Integer, Map<List<String>, Integer>> sortByEntrySet(
			Map<List<String>, Integer> entries, SortEnum sort) {
		var paragraphMap = new TreeMap<Integer, Map<List<String>, Integer>>();
		var list = new ArrayList<>(entries.entrySet());
		Map<List<String>, Integer> sortedEntrySet;
		switch (sort) {
			case SORT_BY_ENTRY_VALUE:
				list.sort(Map.Entry.comparingByValue());
				for (int i = 1; i <= list.size(); i++) {
					sortedEntrySet = new HashMap<>();
					sortedEntrySet.put(
							list.get(i - 1).getKey(),
							list.get(i - 1).getValue());
					paragraphMap.put(i, sortedEntrySet);
				}
				break;
			case SORT_BY_LENGTH:
				for (int i = 1; i <= list.size(); i++) {
					sortedEntrySet = new HashMap<>();
					sortedEntrySet.put(
							sortByLength(
									list.get(i - 1).getKey()),
									list.get(i - 1).getValue());
					paragraphMap.put(i, sortedEntrySet);
				}
				break;
			case SORT_BY_CHAR:
				out.println("Input a character:");
				final String character = (String) Input.inputCharacter();
				for (int i = 1; i <= list.size(); i++) {
					sortedEntrySet = new HashMap<>();
					sortedEntrySet.put(
							sortByCharacter(
									list.get(i - 1).getKey(), character),
									list.get(i - 1).getValue());
					paragraphMap.put(i, sortedEntrySet);
				}
				break;
		}
		return paragraphMap;
	}

	public List<String> sortByLength(List<String> paragraph) {
		setPattern(Pattern.compile("\\W+"));
		var sortedArrayList = new ArrayList<String>();
		for (String sentence : paragraph) {
			stringList.setExtraList(Arrays.stream(getPattern().split(sentence))
					.sorted(new SortByLengthWord())
					.collect(Collectors.toCollection(ArrayList::new)));
			sortedArrayList.add(makeTemplateString(stringList.getExtraList()));
		}
		return sortedArrayList;
	}

	public List<String> sortByCharacter(List<String> paragraph, String character) {
		setPattern(Pattern.compile("\\s+"));
		var sortedArrayList = new ArrayList<String>();
		for (String sentence : paragraph) {
			stringList.setExtraList(Arrays.stream(getPattern().split(sentence))
					.sorted(comparingInt((String word)
							-> sumOfCharValues(word.toCharArray(), 0, character.charAt(0))).reversed()
							.thenComparing(Comparator.naturalOrder()))
					.collect(Collectors.toCollection(ArrayList::new)));
			sortedArrayList.add(makeTemplateString(stringList.getExtraList()));
		}
		return sortedArrayList;
	}

	public enum SortEnum {
		SORT_BY_ENTRY_VALUE,
		SORT_BY_LENGTH,
		SORT_BY_CHAR
	}
}
