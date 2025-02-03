package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FourthOneDimArrayAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "You are given real numbers a1, a2, ..., an.\n" +
				"\tSwap the largest and smallest items.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(1).calcFourthFunction();
	}
}
