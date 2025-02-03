package com.epam.bigone.chapters.chapterFunctions.controllers.impl.stringProcessing;

import static com.epam.bigone.receiver.Receiver.communicationBridge;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.FunctionFactory;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;

public class RegExpController implements FunctionController {

	private final Map<Integer, Function<ParagraphMap>> regExpFunctions;
	private final ParagraphMap paragraph;

	public RegExpController() {
		regExpFunctions = FunctionFactory.getInstance().getRegExpFunctions();
		paragraph = new ParagraphMap();
	}

	@Override
	public void calcFirstFunction() {
		regExpFunctions.get(1).calcFunction(paragraph);
		communicationBridge.sendString(
				regExpFunctions.get(1).getResultString(paragraph));
	}

	@Override
	public void calcSecondFunction() {
		regExpFunctions.get(2).calcFunction(paragraph);
		communicationBridge.sendString(
				regExpFunctions.get(2).getResultString(paragraph));
	}

	@Override
	public void calcThirdFunction() {
		regExpFunctions.get(3).calcFunction(paragraph);
		communicationBridge.sendString(
				regExpFunctions.get(3).getResultString(paragraph));
	}
}
