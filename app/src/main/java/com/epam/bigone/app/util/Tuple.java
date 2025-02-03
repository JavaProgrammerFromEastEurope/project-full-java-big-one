package com.epam.bigone.app.util;

public class Tuple<T1, T2> {

	private final T1 firstItem;
	private final T2 secondItem;

	public Tuple(T1 firstItem, T2 secondItem) {
		this.firstItem = firstItem;
		this.secondItem = secondItem;
	}

	public T1 getFirstItem() {
		return firstItem;
	}

	public T2 getSecondItem() {
		return secondItem;
	}
}
