package com.epam.bigone.chapters.chapterFunctions.controllers.impl.devSoftware;

import static com.epam.bigone.receiver.Receiver.communicationBridge;

import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.functions.Function;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.FunctionFactory;
import com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization.CustomArray;

public class BranchStageController implements FunctionController {

	private final Map<Integer, Function<CustomArray>> branchFunctions;
	private final CustomArray customArray;

	public BranchStageController() {
		branchFunctions = FunctionFactory.getInstance().getBranchFunctions();
		customArray = new CustomArray();
	}

	@Override
	public void calcFirstFunction() {
		branchFunctions.get(1).inputVariables(2, false, false);
		branchFunctions.get(1).calcFunction(customArray);
		communicationBridge.sendString(
				branchFunctions.get(1).getResultString(customArray));
	}

	@Override
	public void calcSecondFunction() {
		branchFunctions.get(2).inputVariables(4, false, false);
		branchFunctions.get(2).calcFunction(customArray);
		communicationBridge.sendString(
				branchFunctions.get(2).getResultString(customArray));
	}

	@Override
	public void calcThirdFunction() {
		branchFunctions.get(3).calcFunction(customArray);
		communicationBridge.sendString(
				branchFunctions.get(3).getResultString(customArray));
	}

	public void calcFourthFunction() {
		branchFunctions.get(4).inputVariables(5, false, false);
		branchFunctions.get(4).calcFunction(customArray);
		communicationBridge.sendString(
				branchFunctions.get(4).getResultString(customArray));
	}

	public void calcFifthFunction() {
		branchFunctions.get(5).inputVariables(1, false, false);
		branchFunctions.get(5).calcFunction(customArray);
		communicationBridge.sendString(
				branchFunctions.get(5).getResultString(customArray));
	}
}
