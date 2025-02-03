package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageBranchActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class FifthBranchAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "Calculate the value of the function:\n" +
				"\tif(x <= 3) - |x^2 - 3x + 9|\n " +
				"\tif(x > 3) - |1 / (x^3 + 6)|\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(1).calcFifthFunction();
	}
}
