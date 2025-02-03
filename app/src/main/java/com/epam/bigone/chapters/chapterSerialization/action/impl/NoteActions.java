package com.epam.bigone.chapters.chapterSerialization.action.impl;

import static com.epam.bigone.receiver.Receiver.communicationBridge;
import static java.lang.String.format;
import static java.lang.System.out;

import java.util.List;

import com.epam.bigone.app.exceptions.daoObjects.NotFoundItemException;
import com.epam.bigone.app.sortComparator.impl.app.note.SortByFromNote;
import com.epam.bigone.app.sortComparator.impl.app.note.SortByHeadingNote;
import com.epam.bigone.app.util.Input;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterSerialization.action.ActionTemplate;
import com.epam.bigone.chapters.chapterSerialization.project.notes.dao.xml.XmlItem;
import com.epam.bigone.chapters.chapterSerialization.project.notes.entity.Note;

public class NoteActions implements ActionTemplate {

	private final XmlItem serializableNotes = new XmlItem();

	private static Note inputNoteObject() {
		String to = Input.getString("Input To:");
		String from = Input.getString("Input From:");
		String heading = Input.getString("Input Heading:");
		String body = Input.getString("Input Body:");
		return new Note(to, from, heading, body);
	}

	@Override
	public void addObject() {
		try {
			serializableNotes.add(inputNoteObject());
			out.println("Adding note was successful!");
		} catch (Exception e) {
			communicationBridge.sendString(e.getMessage());
		}
	}

	@Override
	public void updateObject() {
		try {
			var id = (long) Input.intInitialize("Input note id to update");
			var flower = inputNoteObject();
			flower.setId(id);
			serializableNotes.update(flower);
			out.println("Updating note was successful!");
		} catch (NotFoundItemException e) {
			communicationBridge.sendString(e.getMessage());
		}
	}

	@Override
	public void removeObject() {
		long id = Input.intInitialize("Input note id to remove:");
		try {
			serializableNotes.remove(id);
			out.println("Removing note was successful!");
		} catch (NotFoundItemException e) {
			communicationBridge.sendString(e.getMessage());
		}
	}

	@Override
	public void firstSort() {
		out.println(Function.warning);
		List<Note> notes = serializableNotes.get();
		notes.sort(new SortByFromNote());
		communicationBridge.sendString(
				printListItems(notes));
	}

	@Override
	public void secondSort() {
		out.println(Function.warning);
		List<Note> notes = serializableNotes.get();
		notes.sort(new SortByHeadingNote());
		communicationBridge.sendString(
				printListItems(notes));
	}

	private String printListItems(List<Note> notes) {
		var resultList = new StringBuilder();
		if (notes.size() == 0) {
			resultList.append("List of notes is empty!");
			return resultList.toString();
		}
		for (var note : notes) {
			resultList.append(format("%s%n", note));
		}
		return resultList.toString();
	}
}