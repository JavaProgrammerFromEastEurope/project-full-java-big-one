package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageCycleActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;
import com.epam.bigone.app.exceptions.StopApplicationException;

public class FourthCycleAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "The multiplication of the squares of the first two hundred numbers.\n";
	}

	@Override
	public void action() throws StopApplicationException {
		devSoftwareActions.get(2).calcFourthFunction();
	}
}
