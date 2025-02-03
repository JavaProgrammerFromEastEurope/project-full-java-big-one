package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FourteenMatrixAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Generate a random m x n matrix consisting of zeros and ones,\n" +
				"\tand in each column the number units is equal to column number.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(2).calcFourteenFunction();
	}
}
