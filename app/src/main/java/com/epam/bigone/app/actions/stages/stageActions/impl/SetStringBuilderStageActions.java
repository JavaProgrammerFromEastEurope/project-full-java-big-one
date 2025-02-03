package com.epam.bigone.app.actions.stages.stageActions.impl;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.stageActions.BaseStageAction;

public class SetStringBuilderStageActions extends BaseStageAction implements Action {

	@Override
	public String description() {
		return "Show All String Builder Processing ";
	}

	@Override
	public void action() {
		stageFactory.setCurrentStage(stageFactory.getBuildStage());
	}
}