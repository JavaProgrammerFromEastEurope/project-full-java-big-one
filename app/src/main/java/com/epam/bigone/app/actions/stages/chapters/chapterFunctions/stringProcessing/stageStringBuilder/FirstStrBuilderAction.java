package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageStringBuilder;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class FirstStrBuilderAction extends BaseStringProcAction implements Action {

	@Override
	public String description() {
		return "Find max number in a sequence of a space literal";
	}

	@Override
	public void action() {
		strProcActions.get(2).calcFirstFunction();
	}
}
