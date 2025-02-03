package com.epam.bigone.app.sortComparator.impl.app.treasure;

import com.epam.bigone.app.sortComparator.SortTemplate;
import com.epam.bigone.chapters.chapterSerialization.project.dragonTreasures.entity.Treasure;

public class SortByNameItem implements SortTemplate<Treasure> {

	@Override
	public int compare(Treasure o1, Treasure o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
