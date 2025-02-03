package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageLineActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class FirstLineAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "Find the value of the function:\n" +
				"\t z = ((a - 3) * b / 2) + c\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(3).calcFirstFunction();
	}
}
