package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageCycleActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class ThirdCycleAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "Find the sum of the squares of the first hundred numbers.\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(2).calcThirdFunction();
	}
}
