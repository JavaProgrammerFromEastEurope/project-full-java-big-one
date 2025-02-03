package com.epam.bigone.app.sortComparator.impl.app.note;

import com.epam.bigone.app.sortComparator.SortTemplate;
import com.epam.bigone.chapters.chapterSerialization.project.notes.entity.Note;

public class SortByHeadingNote implements SortTemplate<Note> {

	@Override
	public int compare(Note o1, Note o2) {
		return o1.getHeading().compareTo(o2.getHeading());
	}
}
