package com.epam.bigone.chapters.chapterSerialization.project.notes.dao.serializable;

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

import com.epam.bigone.chapters.chapterSerialization.project.notes.dao.Item;
import com.epam.bigone.chapters.chapterSerialization.project.notes.entity.Note;

@SuppressWarnings("unchecked")
public class SerializableItem implements Item {
	private static final String PATH = "notes/notes.bin";
	private ObjectOutputStream oos;

	@Override
	public List<Note> get() {
		try (InputStream stream = getClass().getResourceAsStream(format("/%s", PATH))) {
			var ios = new ObjectInputStream(stream);
			return (List<Note>) ios.readObject();
		} catch (IOException | ClassNotFoundException e) {
			return new ArrayList<>();
		}
	}

	@Override
	public void save(List<Note> notes) {
		try {
			var classLoader = getClass().getClassLoader();
			var file = new File(Objects.requireNonNull(classLoader.getResource(PATH)).getFile());
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(notes);
			oos.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}
}