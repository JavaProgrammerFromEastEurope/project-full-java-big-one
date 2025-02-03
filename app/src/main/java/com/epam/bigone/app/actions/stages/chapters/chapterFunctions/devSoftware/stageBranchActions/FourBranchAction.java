package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageBranchActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class FourBranchAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "The dimensions A, B of the rectangular hole \n  " +
				"\tand the dimensions - (x, y, z) of the brick are given.\n  " +
				"\tDetermine if a brick will pass through hole.\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(1).calcFourthFunction();
	}
}
