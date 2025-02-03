package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageCycleActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class FirstCycleAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "Sums up all numbers from 1 to a user-entered number.\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(2).calcFirstFunction();
	}
}
