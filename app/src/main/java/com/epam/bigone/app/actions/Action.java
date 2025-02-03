package com.epam.bigone.app.actions;

import com.epam.bigone.app.exceptions.StopApplicationException;

public interface Action {

	String description();

	void action() throws StopApplicationException;
}
