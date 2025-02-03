package com.epam.bigone.app.sortComparator.impl.app.treasure;

import com.epam.bigone.app.sortComparator.SortTemplate;
import com.epam.bigone.chapters.chapterSerialization.project.dragonTreasures.entity.Treasure;

public class SortByPriceItem implements SortTemplate<Treasure> {

	@Override
	public int compare(Treasure o1, Treasure o2) {
		return o2.getPrice() - o1.getPrice();
	}
}