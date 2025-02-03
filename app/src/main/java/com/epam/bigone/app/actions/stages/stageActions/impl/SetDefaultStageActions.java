package com.epam.bigone.app.actions.stages.stageActions.impl;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.stageActions.BaseStageAction;

public class SetDefaultStageActions extends BaseStageAction implements Action {

	@Override
	public String description() {
		return "Return to Main Menu\n";
	}

	@Override
	public void action() {
		stageFactory.setCurrentStage(stageFactory.getDefaultStage());
	}
}