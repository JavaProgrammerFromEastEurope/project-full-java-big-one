package com.epam.bigone.chapters.chapterClasses.entity.composition.tourist;

import java.util.List;

import com.epam.bigone.app.sortComparator.impl.classes.tour.SortByTourCost;

public class TourCollection {

	final List<Tour> tours;

	public TourCollection(List<Tour> arrayList) {
		this.tours = arrayList;
	}

	public List<Tour> getTours() {
		return tours;
	}

	public List<Tour> sortAccountsByCost() {
		tours.sort(new SortByTourCost());
		return tours;
	}
}