package com.epam.bigone.app.sortComparator.impl.classes.train;

import com.epam.bigone.app.sortComparator.SortTemplate;
import com.epam.bigone.chapters.chapterClasses.entity.common.train.Train;

public class SortByTrainNumber implements SortTemplate<Train> {

	@Override
	public int compare(Train o1, Train o2) {
		return o1.getTrainNumber().compareTo(o2.getTrainNumber());
	}
}