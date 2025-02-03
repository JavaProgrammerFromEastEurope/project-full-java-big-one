package com.epam.bigone.chapters.chapterClasses.entity.composition.tourist.entity;

import com.epam.bigone.chapters.chapterClasses.entity.composition.tourist.Tour;
import com.epam.bigone.chapters.chapterClasses.entity.composition.tourist.enums.Duration;
import com.epam.bigone.chapters.chapterClasses.entity.composition.tourist.enums.Supply;
import com.epam.bigone.chapters.chapterClasses.entity.composition.tourist.enums.Transport;

public class Cruise extends Tour {

	public Cruise(int cost, String country, Duration duration, Transport transport, Supply supply) {
		super(cost, country, duration, transport, supply);
	}
}
