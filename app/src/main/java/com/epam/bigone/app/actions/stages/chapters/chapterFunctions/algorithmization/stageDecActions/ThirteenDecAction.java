package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class ThirteenDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Find and print all pairs of 'twins' from the segment [n, 2n],\n" +
				"\twhere n is a given natural number greater than 2\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcThirteenFunction();
	}
}
