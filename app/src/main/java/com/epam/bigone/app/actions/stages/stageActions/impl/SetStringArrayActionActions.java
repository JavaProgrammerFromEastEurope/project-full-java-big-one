package com.epam.bigone.app.actions.stages.stageActions.impl;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.stageActions.BaseStageAction;

public class SetStringArrayActionActions extends BaseStageAction implements Action {

	@Override
	public String description() {
		return "Show All String Arrays Processing ";
	}

	@Override
	public void action() {
		stageFactory.setCurrentStage(stageFactory.getStringStage());
	}
}
