package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrArrays;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.BaseStringProcAction;

public class FirstStringArrayAction extends BaseStringProcAction implements Action {

	@Override
	public String description() {
		return "The camel case to snake case string";
	}

	@Override
	public void action() {
		strProcActions.get(1).calcFirstFunction();
	}
}
