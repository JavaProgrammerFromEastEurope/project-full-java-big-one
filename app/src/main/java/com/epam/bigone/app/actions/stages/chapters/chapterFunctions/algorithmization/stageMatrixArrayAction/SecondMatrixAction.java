package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SecondMatrixAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "You are given a square matrix.\n" +
				"\tDisplay the elements on the diagonal.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(2).calcSecondFunction();
	}
}
