package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageCycleActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class SixthCycleAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		int character = 123395;
		return String.format("The correspondences between symbols and %n" +
				"\ttheir numerical designations in the computer memory.%c %n", (char) character);

	}

	@Override
	public void action() {
		devSoftwareActions.get(2).calcSixthFunction();
	}
}
