package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FifteenDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Find all natural n-digit numbers whose digits" +
				"form a strictly increasing sequence.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcFifteenFunction();
	}
}
