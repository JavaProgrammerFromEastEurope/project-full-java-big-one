package com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.FunctionsFactory;

public class BaseAlgorithmAction {

	public final Map<Integer, FunctionController> algorithmActions;

	public BaseAlgorithmAction() {
		this.algorithmActions = FunctionsFactory.getInstance().getAlgorithmControllers();
	}
}
