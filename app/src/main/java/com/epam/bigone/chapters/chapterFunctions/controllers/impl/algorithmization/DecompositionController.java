package com.epam.bigone.chapters.chapterFunctions.controllers.impl.algorithmization;

import static com.epam.bigone.receiver.Receiver.communicationBridge;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.FunctionFactory;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

public class DecompositionController implements FunctionController {

	private final Map<Integer, Function<CustomArray>> decFunctions;
	private final CustomArray customArray;

	public DecompositionController() {
		decFunctions = FunctionFactory.getInstance().getDecFunctions();
		customArray = new CustomArray();
	}

	@Override
	public void calcFirstFunction() {
		decFunctions.get(1).inputVariables(2, false, false);
		decFunctions.get(1).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(1).getResultString(customArray));
	}

	@Override
	public void calcSecondFunction() {
		decFunctions.get(2).inputVariables(4, false, false);
		decFunctions.get(2).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(2).getResultString(customArray));
	}

	public void calcThirdFunction() {
		decFunctions.get(3).inputVariables(1, false, false);
		decFunctions.get(3).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(3).getResultString(customArray));
	}

	public void calcFourthFunction() {
		decFunctions.get(4).inputVariables(1, false, false);
		decFunctions.get(4).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(4).getResultString(customArray));
	}

	public void calcFifthFunction() {
		decFunctions.get(5).inputVariables(1, false, false);
		decFunctions.get(5).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(5).getResultString(customArray));
	}

	public void calcSixthFunction() {
		decFunctions.get(6).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(6).getResultString(customArray));
	}

	public void calcSeventhFunction() {
		decFunctions.get(7).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(7).getResultString(customArray));
	}

	public void calcEighthFunction() {
		decFunctions.get(8).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(8).getResultString(customArray));
	}

	public void calcNinthFunction() {
		decFunctions.get(9).inputVariables(4, false, false);
		decFunctions.get(9).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(9).getResultString(customArray));
	}

	public void calcTenthFunction() {
		decFunctions.get(10).inputVariables(1, false, false);
		decFunctions.get(10).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(10).getResultString(customArray));
	}

	public void calcEleventhFunction() {
		decFunctions.get(11).inputVariables(2, false, false);
		decFunctions.get(11).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(11).getResultString(customArray));
	}

	public void calcTwelveFunction() {
		decFunctions.get(12).inputVariables(2, false, false);
		decFunctions.get(12).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(12).getResultString(customArray));
	}

	public void calcThirteenFunction() {
		decFunctions.get(13).inputVariables(1, false, false);
		decFunctions.get(13).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(13).getResultString(customArray));
	}

	public void calcFourteenFunction() {
		decFunctions.get(14).inputVariables(1, false, false);
		decFunctions.get(14).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(14).getResultString(customArray));
	}

	public void calcFifteenFunction() {
		decFunctions.get(15).inputVariables(1, false, false);
		decFunctions.get(15).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(15).getResultString(customArray));
	}

	public void calcSixteenFunction() {
		decFunctions.get(16).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(16).getResultString(customArray));
	}

	public void calcSeventeenFunction() {
		decFunctions.get(17).inputVariables(1, false, false);
		decFunctions.get(17).calcFunction(customArray);
		communicationBridge.sendString(
				decFunctions.get(17).getResultString(customArray));
	}
}
