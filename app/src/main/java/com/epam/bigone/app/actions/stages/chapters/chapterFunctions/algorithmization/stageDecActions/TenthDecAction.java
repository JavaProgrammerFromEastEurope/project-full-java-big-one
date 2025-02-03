package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class TenthDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Forming an array, the elements of which\n" +
				"\tare the digits of the number N.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcTenthFunction();
	}
}
