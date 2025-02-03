package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.FunctionsFactory;

public abstract class BaseSoftwareAction {

	public final Map<Integer, FunctionController> devSoftwareActions;

	public BaseSoftwareAction() {
		devSoftwareActions = FunctionsFactory.getInstance().getDevSoftControllers();
	}
}
