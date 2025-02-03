package com.epam.bigone.chapters.chapterSerialization.action;

public interface ActionTemplate {

	void addObject();

	void updateObject();

	void removeObject();

	void firstSort();

	void secondSort();

	default void showMostValObject(){}

	default void showPriseObject(){}

	default void xmlExportObject(){}
}
