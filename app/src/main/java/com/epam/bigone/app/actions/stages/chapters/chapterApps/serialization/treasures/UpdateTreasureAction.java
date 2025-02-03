package com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.treasures;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.BaseAppsAction;

public class UpdateTreasureAction extends BaseAppsAction implements Action {

	@Override
	public String description() {
		return "Update Treasure Action";
	}

	@Override
	public void action() {
		appsControllers.get(2).makeSecondAction();
	}
}