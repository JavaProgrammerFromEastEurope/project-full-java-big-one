package com.epam.bigone.app.sortComparator.impl.classes.train;

import com.epam.bigone.app.sortComparator.SortTemplate;
import com.epam.bigone.chapters.chapterClasses.entity.common.train.Train;
import com.epam.bigone.chapters.chapterClasses.entity.common.train.Travel;

public class SortByTravel implements SortTemplate<Train> {

	@Override
	public int compare(Train o1, Train o2) {
		o1.getSchedule().sort(Travel::compareTo);
		o2.getSchedule().sort(Travel::compareTo);
		return 	o1.getSchedule().hashCode()
					- o2.getSchedule().hashCode();
	}
}
