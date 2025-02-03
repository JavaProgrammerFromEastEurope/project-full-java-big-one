package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageBranchActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class ThirdBranchAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "Three points - A(x1,y1), B(x2,y2) and C(x3,y3) are given.\n" +
				" \tDetermine if they will be located on the same line.\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(1).calcThirdFunction();
	}
}
