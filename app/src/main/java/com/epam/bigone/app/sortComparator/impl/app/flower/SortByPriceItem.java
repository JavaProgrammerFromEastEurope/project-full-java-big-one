package com.epam.bigone.app.sortComparator.impl.app.flower;

import com.epam.bigone.app.sortComparator.SortTemplate;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.FlowerComposition;

public class SortByPriceItem implements SortTemplate<FlowerComposition> {

	@Override
	public int compare(FlowerComposition o1, FlowerComposition o2) {
		return o2.getPrice() - o1.getPrice();
	}
}
