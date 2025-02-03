package com.epam.bigone.chapters.chapterSerialization.project.dragonTreasures.xmlWrapper;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

import com.epam.bigone.chapters.chapterSerialization.project.dragonTreasures.entity.Treasure;

@XmlRootElement(name = "Treasures")
public class TreasureWrapper {

	private List<Treasure> treasures;

	public TreasureWrapper() {}

	public TreasureWrapper(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	public void setItems(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	@XmlElement(name = "treasure")
	public List<Treasure> getItems() {
		return treasures;
	}
}