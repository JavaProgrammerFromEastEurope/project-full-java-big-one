package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SeventeenthDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "The sum of its digits was subtracted from the given number.\n" +
				"\tThe sum of its digits was again subtracted from the result, etc.\n" +
				"\tHow many such actions need to be performed to get zero?\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcSeventeenFunction();
	}
}
