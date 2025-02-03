package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

public class TenthOneDimArrayAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "An integer array is given with the number of elements n.\n" +
				"\tCompress the array by throwing out every second element\n" +
				"\t(fill the vacated elements with zeros).\n" +
				"\tNote. Do not use additional array.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(1).calcTenthFunction();
	}
}
