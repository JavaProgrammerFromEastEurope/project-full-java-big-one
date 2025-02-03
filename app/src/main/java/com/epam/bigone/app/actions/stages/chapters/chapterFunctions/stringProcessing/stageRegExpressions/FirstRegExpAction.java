package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageRegExpressions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class FirstRegExpAction extends BaseStringProcAction implements Action {

	@Override
	public String description() {
		return "Sort paragraphs by number of sentences";
	}

	@Override
	public void action() {
		strProcActions.get(3).calcFirstFunction();
	}
}
