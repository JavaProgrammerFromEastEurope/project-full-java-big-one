package com.epam.bigone.chapters.chapterClasses.entity.composition.auto;

import static java.lang.System.out;

public class Wheel {

	void changeWheel() {
		try {
			out.println("Changing wheel in progress.%n");
			Thread.currentThread().wait(1000);
			out.println("Change wheel is complete.");
		} catch (InterruptedException e) {
			e.getMessage();
		}
	}
}