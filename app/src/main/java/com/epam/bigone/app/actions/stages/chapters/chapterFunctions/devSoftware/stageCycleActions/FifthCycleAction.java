package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageCycleActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class FifthCycleAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "Given a number series and some number e.\n" +
				"\tFind the sum of those terms of the series whose modulus is greater than or equal to given e.\n" +
				"\tThe general term of the series is:\n" +
				"\t|1 / (2 ^ n) + 1 / (3 ^ n)|\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(2).calcFifthFunction();
	}
}
