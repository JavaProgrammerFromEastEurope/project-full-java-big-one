package com.epam.bigone;

import com.epam.bigone.app.Application;
import com.epam.bigone.receiver.Connection;

public class Main {
	public static void main(String[] args) {
		Connection.connect();
		Application.startEntertainment();
	}
}