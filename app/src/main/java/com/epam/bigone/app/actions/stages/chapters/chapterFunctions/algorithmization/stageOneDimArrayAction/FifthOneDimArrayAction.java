package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FifthOneDimArrayAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Integers a1, a2, ..., an are given.\n" +
				"\tPrint only those numbers for which ai> i.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(1).calcFifthFunction();
	}
}
