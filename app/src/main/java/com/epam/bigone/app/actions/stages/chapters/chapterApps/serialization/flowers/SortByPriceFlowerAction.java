package com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.flowers;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.BaseAppsAction;

public class SortByPriceFlowerAction extends BaseAppsAction implements Action {

	@Override
	public String description() {
		return "Sorting by price flower";
	}

	@Override
	public void action() {
		appsControllers.get(3).makeFourthAction();
		stageFactory.setCurrentStage(stageFactory.getFlowerStage());
	}
}