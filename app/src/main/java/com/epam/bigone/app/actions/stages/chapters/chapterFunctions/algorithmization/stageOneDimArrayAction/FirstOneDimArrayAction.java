package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FirstOneDimArrayAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "The array A [N] contains natural numbers.\n" +
				"\t Find the sum of those elements that are multiples of a given K.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(1).calcFirstFunction();
	}
}
