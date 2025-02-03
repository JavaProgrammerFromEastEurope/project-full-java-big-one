package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SeventhMatrixAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Form a square matrix of order N according to the rule:\n";
	}

	@Override
	public void action() {
		algorithmActions.get(2).calcSeventhFunction();
	}
}
