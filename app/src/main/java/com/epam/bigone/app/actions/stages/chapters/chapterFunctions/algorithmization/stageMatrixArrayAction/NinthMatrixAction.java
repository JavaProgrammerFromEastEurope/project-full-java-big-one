package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class NinthMatrixAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "A matrix of non-negative numbers is given.\n" +
				"\tCalculate the sum of the items in each column.\n" +
				"\tDetermine which the column contains the maximum amount\n";
	}

	@Override
	public void action() {
		algorithmActions.get(2).calcNinthFunction();
	}
}
