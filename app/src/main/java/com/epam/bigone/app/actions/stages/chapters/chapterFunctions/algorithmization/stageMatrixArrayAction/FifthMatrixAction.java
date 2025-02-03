package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FifthMatrixAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Form a square matrix\n" +
				"\tof order n according to a given pattern (n is even):\n" +
				"\tSecond variation (see pattern in the file):\n";
	}

	@Override
	public void action() {
		algorithmActions.get(2).calcFifthFunction();
	}
}
