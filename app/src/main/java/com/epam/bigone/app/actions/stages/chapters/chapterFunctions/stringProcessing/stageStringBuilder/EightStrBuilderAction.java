package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageStringBuilder;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class EightStrBuilderAction extends BaseStringProcAction implements Action {

	@Override
	public String description() {
		return "Find the longest words";
	}

	@Override
	public void action() {
		strProcActions.get(2).calcEighthFunction();
	}
}
