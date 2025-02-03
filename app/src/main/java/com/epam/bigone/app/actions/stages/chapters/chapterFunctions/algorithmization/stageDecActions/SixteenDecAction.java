package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SixteenDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Define the sum of n - digit numbers containing only odd digits.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcSixteenFunction();
	}
}
