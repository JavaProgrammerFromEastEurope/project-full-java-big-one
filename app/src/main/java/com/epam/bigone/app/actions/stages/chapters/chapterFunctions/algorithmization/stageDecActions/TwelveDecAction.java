package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class TwelveDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Format of array A, whose elements\n" +
				"\tare numbers whose sum of digits is equal to K and which are not greater than N.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcTwelveFunction();
	}
}
