package com.epam.bigone.app.actions.stages.chapters.chapterApps;

import java.util.Map;

import com.epam.bigone.app.actions.stages.StageActionFactory;
import com.epam.bigone.chapters.chapterSerialization.controller.ApplicationController;
import com.epam.bigone.chapters.chapterSerialization.controller.WithInAppFactory;

public class BaseAppsAction {

	protected final Map<Integer, ApplicationController> appsControllers;
	protected final StageActionFactory stageFactory = StageActionFactory.getInstance();

	public BaseAppsAction() {
        this.appsControllers = WithInAppFactory.getInstance().getAppsControllers();
  }
}
