package com.epam.bigone.chapters.chapterSerialization.controller.impl;

import java.util.Map;

import com.epam.bigone.chapters.chapterSerialization.action.ActionTemplate;
import com.epam.bigone.chapters.chapterSerialization.action.ActionsFactory;
import com.epam.bigone.chapters.chapterSerialization.controller.ApplicationController;

public class TreasureController implements ApplicationController {

	private final Map<Integer, ActionTemplate> appsActions;

	public TreasureController() {
		this.appsActions = ActionsFactory.getInstance().getAppsActions();
	}

	@Override
	public void makeFirstAction() {
		appsActions.get(2).addObject();
	}

	@Override
	public void makeSecondAction() {
		appsActions.get(2).updateObject();
	}

	@Override
	public void makeThirdAction() {
		appsActions.get(2).firstSort();
	}

	@Override
	public void makeFourthAction() {
		appsActions.get(2).secondSort();
	}

	@Override
	public void makeFifthAction() {
		appsActions.get(2).removeObject();
	}

	@Override
	public void makeSixthAction() {
		appsActions.get(2).showMostValObject();
	}

	@Override
	public void makeSeventhAction() {
		appsActions.get(2).showPriseObject();
	}

	@Override
	public void makeEighthAction() {
		appsActions.get(2).xmlExportObject();
	}
}