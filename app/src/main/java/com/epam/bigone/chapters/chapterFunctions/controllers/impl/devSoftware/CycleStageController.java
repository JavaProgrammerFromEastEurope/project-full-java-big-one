package com.epam.bigone.chapters.chapterFunctions.controllers.impl.devSoftware;

import static com.epam.bigone.receiver.Receiver.communicationBridge;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.FunctionFactory;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

public class CycleStageController implements FunctionController {

	private final Map<Integer, Function<CustomArray>> cycleFunctions;
	private final CustomArray customArray;

	public CycleStageController() {
		cycleFunctions = FunctionFactory.getInstance().getCycleFunctions();
		customArray = new CustomArray();
	}

	@Override
	public void calcFirstFunction() {
		cycleFunctions.get(1).inputVariables(1, false, false);
		cycleFunctions.get(1).calcFunction(customArray);
		communicationBridge.sendString(
				cycleFunctions.get(1).getResultString(customArray));
	}

	@Override
	public void calcSecondFunction() {
		cycleFunctions.get(2).inputVariables(3, false, false);
		cycleFunctions.get(2).calcFunction(customArray);
		communicationBridge.sendString(
				cycleFunctions.get(2).getResultString(customArray));
	}

	@Override
	public void calcThirdFunction() {
		cycleFunctions.get(3).calcFunction(customArray);
		communicationBridge.sendString(
				cycleFunctions.get(3).getResultString(customArray));
	}

	public void calcFourthFunction() {
		cycleFunctions.get(4).calcFunction(customArray);
		communicationBridge.sendString(
				cycleFunctions.get(4).getResultString(customArray));
	}

	public void calcFifthFunction() {
		cycleFunctions.get(5).inputVariables(1, false, false);
		cycleFunctions.get(5).calcFunction(customArray);
		communicationBridge.sendString(
				cycleFunctions.get(5).getResultString(customArray));
	}

	public void calcSixthFunction() {
		communicationBridge.sendString(
				cycleFunctions.get(6).getResultString(customArray));
	}

	public void calcSeventhFunction() {
		cycleFunctions.get(7).inputVariables(2, false, false);
		cycleFunctions.get(7).calcFunction(customArray);
		communicationBridge.sendString(
				cycleFunctions.get(7).getResultString(customArray));
	}

	public void calcEighthFunction() {
		cycleFunctions.get(8).inputVariables(2, false, false);
		cycleFunctions.get(8).calcFunction(customArray);
		communicationBridge.sendString(
				cycleFunctions.get(8).getResultString(customArray));
	}
}
