package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageCycleActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class EightCycleAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "Two numbers are given.\n" +
				"\tDetermine the digits included in the \n" +
				"\trecording of both the first and second numbers.\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(2).calcEighthFunction();
	}
}
