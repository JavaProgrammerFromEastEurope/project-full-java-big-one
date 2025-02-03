package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FifteenMatrixAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Find the largest element of the matrix\n" +
				"\tand replace all odd elements with it.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(2).calcFifteenFunction();
	}
}
