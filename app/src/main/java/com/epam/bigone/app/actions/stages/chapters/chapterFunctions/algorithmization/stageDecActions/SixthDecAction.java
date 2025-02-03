package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SixthDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Check if the given three numbers are coprimes.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcSixthFunction();
	}
}
