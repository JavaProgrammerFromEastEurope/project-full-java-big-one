package com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.notes;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.BaseAppsAction;

public class RemoveNoteAction extends BaseAppsAction implements Action {

	@Override
	public String description() {
		return "Remove Object Action:";
	}

	@Override
	public void action() {
		appsControllers.get(1).makeFifthAction();
	}
}
