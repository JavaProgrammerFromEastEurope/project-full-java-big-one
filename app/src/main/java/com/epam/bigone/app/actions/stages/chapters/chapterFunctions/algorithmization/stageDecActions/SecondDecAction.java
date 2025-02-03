package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SecondDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Find the greatest common divisor of four natural numbers.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcSecondFunction();
	}
}
