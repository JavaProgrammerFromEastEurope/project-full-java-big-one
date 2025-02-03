package com.epam.bigone.app.actions.stages.stageActions;

import com.epam.bigone.app.actions.stages.StageActionFactory;

public class BaseStageAction {

	public final StageActionFactory stageFactory;

	public BaseStageAction() {
		this.stageFactory = StageActionFactory.getInstance();
	}
}
