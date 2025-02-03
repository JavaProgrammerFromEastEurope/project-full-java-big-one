package com.epam.bigone.app.sortComparator.impl.function;

import com.epam.bigone.app.sortComparator.SortTemplate;

public class SortByHigherObject implements SortTemplate<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		return (int) o2 - (int) o1;
	}
}
