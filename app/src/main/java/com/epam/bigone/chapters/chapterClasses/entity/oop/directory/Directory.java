package com.epam.bigone.chapters.chapterClasses.entity.oop.directory;

import java.util.List;
import java.util.Objects;

import com.epam.bigone.app.util.Input;

public class Directory {

	private final String directoryName;
	private final List<TextFile> files;

	public Directory(String directoryName, List<TextFile> files) {
		this.directoryName = directoryName;
		this.files = files;
	}

	public String getDirectoryName() {
		return directoryName;
	}

	public void createNewFile() {
		files.add(new TextFile(
				Input.getString("Please, input file name."),
				Input.intInitialize("Please, input an int size of file.")));
	}

	public void renameFile(int fileIndex) {
		TextFile file = files.get(fileIndex);
		file.setFilename(
				Input.getString("Please, input file name."));
	}

	public String getTextBody(int fileIndex) {
		TextFile file = files.get(fileIndex);
		return file.getTextBody();
	}

	public void updateFile(int fileIndex) {
		TextFile file = files.get(fileIndex);
		file.setTextBody(
				Input.getString("Please, input body of text file."));
	}

	public void removeFile(int fileIndex) {
		files.remove(fileIndex);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Directory directory = (Directory) o;
		return Objects.equals(directoryName, directory.directoryName)
				&& Objects.equals(files, directory.files);
	}

	@Override
	public int hashCode() {
		return Objects.hash(directoryName, files);
	}

	@Override
	public String toString() {
		return String.format("Directory has files: %n {%s}", files);
	}
}