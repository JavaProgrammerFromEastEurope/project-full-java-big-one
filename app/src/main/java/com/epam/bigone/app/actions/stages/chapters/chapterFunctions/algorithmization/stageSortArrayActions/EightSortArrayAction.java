package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageSortArrayActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class EightSortArrayAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Creates fractions to the total\n" +
				"\tdenominator and orders them in ascending order.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(3).calcEighthFunction();
	}
}
