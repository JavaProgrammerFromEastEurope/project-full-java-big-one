package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrArrays;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class FourthStringArrayAction extends BaseStringProcAction implements Action {

	@Override
	public String description() {
		return "Counter of numbers in the string";
	}

	@Override
	public void action() {
		strProcActions.get(1).calcFourthFunction();
	}
}
