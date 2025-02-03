package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class ThirdDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Calculate the area of a regular hexagon with side 'a'\n" +
				"\tusing the area calculation method triangle.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcThirdFunction();
	}
}
