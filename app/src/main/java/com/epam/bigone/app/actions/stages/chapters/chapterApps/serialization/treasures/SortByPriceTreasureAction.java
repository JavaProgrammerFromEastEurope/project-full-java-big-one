package com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.treasures;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.BaseAppsAction;

public class SortByPriceTreasureAction extends BaseAppsAction implements Action {

	@Override
	public String description() {
		return "Sorting by Price Treasure";
	}

	@Override
	public void action() {
		appsControllers.get(2).makeFourthAction();
		stageFactory.setCurrentStage(stageFactory.getTreasureStage());
	}
}