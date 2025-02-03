package com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.flowers;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.BaseAppsAction;

public class AddFlowerAction extends BaseAppsAction implements Action {

	@Override
	public String description() {
		return "Add New Flower Object";
	}

	@Override
	public void action() {
		appsControllers.get(3).makeFirstAction();
	}
}
