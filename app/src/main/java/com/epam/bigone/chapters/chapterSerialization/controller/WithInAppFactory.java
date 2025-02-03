package com.epam.bigone.chapters.chapterSerialization.controller;

import java.util.HashMap;
import java.util.Map;

import com.epam.bigone.chapters.chapterSerialization.controller.impl.FlowersController;
import com.epam.bigone.chapters.chapterSerialization.controller.impl.NoteController;
import com.epam.bigone.chapters.chapterSerialization.controller.impl.TreasureController;

public class WithInAppFactory {

	private final Map<Integer, ApplicationController> appsControllers = new HashMap<>();

	private static final WithInAppFactory instance = new WithInAppFactory();

	private WithInAppFactory() {
		appsControllers.put(1, new NoteController());
		appsControllers.put(2, new TreasureController());
		appsControllers.put(3, new FlowersController());
	}

	public static WithInAppFactory getInstance() {
		return instance;
	}

	public Map<Integer, ApplicationController> getAppsControllers() {
		return appsControllers;
	}
}