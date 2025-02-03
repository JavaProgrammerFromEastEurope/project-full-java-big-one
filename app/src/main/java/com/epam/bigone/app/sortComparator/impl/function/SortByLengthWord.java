package com.epam.bigone.app.sortComparator.impl.function;

import com.epam.bigone.app.sortComparator.SortTemplate;

public class SortByLengthWord implements SortTemplate<String> {

	@Override
	public int compare(String o1, String o2) {
			return  o2.length() - o1.length();
	}
}
