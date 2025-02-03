package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageStringBuilder;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class ThirdStrBuilderAction extends BaseStringProcAction implements Action {

	@Override
	public String description() {
		return "The list of palindrome strings ";
	}

	@Override
	public void action() {
		strProcActions.get(2).calcThirdFunction();
	}
}
