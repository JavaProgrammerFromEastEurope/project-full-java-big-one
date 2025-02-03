package com.epam.bigone.chapters.chapterSerialization.action;

import java.util.HashMap;
import java.util.Map;

import com.epam.bigone.chapters.chapterSerialization.action.impl.FlowerActions;
import com.epam.bigone.chapters.chapterSerialization.action.impl.NoteActions;
import com.epam.bigone.chapters.chapterSerialization.action.impl.TreasureActions;

public class ActionsFactory {

	private final Map<Integer, ActionTemplate> appActions = new HashMap<>();

	private static final ActionsFactory instance = new ActionsFactory();

	private ActionsFactory() {
		appActions.put(1, new NoteActions());
		appActions.put(2, new TreasureActions());
		appActions.put(3, new FlowerActions());
	}

	public static ActionsFactory getInstance() {
		return instance;
	}

	public Map<Integer, ActionTemplate> getAppsActions() {
		return appActions;
	}
}