package com.epam.bigone.chapters.chapterFunctions.controllers.impl.algorithmization;

import static com.epam.bigone.receiver.Receiver.communicationBridge;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.FunctionFactory;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

public class MatrixArrayController implements FunctionController {

	private final Map<Integer, Function<CustomArray>> matrixFunctions;
	private final CustomArray customArray;

	public MatrixArrayController() {
		matrixFunctions = FunctionFactory.getInstance().getMatrixFunctions();
		customArray = new CustomArray();
	}

	@Override
	public void calcFirstFunction() {
		matrixFunctions.get(1).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(1).getResultString(customArray));
	}

	@Override
	public void calcSecondFunction() {
		matrixFunctions.get(2).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(2).getResultString(customArray));
	}

	@Override
	public void calcThirdFunction() {
		matrixFunctions.get(3).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(3).getResultString(customArray));
	}

	public void calcFourthFunction() {
		matrixFunctions.get(4).inputVariables(1, true, false);
		matrixFunctions.get(4).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(4).getResultString(customArray));
	}

	public void calcFifthFunction() {
		matrixFunctions.get(5).inputVariables(1, true, false);
		matrixFunctions.get(5).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(5).getResultString(customArray));
	}

	public void calcSixthFunction() {
		matrixFunctions.get(6).inputVariables(1, true, false);
		matrixFunctions.get(6).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(6).getResultString(customArray));
	}

	public void calcSeventhFunction() {
		matrixFunctions.get(7).inputVariables(1, false, false);
		matrixFunctions.get(7).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(7).getResultString(customArray));
	}

	public void calcEighthFunction() {
		matrixFunctions.get(8).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(8).getResultString(customArray));
	}

	public void calcNinthFunction() {
		matrixFunctions.get(9).inputVariables(2, false, false);
		matrixFunctions.get(9).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(9).getResultString(customArray));
	}

	public void calcTenthFunction() {
		matrixFunctions.get(10).inputVariables(1, false, false);
		matrixFunctions.get(10).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(10).getResultString(customArray));
	}

	public void calcEleventhFunction() {
		System.out.println(matrixFunctions.size());
		matrixFunctions.get(11).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(11).getResultString(customArray));
	}

	public void calcTwelveFunction() {
		System.out.println(matrixFunctions.size());
		matrixFunctions.get(12).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(12).getResultString(customArray));
	}

	public void calcThirteenFunction() {
		matrixFunctions.get(13).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(13).getResultString(customArray));
	}

	public void calcFourteenFunction() {
		matrixFunctions.get(14).inputVariables(2, false, false);
		matrixFunctions.get(14).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(14).getResultString(customArray));
	}

	public void calcFifteenFunction() {
		matrixFunctions.get(15).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(15).getResultString(customArray));
	}

	public void calcSixteenFunction() {
		matrixFunctions.get(16).inputVariables(1, false, false);
		matrixFunctions.get(16).calcFunction(customArray);
		communicationBridge.sendString(
				matrixFunctions.get(16).getResultString(customArray));
	}
}
