package com.epam.bigone.chapters.chapterSerialization.controller;

public interface ApplicationController {

	void makeFirstAction();

	void makeSecondAction();

	void makeThirdAction();

	default void makeFourthAction(){}

	default void makeFifthAction(){}

	default void makeSixthAction(){}

	default void makeSeventhAction(){}

	default void makeEighthAction(){}
}
