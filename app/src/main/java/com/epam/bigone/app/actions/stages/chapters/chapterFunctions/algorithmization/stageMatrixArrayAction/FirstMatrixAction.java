package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FirstMatrixAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "A matrix is given.\n" +
		"\tDisplay all odd columns with the first item greater than the last.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(2).calcFirstFunction();
	}
}
