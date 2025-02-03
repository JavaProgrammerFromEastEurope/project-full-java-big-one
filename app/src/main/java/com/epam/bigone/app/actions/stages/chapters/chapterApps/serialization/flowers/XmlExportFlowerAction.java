package com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.flowers;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.BaseAppsAction;

public class XmlExportFlowerAction extends BaseAppsAction implements Action, Runnable {

	@Override
	public String description() {
		return "Export Data to XML File";
	}

	@Override
	public void action() {
		Thread thread = new Thread(this, "XmlExportItemThread");
		thread.start();
	}

	@Override
	public void run() {
		appsControllers.get(3).makeEighthAction();
	}
}