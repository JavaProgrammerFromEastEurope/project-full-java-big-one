package com.epam.bigone.app;

import static com.epam.bigone.app.util.Input.anyIntInitialize;
import static java.lang.System.out;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.StageActionFactory;
import com.epam.bigone.app.exceptions.StopApplicationException;
import com.epam.bigone.app.exceptions.WrongStageException;

public class Application {

	static final StageActionFactory stageFactory = StageActionFactory.getInstance();

	public static void startEntertainment() {
		out.println("Welcome! Entertainment has become!");
		actionStages();
	}

	private static void actionStages() {
		stageFactory.setDefaultStage();
		while (true)
			try {
				getActionStage().action();
			} catch (StopApplicationException e) {
				break;
			}
	}

	private static Action getActionStage() {
		stageFactory.showStageMenu();
		int index = anyIntInitialize();
		try {
			return stageFactory.getActionStage(index);
		} catch (WrongStageException e) {
			out.println(e.getMessage());
		}
		return getActionStage();
	}
}
