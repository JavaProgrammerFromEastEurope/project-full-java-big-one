package com.epam.bigone.chapters.chapterClasses.entity.common.book;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookCollection {

	private final List<Book> bookList;

	public BookCollection() {
		bookList = new ArrayList<>();
	}

	public BookCollection(List<Book> bookList) {
		this.bookList = bookList;
	}

	public static void printBooksByParameter(
			List<Book> bookList, boolean author, String parameter) {
		Map<Boolean, List<Book>> bookMap = bookList.stream()
				.collect(Collectors.partitioningBy(book -> (author)
						? 	 book.getAuthor().equals(parameter)
						: book.getPublisher().equals(parameter)));
		printBookMap(bookMap);
	}

	public static void printBooksByYear(
			List<Book> bookList, int year) {
		Map<Boolean, List<Book>> bookMap = bookList.stream()
				.collect(Collectors.partitioningBy(book -> book.getPublicationYear() > year));
		printBookMap(bookMap);
	}

	public static void printBookMap(Map<Boolean, List<Book>> booksMap) {
		booksMap.forEach((k, v) -> out.println(
				format("Key:%s  %s", k, v.stream().map(Book::toString)
					.collect(Collectors.joining(",")))));
	}

	public List<Book> getBookList() {
		return bookList;
	}
}