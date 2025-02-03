package com.epam.bigone.chapters.chapterSerialization.project.dragonTreasures.dao.xml;

import static java.lang.String.format;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.epam.bigone.chapters.chapterSerialization.project.dragonTreasures.dao.Item;
import com.epam.bigone.chapters.chapterSerialization.project.dragonTreasures.entity.Treasure;
import com.epam.bigone.chapters.chapterSerialization.project.dragonTreasures.xmlWrapper.TreasureWrapper;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class XmlItem implements Item {
	private static final String PATH = "treasures/treasures.xml";

	private final ClassLoader classLoader = getClass().getClassLoader();

	@Override
	public List<Treasure> get() {
		try {
			JAXBContext context = JAXBContext.newInstance(TreasureWrapper.class, Treasure.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			var file = new File(getClass().getResource(format("/%s", PATH)).getFile());
			TreasureWrapper treasureWrapper = (TreasureWrapper) unmarshaller.unmarshal(file);
			var items = treasureWrapper.getItems();
			return items == null ? new ArrayList<>() : items;
		} catch (JAXBException e) {
			return new ArrayList<>();
		}
	}

	@Override
	public void save(List<Treasure> treasures) {
		TreasureWrapper treasureWrapper = new TreasureWrapper(treasures);
		try {
			JAXBContext context = JAXBContext.newInstance(TreasureWrapper.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			var file = new File(
					Objects.requireNonNull(classLoader.getResource(PATH)).getFile());
			marshaller.marshal(treasureWrapper, file);
		} catch (JAXBException e) {
			e.getMessage();
		}
	}
}
