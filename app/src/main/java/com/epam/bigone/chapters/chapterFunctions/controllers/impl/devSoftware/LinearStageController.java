package com.epam.bigone.chapters.chapterFunctions.controllers.impl.devSoftware;

import static com.epam.bigone.receiver.Receiver.communicationBridge;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.FunctionFactory;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

public class LinearStageController implements FunctionController {

	private final Map<Integer, Function<CustomArray>> lineFunctions;
	private final CustomArray customArray;

	public LinearStageController() {
		lineFunctions = FunctionFactory.getInstance().getLineFunctions();
		customArray = new CustomArray();
	}

	@Override
	public void calcFirstFunction() {
		lineFunctions.get(1).inputVariables(3, false, true);
		lineFunctions.get(1).calcFunction(customArray);
		communicationBridge.sendString(
				lineFunctions.get(1).getResultString(customArray));
	}

	@Override
	public void calcSecondFunction() {
		lineFunctions.get(2).inputVariables(3, false, true);
		lineFunctions.get(2).calcFunction(customArray);
		communicationBridge.sendString(
				lineFunctions.get(2).getResultString(customArray));
	}

	@Override
	public void calcThirdFunction() {
		lineFunctions.get(3).inputVariables(2, false, true);
		lineFunctions.get(3).calcFunction(customArray);
		communicationBridge.sendString(
				lineFunctions.get(3).getResultString(customArray));
	}

	public void calcFourthFunction() {
		lineFunctions.get(4).inputVariables(1, false, true);
		lineFunctions.get(4).calcFunction(customArray);
		communicationBridge.sendString(
				lineFunctions.get(4).getResultString(customArray));
	}

	public void calcFifthFunction() {
		lineFunctions.get(5).inputVariables(1, false, false);
		lineFunctions.get(5).calcFunction(customArray);
		communicationBridge.sendString(
				lineFunctions.get(5).getResultString(customArray));
	}

	public void calcSixthFunction() {
		lineFunctions.get(6).calcFunction(customArray);
		communicationBridge.sendString(
				lineFunctions.get(6).getResultString(customArray));
	}
}
