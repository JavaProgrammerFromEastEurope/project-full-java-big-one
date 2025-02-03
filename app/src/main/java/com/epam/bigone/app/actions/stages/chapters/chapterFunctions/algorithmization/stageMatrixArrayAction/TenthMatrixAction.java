package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class TenthMatrixAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Find the positive elements of the main diagonal of a square matrix.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(2).calcTenthFunction();
	}
}
