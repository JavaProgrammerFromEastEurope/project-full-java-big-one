package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class ThirdMatrixAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "A matrix is given.\n" +
				"\tPrint the k-th row and p-th column of the matrix.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(2).calcThirdFunction();
	}
}
