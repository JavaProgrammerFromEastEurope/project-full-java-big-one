package com.epam.bigone.app.sortComparator.impl.classes.tour;

import com.epam.bigone.app.sortComparator.SortTemplate;
import com.epam.bigone.chapters.chapterClasses.entity.composition.tourist.Tour;

public class SortByTourCost implements SortTemplate<Tour> {
	@Override
	public int compare(Tour o1, Tour o2) {
		return o1.getCost() - o2.getCost();
	}
}