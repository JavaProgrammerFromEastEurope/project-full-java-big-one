package com.epam.bigone.chapters.chapterSerialization.controller.impl;

import java.util.Map;

import com.epam.bigone.chapters.chapterSerialization.action.ActionTemplate;
import com.epam.bigone.chapters.chapterSerialization.action.ActionsFactory;
import com.epam.bigone.chapters.chapterSerialization.controller.ApplicationController;

public class NoteController implements ApplicationController {

	private final Map<Integer, ActionTemplate> appsActions;

	public NoteController() {
		this.appsActions = ActionsFactory.getInstance().getAppsActions();
	}

	@Override
	public void makeFirstAction() {
		appsActions.get(1).addObject();
	}

	@Override
	public void makeSecondAction() {
		appsActions.get(1).updateObject();
	}

	@Override
	public void makeThirdAction() {
		appsActions.get(1).firstSort();
	}

	@Override
	public void makeFourthAction() {
		appsActions.get(1).secondSort();
	}

	@Override
	public void makeFifthAction() {
		appsActions.get(1).removeObject();
	}
}