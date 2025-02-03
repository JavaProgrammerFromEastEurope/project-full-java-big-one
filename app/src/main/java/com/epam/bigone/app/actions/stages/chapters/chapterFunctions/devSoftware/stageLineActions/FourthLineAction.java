package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageLineActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class FourthLineAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "You are given a real number R of the form nnn.ddd" +
				" (three digital digits in fractional and integer parts).\n" +
				"\tSwap fractional and integer parts of the number and display " +
				"the resulting value of the number.\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(3).calcFourthFunction();
	}
}
