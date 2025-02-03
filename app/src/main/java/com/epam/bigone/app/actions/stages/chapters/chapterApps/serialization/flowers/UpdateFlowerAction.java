package com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.flowers;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.BaseAppsAction;

public class UpdateFlowerAction extends BaseAppsAction implements Action {

	@Override
	public String description() {
		return "Update Object Action";
	}

	@Override
	public void action() {
		appsControllers.get(3).makeSecondAction();
	}
}
