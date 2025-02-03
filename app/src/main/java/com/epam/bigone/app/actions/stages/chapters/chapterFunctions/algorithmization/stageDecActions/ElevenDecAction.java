package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class ElevenDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Determine which of the given two numbers has more digits.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcEleventhFunction();
	}
}
