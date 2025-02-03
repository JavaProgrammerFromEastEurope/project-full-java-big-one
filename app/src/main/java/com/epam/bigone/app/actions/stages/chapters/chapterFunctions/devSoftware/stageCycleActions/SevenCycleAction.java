package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageCycleActions;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.BaseSoftwareAction;

public class SevenCycleAction extends BaseSoftwareAction implements Action {

	@Override
	public String description() {
		return "For each natural number in the range from m to n,\n " +
				"\toutput all divisors except one and the number itself.\n" +
				"\tThe 'm' and 'n' are entered from the keyboard.\n";
	}

	@Override
	public void action() {
		devSoftwareActions.get(2).calcSeventhFunction();
	}
}
