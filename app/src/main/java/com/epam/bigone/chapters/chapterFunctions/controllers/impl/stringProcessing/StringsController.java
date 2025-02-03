package com.epam.bigone.chapters.chapterFunctions.controllers.impl.stringProcessing;

import static com.epam.bigone.receiver.Receiver.communicationBridge;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.FunctionFactory;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;

public class StringsController implements FunctionController {

	private final Map<Integer, Function<ParagraphMap>> stringFunctions;
	private final ParagraphMap paragraph;

	public StringsController() {
		stringFunctions = FunctionFactory.getInstance().getStringFunctions();
		paragraph = new ParagraphMap();
	}

	@Override
	public void calcFirstFunction() {
		stringFunctions.get(1).calcFunction(paragraph);
		communicationBridge.sendString(
				stringFunctions.get(1).getResultString(paragraph));
	}

	@Override
	public void calcSecondFunction() {
		stringFunctions.get(2).calcFunction(paragraph);
		communicationBridge.sendString(
				stringFunctions.get(2).getResultString(paragraph));
	}

	@Override
	public void calcThirdFunction() {
		stringFunctions.get(3).calcFunction(paragraph);
		communicationBridge.sendString(
				stringFunctions.get(3).getResultString(paragraph));
	}

	public void calcFourthFunction() {
		stringFunctions.get(4).calcFunction(paragraph);
		communicationBridge.sendString(
				stringFunctions.get(4).getResultString(paragraph));
	}

	public void calcFifthFunction() {

		stringFunctions.get(5).calcFunction(paragraph);
		communicationBridge.sendString(
				stringFunctions.get(5).getResultString(paragraph));
	}
}
