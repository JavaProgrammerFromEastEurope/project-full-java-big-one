package com.epam.bigone.chapters.chapterClasses.action;

public interface ClassAction {

	String[] addString = new String[6];

	void inputVariables();

	void printResult();

	default void setDefaultOperations() {
		java.util.Arrays.fill(addString, null);
	}
}