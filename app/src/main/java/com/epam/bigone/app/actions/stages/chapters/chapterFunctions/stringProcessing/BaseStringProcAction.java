package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.FunctionsFactory;

public class BaseStringProcAction {

	public final Map<Integer, FunctionController> strProcActions;

	public BaseStringProcAction() {
		strProcActions = FunctionsFactory.getInstance().getStrProcControllers();
	}
}
