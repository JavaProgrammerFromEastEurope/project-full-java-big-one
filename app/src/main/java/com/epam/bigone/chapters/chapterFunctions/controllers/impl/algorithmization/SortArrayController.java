package com.epam.bigone.chapters.chapterFunctions.controllers.impl.algorithmization;

import static com.epam.bigone.receiver.Receiver.communicationBridge;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.FunctionFactory;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

public class SortArrayController implements FunctionController {

	private final Map<Integer, Function<CustomArray>> sortFunctions;
	private final CustomArray customArray;

	public SortArrayController() {
		sortFunctions = FunctionFactory.getInstance().getSortFunctions();
		customArray = new CustomArray();
	}

	@Override
	public void calcFirstFunction() {
		sortFunctions.get(1).inputVariables(2, false, false);
		sortFunctions.get(1).calcFunction(customArray);
		communicationBridge.sendString(
				sortFunctions.get(1).getResultString(customArray));
	}

	@Override
	public void calcSecondFunction() {
		sortFunctions.get(2).inputVariables(2, false, false);
		sortFunctions.get(2).calcFunction(customArray);
		communicationBridge.sendString(
				sortFunctions.get(2).getResultString(customArray));
	}

	@Override
	public void calcThirdFunction() {
		sortFunctions.get(3).inputVariables(1, false, false);
		sortFunctions.get(3).calcFunction(customArray);
		communicationBridge.sendString(
				sortFunctions.get(3).getResultString(customArray));
	}

	public void calcFourthFunction() {
		sortFunctions.get(4).inputVariables(1, false, false);
		sortFunctions.get(4).calcFunction(customArray);
		communicationBridge.sendString(
				sortFunctions.get(4).getResultString(customArray));
	}

	public void calcFifthFunction() {
		sortFunctions.get(5).inputVariables(1, false, false);
		sortFunctions.get(5).calcFunction(customArray);
		communicationBridge.sendString(
				sortFunctions.get(5).getResultString(customArray));
	}

	public void calcSixthFunction() {
		sortFunctions.get(6).inputVariables(1, false, false);
		sortFunctions.get(6).calcFunction(customArray);
		communicationBridge.sendString(
				sortFunctions.get(6).getResultString(customArray));
	}

	public void calcSeventhFunction() {
		sortFunctions.get(7).inputVariables(2, false, false);
		sortFunctions.get(7).calcFunction(customArray);
		communicationBridge.sendString(
				sortFunctions.get(7).getResultString(customArray));
	}

	public void calcEighthFunction() {
		sortFunctions.get(8).calcFunction(customArray);
		communicationBridge.sendString(
				sortFunctions.get(8).getResultString(customArray));
	}
}
