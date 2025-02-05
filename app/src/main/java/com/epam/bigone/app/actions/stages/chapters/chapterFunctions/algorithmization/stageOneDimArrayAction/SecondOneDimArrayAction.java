package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SecondOneDimArrayAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "A sequence of real numbers a1, a2, ..., an is given.\n" +
				"\tReplace all its members larger than the given Z with this number.\n" +
				"\tCount the number of substitutions.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(1).calcSecondFunction();
	}
}
