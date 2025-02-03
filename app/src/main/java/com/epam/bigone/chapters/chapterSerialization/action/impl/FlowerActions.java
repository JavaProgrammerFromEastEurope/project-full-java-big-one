package com.epam.bigone.chapters.chapterSerialization.action.impl;

import static com.epam.bigone.receiver.Receiver.communicationBridge;
import static java.lang.String.format;
import static java.lang.System.out;

import java.util.List;

import com.epam.bigone.app.exceptions.daoObjects.NotFoundItemException;
import com.epam.bigone.app.sortComparator.impl.app.flower.SortByNameItem;
import com.epam.bigone.app.sortComparator.impl.app.flower.SortByPriceItem;
import com.epam.bigone.app.util.Input;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterSerialization.action.ActionTemplate;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.dao.serializable.SerializableItem;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.dao.xml.XmlItem;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.Box;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.Flower;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.FlowerComposition;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.factory.BoxFactory;
import com.epam.bigone.chapters.chapterSerialization.project.flowers.entity.factory.FlowerFactory;

public class FlowerActions implements ActionTemplate {

	private static final SerializableItem serializableItems = new SerializableItem();
	private static final XmlItem xmlFlowers = new XmlItem();

	private static final FlowerFactory flowerFactory = FlowerFactory.getInstance();
	private static final BoxFactory boxFactory = BoxFactory.getInstance();

	private static FlowerComposition inputFlowerObject() {
		Flower flower = initFlower();
		Box box = initBox();
		int price = box.getPrice() + (flower.getPrice() * flower.getQuantity());
		return new FlowerComposition(price, box, flower);
	}

	private static Flower initFlower() {
		out.printf("Choose the flower: -> %n 1 - Alstroemeria%n " +
				"2 - Chrysanthemum%n 3 - Lily%n 4 - Rose%n 5 - Tulip%n");
		Flower flower = flowerFactory.valueOf(Input.inputPosition(6));
		flower.setPrice(Input.intInitialize("Input price:"));
		flower.setQuantity(Input.intInitialize("Input quantity:"));
		return flower;
	}

	private static Box initBox() {
		out.printf("Choose the box: -> %n 1 - Basket%n 2 - Bouquet%n 3 - Package%n%n");
		Box box = boxFactory.valueOf(Input.inputPosition(4));
		box.setPrice(Input.intInitialize("Input price:"));
		return box;
	}

	@Override
	public void addObject() {
		try {
			serializableItems.add(inputFlowerObject());
			out.println("Adding flower was successful!");
		} catch (Exception e) {
			communicationBridge.sendString(e.getMessage());
		}
	}

	@Override
	public void updateObject() {
		try {
			var id = (long) Input.intInitialize("Input flower id to update");
			var flower = inputFlowerObject();
			flower.setId(id);
			serializableItems.update(flower);
			out.println("Updating flower was successful!");
		} catch (NotFoundItemException e) {
			communicationBridge.sendString(e.getMessage());
		}
	}

	@Override
	public void removeObject() {
		long id = Input.intInitialize("Input flower id to remove:");
		try {
			serializableItems.remove(id);
			out.println("Removing flower was successful!");
		} catch (NotFoundItemException e) {
			communicationBridge.sendString(e.getMessage());
		}
	}

	@Override
	public void firstSort() {
		out.println(Function.warning);
		List<FlowerComposition> flowerCompositions = serializableItems.get();
		flowerCompositions.sort(new SortByNameItem());
		communicationBridge.sendString(
				printListItems(flowerCompositions));
	}

	@Override
	public void secondSort() {
		out.println(Function.warning);
		List<FlowerComposition> flowerCompositions = serializableItems.get();
		flowerCompositions.sort(new SortByPriceItem());
		communicationBridge.sendString(
				printListItems(flowerCompositions));
	}

	@Override
	public void showMostValObject() {
		List<FlowerComposition> flowerCompositions = serializableItems.get();
		if (flowerCompositions.size() == 0) {
			out.println("List of flowers is empty!");
			return;
		}
		out.println(Function.warning);
		flowerCompositions.sort(new SortByPriceItem());
		communicationBridge.sendString(
				format(" The flower with most val prise:%n %s %n%n",
						flowerCompositions.get(0)));

	}

	@Override
	public void showPriseObject() {
		List<FlowerComposition> flowerCompositions = serializableItems.get();
		if (flowerCompositions.size() == 0) {
			out.println("List of flowers is empty!");
			return;
		}
		int price = Input.intInitialize("Input price for the flower:");
		for (var flower : flowerCompositions) {
			if (flower.getPrice() == price) {
				communicationBridge.sendString(
						format("%s%n", flower));
				return;
			}
		}
		var string = "The flower with price = ";
		out.printf(" %s %d, not found!%n%n", string, price);
	}

	private String printListItems(List<FlowerComposition> flowerCompositions) {
		var resultList = new StringBuilder();
		if (flowerCompositions.size() == 0) {
			out.println("List of flowers is empty!");
			return "";
		}
		for (var flowerComposition : flowerCompositions) {
			resultList.append(format("%s%n", flowerComposition));
		}
		return resultList.toString();
	}

	@Override
	public void xmlExportObject() {
		xmlFlowers.save(serializableItems.get());
		out.println("Exporting flowers to xml file was successful!");
	}
}
