package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageLineActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class ThirdLineAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "Calculate the value of the expression using the formula" +
				" (all variables take on real values):\n" +
				"\t(sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(xy)\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(3).calcThirdFunction();
	}
}
