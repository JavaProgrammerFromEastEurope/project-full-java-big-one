package com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing;

import java.util.ArrayList;

import java.util.List;

public class StringList {

	private List<String> firstList;
	private List<String> extraList;
	private StringBuilder stringBuilder;

	public void setStringBuilder(StringBuilder stringBuilder) {
		this.stringBuilder = stringBuilder;
	}

	public List<String> getFirstList() {
		return firstList;
	}

	public List<String> getExtraList() {
		return extraList;
	}

	public StringBuilder getStringBuilder() {
		return stringBuilder;
	}

	public void setFirstList(List<String> firstList) {
		this.firstList = firstList;
	}

	public void setExtraList(List<String> extraList) {
		this.extraList = extraList;
	}

	public static List<String> initArrayStringList(StringBuilder stringBuilder) {
		List<String> arrayList = new ArrayList<>();
		while (true) {
			if (stringBuilder.indexOf(" ") != -1) {
				arrayList.add(stringBuilder.substring(0, stringBuilder.indexOf(" ")));
				stringBuilder.delete(0, stringBuilder.indexOf(" ") + 1);
				continue;
			} else {
				arrayList.add(stringBuilder.substring(0, stringBuilder.length() - 1));
				stringBuilder.delete(0, stringBuilder.length());
			}
			break;
		}
		return arrayList;
	}

	public static String makeTemplateString(List<String> array) {
		StringBuilder stringBuffer = new StringBuilder();
		array.forEach(o -> stringBuffer.append(String.format("[%2s]", o)));
		return stringBuffer.toString();
	}
}
