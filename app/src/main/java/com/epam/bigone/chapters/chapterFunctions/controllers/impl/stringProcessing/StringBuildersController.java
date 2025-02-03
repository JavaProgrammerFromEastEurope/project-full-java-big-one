package com.epam.bigone.chapters.chapterFunctions.controllers.impl.stringProcessing;

import static com.epam.bigone.receiver.Receiver.communicationBridge;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.FunctionFactory;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMap;

public class StringBuildersController implements FunctionController {

	private final Map<Integer, Function<ParagraphMap>> buildFunctions;
	private final ParagraphMap paragraph;

	public StringBuildersController() {
		buildFunctions = FunctionFactory.getInstance().getBuildFunctions();
		paragraph = new ParagraphMap();
	}

	@Override
	public void calcFirstFunction() {
		buildFunctions.get(1).calcFunction(paragraph);
		communicationBridge.sendString(
				buildFunctions.get(1).getResultString(paragraph));
	}

	@Override
	public void calcSecondFunction() {
		buildFunctions.get(2).calcFunction(paragraph);
		communicationBridge.sendString(
				buildFunctions.get(2).getResultString(paragraph));
	}

	@Override
	public void calcThirdFunction() {
		buildFunctions.get(3).calcFunction(paragraph);
		communicationBridge.sendString(
				buildFunctions.get(3).getResultString(paragraph));
	}

	public void calcFourthFunction() {
		buildFunctions.get(4).calcFunction(paragraph);
		communicationBridge.sendString(
				buildFunctions.get(4).getResultString(paragraph));
	}

	public void calcFifthFunction() {
		buildFunctions.get(5).calcFunction(paragraph);
		communicationBridge.sendString(
				buildFunctions.get(5).getResultString(paragraph));
	}

	public void calcSixthFunction() {
		buildFunctions.get(6).calcFunction(paragraph);
		communicationBridge.sendString(
				buildFunctions.get(6).getResultString(paragraph));
	}

	public void calcSeventhFunction() {
		buildFunctions.get(7).calcFunction(paragraph);
		communicationBridge.sendString(
				buildFunctions.get(7).getResultString(paragraph));
	}

	public void calcEighthFunction() {
		buildFunctions.get(8).calcFunction(paragraph);
		communicationBridge.sendString(
				buildFunctions.get(8).getResultString(paragraph));
	}

	public void calcNinthFunction() {
		buildFunctions.get(9).calcFunction(paragraph);
		communicationBridge.sendString(
				buildFunctions.get(9).getResultString(paragraph));
	}

	public void calcTenthFunction() {
		buildFunctions.get(10).calcFunction(paragraph);
		communicationBridge.sendString(
				buildFunctions.get(10).getResultString(paragraph));
	}
}
