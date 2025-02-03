package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageRegExpressions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class SecondRegExpAction extends BaseStringProcAction implements Action {

	@Override
	public String description() {
		return "Sort the words sentences by the length";
	}

	@Override
	public void action() {
		strProcActions.get(3).calcSecondFunction();
	}
}
