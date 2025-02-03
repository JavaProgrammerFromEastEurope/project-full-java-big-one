package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageSortArrayActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class FifthSortArrayAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Sort by inserts.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(3).calcFifthFunction();
	}
}
