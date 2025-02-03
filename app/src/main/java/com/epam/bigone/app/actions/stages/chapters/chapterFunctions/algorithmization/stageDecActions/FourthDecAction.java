package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FourthDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Determine between which\n" +
				"\tof pairs of points, the greatest distance.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcFourthFunction();
	}
}
