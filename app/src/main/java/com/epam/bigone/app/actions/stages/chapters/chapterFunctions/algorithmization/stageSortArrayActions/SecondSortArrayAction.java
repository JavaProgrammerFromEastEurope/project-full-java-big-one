package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageSortArrayActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class SecondSortArrayAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Two sequences are given a1 <= a2 <= ... <= an and b1 <= b2 <= ... <= bm.\n" +
				"\tForm a new sequence from them numbers so that it is also non-decreasing.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(3).calcSecondFunction();
	}

}
