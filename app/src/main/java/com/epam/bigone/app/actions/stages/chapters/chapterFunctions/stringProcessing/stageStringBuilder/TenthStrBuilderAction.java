package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageStringBuilder;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class TenthStrBuilderAction extends BaseStringProcAction implements Action {

	@Override
	public String description() {
		return "Dividing string by exclamation marks ";
	}

	@Override
	public void action() {
		strProcActions.get(2).calcTenthFunction();
	}
}
