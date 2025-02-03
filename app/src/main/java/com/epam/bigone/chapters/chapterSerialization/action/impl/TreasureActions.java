package com.epam.bigone.chapters.chapterSerialization.action.impl;

import static com.epam.bigone.receiver.Receiver.communicationBridge;
import static java.lang.String.format;
import static java.lang.System.out;

import java.util.List;

import com.epam.bigone.app.exceptions.daoObjects.NotFoundItemException;
import com.epam.bigone.app.sortComparator.impl.app.treasure.SortByNameItem;
import com.epam.bigone.app.sortComparator.impl.app.treasure.SortByPriceItem;
import com.epam.bigone.app.util.Input;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterSerialization.action.ActionTemplate;
import com.epam.bigone.chapters.chapterSerialization.project.dragonTreasures.dao.serializable.SerializableItem;
import com.epam.bigone.chapters.chapterSerialization.project.dragonTreasures.dao.xml.XmlItem;
import com.epam.bigone.chapters.chapterSerialization.project.dragonTreasures.entity.Treasure;

public class TreasureActions implements ActionTemplate {

	private static final SerializableItem serializableItems = new SerializableItem();
	private static final XmlItem xmlTreasure = new XmlItem();

	private static Treasure inputTreasureObject() {
		int price = Input.intInitialize("Input cost:");
		String type = Input.getString("Input type:");
		String name = Input.getString("Input name:");
		return new Treasure(price, type, name);
	}

	@Override
	public void addObject() {
		try {
			serializableItems.add(inputTreasureObject());
			out.println("Adding new treasure was successful!");
		} catch (Exception e) {
			communicationBridge.sendString(e.getMessage());
		}
	}

	@Override
	public void updateObject() {
		try {
			long id = Input.intInitialize("Input treasure id to update");
			var treasure = inputTreasureObject();
			treasure.setId(id);
			serializableItems.update(treasure);
			out.println("Updating inputted flower was successful!");
		} catch (NotFoundItemException e) {
			communicationBridge.sendString(e.getMessage());
		}
	}

	@Override
	public void removeObject() {
		long id = Input.intInitialize("Input treasure id to remove:");
		try {
			serializableItems.remove(id);
			out.println("Removing inputted treasure was successful!");
		} catch (NotFoundItemException e) {
			communicationBridge.sendString(e.getMessage());
		}
	}

	@Override
	public void firstSort() {
		out.println(Function.warning);
		List<Treasure> treasures = serializableItems.get();
		treasures.sort(new SortByNameItem());
		communicationBridge.sendString(
				printListItems(treasures));
	}

	@Override
	public void secondSort() {
		out.println(Function.warning);
		List<Treasure> treasures = serializableItems.get();
		treasures.sort(new SortByPriceItem());
		communicationBridge.sendString(
				printListItems(treasures));
	}

	@Override
	public void showMostValObject() {
		List<Treasure> treasures = serializableItems.get();
		if (treasures.size() == 0) {
			out.println("List of treasures is empty!");
			return;
		}
		out.println(Function.warning);
		treasures.sort(new SortByPriceItem());
		communicationBridge.sendString(
				format(" The treasure with most val prise:%n %s %n%n",
						treasures.get(0)));
	}

	@Override
	public void showPriseObject() {
		List<Treasure> treasures = serializableItems.get();
		if (treasures.size() == 0) {
			out.println("List of treasures is empty!");
			return;
		}
		out.println(Function.warning);
		int price = Input.intInitialize("Input price for the treasure:");
		for (var treasure : treasures) {
			if (treasure.getPrice() == price) {
				communicationBridge.sendString(
						format("%s%n", treasure));
				return;
			}
		}
		var string = "The treasure with price = ";
		out.printf(" %s %d, not found!%n%n", string, price);
	}

	private String printListItems(List<Treasure> treasures) {
		var resultList = new StringBuilder();
		if (treasures.size() == 0) {
			out.println("List of treasures is empty!");
			return "";
		}
		for (var treasure : treasures) {
			resultList.append(format("%s%n", treasure));
		}
		return resultList.toString();
	}

	@Override
	public void xmlExportObject() {
		xmlTreasure.save(serializableItems.get());
		out.println("Exporting treasures to xml file was successful!");
	}
}