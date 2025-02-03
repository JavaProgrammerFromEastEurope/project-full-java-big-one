package com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.treasures;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.BaseAppsAction;

public class XmlExportTreasureAction extends BaseAppsAction implements Action, Runnable {

	@Override
	public String description() {
		return "Export Data to XML File";
	}

	@Override
	public void action() {
		Thread thread = new Thread(this, "XmlExportTreasureThread");
		thread.start();
	}

	@Override
	public void run() {
		appsControllers.get(2).makeEighthAction();
	}
}