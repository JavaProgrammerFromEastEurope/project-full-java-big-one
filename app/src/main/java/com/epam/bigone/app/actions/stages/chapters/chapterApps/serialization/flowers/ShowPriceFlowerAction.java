package com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.flowers;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.BaseAppsAction;

public class ShowPriceFlowerAction extends BaseAppsAction implements Action {

	@Override
	public String description() {
		return "Show a Flower With Inputted Price";
	}

	@Override
	public void action() {
		appsControllers.get(3).makeSeventhAction();
	}
}