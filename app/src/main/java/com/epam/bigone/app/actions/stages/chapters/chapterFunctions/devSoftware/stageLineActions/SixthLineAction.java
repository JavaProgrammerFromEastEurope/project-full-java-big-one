package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageLineActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class SixthLineAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "For a given area, prints true - if the point with coordinates (x, y)\n" +
				"\tbelongs to the filled area, and false - otherwise.\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(3).calcSixthFunction();
	}
}
