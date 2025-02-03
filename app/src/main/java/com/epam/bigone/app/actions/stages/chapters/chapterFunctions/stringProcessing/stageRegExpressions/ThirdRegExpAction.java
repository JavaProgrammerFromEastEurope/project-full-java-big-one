package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageRegExpressions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class ThirdRegExpAction extends BaseStringProcAction implements Action {

	@Override
	public String description() {
		return "Sort words sentences by number inputted character";

	}

	@Override
	public void action() {
		strProcActions.get(3).calcThirdFunction();
	}
}
