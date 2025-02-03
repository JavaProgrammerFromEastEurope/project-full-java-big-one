package com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.notes;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.BaseAppsAction;

public class SortByHeadingAction extends BaseAppsAction implements Action {

	@Override
	public String description() {
		return "Sort By 'Heading' - Field Action:";
	}

	@Override
	public void action() {
		appsControllers.get(1).makeFourthAction();
	}
}