package com.epam.bigone.chapters.chapterSerialization.project.notes.dao.xml;

import static java.lang.String.format;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.epam.bigone.chapters.chapterSerialization.project.notes.dao.Item;
import com.epam.bigone.chapters.chapterSerialization.project.notes.entity.Note;
import com.epam.bigone.chapters.chapterSerialization.project.notes.xmlWrapper.NoteWrapper;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class XmlItem implements Item {

	private static final String PATH = "notes/notes.xml";

	private final ClassLoader classLoader = getClass().getClassLoader();

	@Override
	public List<Note> get() {
		try {
			JAXBContext context = JAXBContext.newInstance(NoteWrapper.class, Note.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			var file = new File(getClass().getResource(format("/%s", PATH)).getFile());
			NoteWrapper noteWrapper = (NoteWrapper) unmarshaller.unmarshal(file);
			var items = noteWrapper.getItems();
			return items == null ? new ArrayList<>() : items;
		} catch (JAXBException e) {
			return new ArrayList<>();
		}
	}

	@Override
	public void save(List<Note> notes) {
		NoteWrapper noteWrapper = new NoteWrapper(notes);
		try {
			JAXBContext context = JAXBContext.newInstance(NoteWrapper.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			var file = new File(Objects.requireNonNull(
					classLoader.getResource(PATH)).getFile());
			marshaller.marshal(noteWrapper, file);
		} catch (JAXBException e) {
			e.getMessage();
		}
	}
}