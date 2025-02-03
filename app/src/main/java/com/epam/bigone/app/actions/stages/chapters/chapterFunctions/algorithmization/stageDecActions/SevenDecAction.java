package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SevenDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Calculate the sum of the factorials of all odd numbers from 1 to 9.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcSeventhFunction();
	}
}
