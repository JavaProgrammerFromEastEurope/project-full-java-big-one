package com.epam.bigone.chapters.chapterSerialization.project.flowers.dao.serializable;

import static java.lang.String.format;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.epam.bigone.chapters.chapterSerialization.project.flowers.dao.Item;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.FlowerComposition;

@SuppressWarnings("unchecked")
public class SerializableItem implements Item {
	private static final String PATH = "flowers/flowers.bin";

	@Override
	public List<FlowerComposition> get() {
		try (InputStream stream = getClass().getResourceAsStream(format("/%s", PATH))) {
			var ios = new ObjectInputStream(stream);
			return (List<FlowerComposition>) ios.readObject();
		} catch (IOException | ClassNotFoundException e) {
			return new ArrayList<>();
		}
	}

	@Override
	public void save(List<FlowerComposition> flowerCompositions) {
		try {
			var classLoader = getClass().getClassLoader();
			var file = new File(Objects.requireNonNull(classLoader.getResource(PATH)).getFile());
			var oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(flowerCompositions);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
