package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class ThirteenMatrixAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Sort matrix columns in ascending and descending order of element values.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(2).calcThirteenFunction();
	}
}
