package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageLineActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class SecondLineAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "Calculate the value of the expression using the formula" +
				"(all variables are valid):\n" +
				"\t((b + sqrt(b^2 + 4ac)) / 2a) - (a^3c + b^-2)\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(3).calcSecondFunction();
	}
}
