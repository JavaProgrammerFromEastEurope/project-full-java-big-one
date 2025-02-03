package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class NinthOneDimArrayAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Find the most frequent number in an array of integers with n elements.\n" +
				"\tIf such there are several numbers, then determine the smallest of them.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(1).calcNinthFunction();
	}
}
