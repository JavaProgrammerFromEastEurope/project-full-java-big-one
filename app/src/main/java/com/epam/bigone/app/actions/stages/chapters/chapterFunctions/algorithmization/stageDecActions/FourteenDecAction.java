package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FourteenDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Find all Armstrong numbers from 1 to k.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcFourteenFunction();
	}
}
