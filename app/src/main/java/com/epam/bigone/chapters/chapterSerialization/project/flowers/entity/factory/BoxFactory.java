package com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.factory;

import java.util.HashMap;
import java.util.Map;

import com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.Box;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.box.Basket;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.box.Bouquet;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.box.Package;

public class BoxFactory {
	private final Map<Integer, Box> boxes = new HashMap<>();

	private static BoxFactory instance = new BoxFactory();

	private BoxFactory() {
		boxes.put(1, new Basket("Basket"));
		boxes.put(2, new Bouquet("Bouquet"));
		boxes.put(3, new Package("Package"));
	}

	public Box valueOf(int i) {
		switch (i) {
			case 1:
				return boxes.get(1);
			case 2:
				return boxes.get(2);
			case 3:
				return boxes.get(3);
		}
		return boxes.get(2);
	}

	public static BoxFactory getInstance() {
		return instance;
	}
}
