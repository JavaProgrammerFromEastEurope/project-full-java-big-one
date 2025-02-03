package com.epam.bigone.app.actions.stages.stageActions.impl;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.stageActions.BaseStageAction;

public class SetRegExpStageActions extends BaseStageAction implements Action {

	@Override
	public String description() {
		return "Run RegExp Application";
	}

	@Override
	public void action() {
		stageFactory.setCurrentStage(stageFactory.getRegExpStage());
	}
}
