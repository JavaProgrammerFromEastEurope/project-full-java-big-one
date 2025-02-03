package com.epam.bigone.app.actions.stages.stageActions.impl;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.stageActions.BaseStageAction;

public class SetOneDimArrayStageActions extends BaseStageAction implements Action {

	@Override
	public String description() {
		return "Show All One Dimensions Arrays";
	}

	@Override
	public void action() {
		stageFactory.setCurrentStage(stageFactory.getArraysStage());
	}
}
