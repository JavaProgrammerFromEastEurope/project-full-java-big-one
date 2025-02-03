package com.epam.bigone.chapters.chapterSerialization.project.notes.dao;

import java.util.List;

import com.epam.bigone.app.exceptions.daoObjects.NotFoundItemException;
import com.epam.bigone.chapters.chapterSerialization.project.notes.entity.Note;

public interface Item {

	List<Note> get();

	default void add(Note newNote) {
		List<Note> notes = get();
		for (Note note : notes) {
			if (note.getId() == newNote.getId()) {
				newNote.setId(
						notes.get(
								notes.size() - 1)
										.getId() + 1);
			}
		}
		notes.add(newNote);
		save(notes);
	}

	default void update(Note newNote) throws NotFoundItemException {
		List<Note> notes = get();
		int index = 0;
		for (Note note : notes) {
			if (note.getId() == newNote.getId()) {
				notes.set(index, newNote);
				save(notes);
				return;
			}
			index++;
		}
		throw new NotFoundItemException(newNote.getId());
	}

	default void remove(long id) throws NotFoundItemException {
		List<Note> notes = get();
		for (Note note : notes) {
			if (note.getId() == id) {
				notes.remove(note);
				save(notes);
				return;
			}
		}
		throw new NotFoundItemException(id);
	}

	void save(List<Note> notes);
}
