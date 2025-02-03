package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageStringBuilder;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class FifthStrBuilderAction extends BaseStringProcAction implements Action {

	@Override
	public String description() {
		return "Find the number of a character 'a'";
	}

	@Override
	public void action() {
		strProcActions.get(2).calcFifthFunction();
	}
}
