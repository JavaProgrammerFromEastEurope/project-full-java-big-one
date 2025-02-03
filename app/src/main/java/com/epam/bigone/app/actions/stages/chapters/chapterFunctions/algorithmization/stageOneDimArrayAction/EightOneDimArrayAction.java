package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class EightOneDimArrayAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "You are given a sequence of integers a1, a2, ..., an.\n" +
				"\tForm a new sequence by throwing out the original terms\n" +
				"\tthat are equal to min (a1, a2, ..., an).\n";
	}

	@Override
	public void action() {
		algorithmActions.get(1).calcEighthFunction();
	}
}
