package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageBranchActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class FirstBranchAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "Given two angles of the triangle (in degrees).\n" +
				"\tDetermine whether such a triangle exists, and if so,\n" +
				"\twhether there will be it is rectangular.\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(1).calcFirstFunction();
	}
}
