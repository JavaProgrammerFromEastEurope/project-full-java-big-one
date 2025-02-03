package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class ThirdOneDimArrayAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "An array of real numbers is given, the dimension of which is N.\n" +
				"\tCalculate how many negative numbers there are in it,\n" +
				"\tpositive and zero elements.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(1).calcThirdFunction();
	}
}
