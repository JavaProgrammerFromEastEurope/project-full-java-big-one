package com.epam.bigone.chapters.chapterClasses.action.impl;

import static java.lang.System.out;

import com.epam.bigone.app.util.Input;
import com.epam.bigone.chapters.chapterClasses.action.ClassAction;

public class Test2Action implements ClassAction {

	private int first;
	private int second;

	private Test2Action instance1, instance2;

	private Test2Action(int first, int second) {
		this.first = first;
		this.second = second;
	}

	private Test2Action() {
		this.first = 0;
		this.second = 0;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return "Test2{" +
				"first=" + first +
				", second=" + second +
				'}';
	}

	@Override
	public void inputVariables() {
		instance1 = new Test2Action();
		instance2 = new Test2Action(
				Input.intInitialize("Input 1 integer:"),
				Input.intInitialize("Input 2 integer:"));
	}

	@Override
	public void printResult() {
		addString[0] = " The instance1 variable:";
		addString[1] = " The instance2 variable:";
		out.printf(" %s %d%n %s %d%n%n",
				addString[0], instance1.toString(),
				addString[1], instance2.toString());
		ClassAction.super.setDefaultOperations();
	}
}