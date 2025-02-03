package com.epam.bigone.app.actions.stages.stageActions.impl;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.exceptions.StopApplicationException;
import com.epam.bigone.receiver.Receiver;

public class StopApplicationIAction implements Action {

	@Override
	public String description() {
		return "Exit From Application";
	}

	@Override
	public void action() throws StopApplicationException {
		Receiver.communicationBridge.disconnect();
		throw new StopApplicationException();
	}
}
