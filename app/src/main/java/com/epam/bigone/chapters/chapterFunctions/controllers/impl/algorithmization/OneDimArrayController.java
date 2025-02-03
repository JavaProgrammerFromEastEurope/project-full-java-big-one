package com.epam.bigone.chapters.chapterFunctions.controllers.impl.algorithmization;

import static com.epam.bigone.receiver.Receiver.communicationBridge;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.FunctionFactory;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

public class OneDimArrayController implements FunctionController {

	private final Map<Integer, Function<CustomArray>> arrayFunctions;
	private final CustomArray customArray;

	public OneDimArrayController() {
		arrayFunctions = FunctionFactory.getInstance().getMatrixFunctions();
		customArray = new CustomArray();
	}

	@Override
	public void calcFirstFunction() {
		arrayFunctions.get(1).inputVariables(2,false,false);
		arrayFunctions.get(1).calcFunction(customArray);
		communicationBridge.sendString(
				arrayFunctions.get(1).getResultString(customArray));
	}

	@Override
	public void calcSecondFunction() {
		arrayFunctions.get(2).inputVariables(2, false, false);
		arrayFunctions.get(2).calcFunction(customArray);
		communicationBridge.sendString(
				arrayFunctions.get(2).getResultString(customArray));
	}

	@Override
	public void calcThirdFunction() {
		arrayFunctions.get(3).inputVariables(1, false, false);
		arrayFunctions.get(3).calcFunction(customArray);
		communicationBridge.sendString(
				arrayFunctions.get(3).getResultString(customArray));
	}

	public void calcFourthFunction() {
		arrayFunctions.get(4).inputVariables(1, false, false);
		arrayFunctions.get(4).calcFunction(customArray);
		communicationBridge.sendString(
				arrayFunctions.get(4).getResultString(customArray));
	}

	public void calcFifthFunction() {
		arrayFunctions.get(5).inputVariables(1, false, false);
		arrayFunctions.get(5).calcFunction(customArray);
		communicationBridge.sendString(
				arrayFunctions.get(5).getResultString(customArray));
	}

	public void calcSixthFunction() {
		arrayFunctions.get(6).inputVariables(1, false, false);
		arrayFunctions.get(6).calcFunction(customArray);
		communicationBridge.sendString(
				arrayFunctions.get(6).getResultString(customArray));
	}

	public void calcSeventhFunction() {
		arrayFunctions.get(7).inputVariables(1, false, false);
		arrayFunctions.get(7).calcFunction(customArray);
		communicationBridge.sendString(
				arrayFunctions.get(7).getResultString(customArray));
	}

	public void calcEighthFunction() {
		arrayFunctions.get(8).inputVariables(1, false, false);
		arrayFunctions.get(8).calcFunction(customArray);
		communicationBridge.sendString(
				arrayFunctions.get(8).getResultString(customArray));
	}

	public void calcNinthFunction() {
		arrayFunctions.get(9).inputVariables(1, false, false);
		arrayFunctions.get(9).calcFunction(customArray);
		communicationBridge.sendString(
				arrayFunctions.get(9).getResultString(customArray));
	}

	public void calcTenthFunction() {
		arrayFunctions.get(10).inputVariables(1, false, false);
		arrayFunctions.get(10).calcFunction(customArray);
		communicationBridge.sendString(
				arrayFunctions.get(10).getResultString(customArray));
	}
}
