package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FirstDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Finding the greatest common divisor\n" +
				"\tand least common multiple of two natural numbers.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcFirstFunction();
	}
}
