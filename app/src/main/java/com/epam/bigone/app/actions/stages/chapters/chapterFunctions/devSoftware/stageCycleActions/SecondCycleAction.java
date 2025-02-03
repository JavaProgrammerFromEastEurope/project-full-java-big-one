package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageCycleActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class SecondCycleAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "Calculate the values of the function on the segment [a, b] with step h:\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(2).calcSecondFunction();
	}
}
