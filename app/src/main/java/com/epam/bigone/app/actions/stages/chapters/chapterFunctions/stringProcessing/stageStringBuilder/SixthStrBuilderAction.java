package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageStringBuilder;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class SixthStrBuilderAction extends BaseStringProcAction implements Action {

	@Override
	public String description() {
		return "Double every string character ";
	}

	@Override
	public void action() {
		strProcActions.get(2).calcSixthFunction();
	}
}
