package com.epam.bigone.app.sortComparator;

import java.util.Comparator;

public interface SortTemplate<T> extends Comparator<T> {

	@Override
	int compare(T o1, T o2);
}
