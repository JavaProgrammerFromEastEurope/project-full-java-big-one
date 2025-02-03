package com.epam.bigone.chapters.chapterSerialization.project.flowers.dao;

import java.util.List;

import com.epam.bigone.app.exceptions.daoObjects.NotFoundItemException;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.FlowerComposition;

public interface Item {

	List<FlowerComposition> get();

	default void add(FlowerComposition newFlower) {
		List<FlowerComposition> flowers = get();
		for (FlowerComposition flower : flowers) {
			if (flower.getId() == newFlower.getId()) {
				newFlower.setId(
						flowers.get(
								flowers.size() - 1)
											.getId() + 1);
			}
		}
		flowers.add(newFlower);
		save(flowers);
	}

	default void update(FlowerComposition newFlower) throws NotFoundItemException {
		List<FlowerComposition> flowers = get();
		var index = 0;
		for (FlowerComposition flower : flowers) {
			if (flower.getId() == newFlower.getId()) {
				flowers.set(index, newFlower);
				save(flowers);
				return;
			}
			index++;
		}
		throw new NotFoundItemException(newFlower.getId());
	}

	default void remove(long id) throws NotFoundItemException {
		List<FlowerComposition> flowers = get();
		for (FlowerComposition flower : flowers) {
			if (flower.getId() == id) {
				flowers.remove(flower);
				save(flowers);
				return;
			}
		}
		throw new NotFoundItemException(id);
	}

	void save(List<FlowerComposition> flowerCompositions);
}
