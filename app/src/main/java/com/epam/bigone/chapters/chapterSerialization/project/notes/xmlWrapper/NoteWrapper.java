package com.epam.bigone.chapters.chapterSerialization.project.notes.xmlWrapper;

import java.util.List;

import com.epam.bigone.chapters.chapterSerialization.project.notes.entity.Note;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Notes")
public class NoteWrapper {

	private List<Note> notes;

	public NoteWrapper() {}

	public NoteWrapper(List<Note> notes) {
		this.notes = notes;
	}

	public void setItems(List<Note> notes) {
		this.notes = notes;
	}

	@XmlElement(name = "Note")
	public List<Note> getItems() {
		return notes;
	}
}
