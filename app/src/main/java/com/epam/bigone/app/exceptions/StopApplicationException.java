package com.epam.bigone.app.exceptions;

public class StopApplicationException extends Exception {

	@Override
	public String getMessage() {
		return "The application has finished it's work! (unprintable)";
	}
}
