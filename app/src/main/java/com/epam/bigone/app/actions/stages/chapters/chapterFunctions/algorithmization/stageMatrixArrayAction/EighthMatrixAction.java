package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class EighthMatrixAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "In a numeric matrix, swap two columns of any column,\n" +
				"\ti.e. put all elements of one column\n" +
				"\tto the corresponding positions of the other,\n" +
				"\tand move its elements of the second to the first.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(2).calcEighthFunction();
	}
}
