package com.epam.bigone.chapters.chapterClasses.entity.composition.tourist.enums;

public enum Supply {
	Snacks, Restaurant, DryRation, Smorgasbord;

	public static Supply valueOf(int i) {
		switch (i) {
			case 0:
				return Smorgasbord;
			case 1:
				return DryRation;
			case 2:
				return Restaurant;
			default:
				return Snacks;
		}
	}
}