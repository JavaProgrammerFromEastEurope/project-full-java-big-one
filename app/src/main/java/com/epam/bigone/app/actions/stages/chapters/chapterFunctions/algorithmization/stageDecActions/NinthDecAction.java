package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class NinthDecAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "Given the numbers X, Y, Z, T - the lengths of the sides of the quadrilateral.\n" +
				"\tWrite a method (methods) for calculating its area,\n" +
				"\tif the angle between the sides of length X and Y is straight.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(4).calcNinthFunction();
	}
}
