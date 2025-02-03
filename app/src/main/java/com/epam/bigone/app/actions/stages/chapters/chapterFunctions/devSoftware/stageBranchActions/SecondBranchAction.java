package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageBranchActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class SecondBranchAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "Find max {min(a, b), min(c, d)}\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(1).calcSecondFunction();
	}
}
