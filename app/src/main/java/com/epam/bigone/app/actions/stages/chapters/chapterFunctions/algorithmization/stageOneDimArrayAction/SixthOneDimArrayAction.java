package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayAction;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.BaseAlgorithmAction;

/**
 * A sequence of N real numbers is given.
 * Calculate the sum of numbers whose ordinal numbers are prime numbers.
 **/
public class SixthOneDimArrayAction extends BaseAlgorithmAction implements Action {

	@Override
	public String description() {
		return "A sequence of N real numbers is given.\n" +
				"\tCalculate the sum of numbers whose ordinal numbers are prime numbers.\n";
	}

	@Override
	public void action() {
		algorithmActions.get(1).calcSixthFunction();
	}
}
