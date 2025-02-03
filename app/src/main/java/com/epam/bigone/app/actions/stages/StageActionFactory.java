package com.epam.bigone.app.actions.stages;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;

import com.epam.bigone.app.actions.Action;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.notes.*;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.flowers.*;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.treasures.*;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.treasures.SortByNameTreasureAction;
import com.epam.bigone.app.actions.stages.chapters.chapterApps.serialization.treasures.SortByPriceTreasureAction;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageDecActions.*;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageMatrixArrayAction.*;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageOneDimArrayAction.*;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.algorithmization.stageSortArrayActions.*;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageBranchActions.*;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageCycleActions.*;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.devSoftware.stageLineActions.*;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageRegExpressions.*;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageStrArrays.*;
import com.epam.bigone.app.actions.stages.chapters.chapterFunctions.stringProcessing.stageStringBuilder.*;
import com.epam.bigone.app.actions.stages.stageActions.impl.*;
import com.epam.bigone.app.exceptions.WrongStageException;

public class StageActionFactory {

	private final Map<Integer, Action> branchStage 	= new HashMap<>();
	private final Map<Integer, Action> cycleStage 	= new HashMap<>();
	private final Map<Integer, Action> lineStage 		= new HashMap<>();
	private final Map<Integer, Action> arrayStage 	= new HashMap<>();
	private final Map<Integer, Action> matrixStage 	= new HashMap<>();
	private final Map<Integer, Action> sortStage 		= new HashMap<>();
	private final Map<Integer, Action> decStage 		= new HashMap<>();
	private final Map<Integer, Action> stringStage 	= new HashMap<>();
	private final Map<Integer, Action> buildStage 	= new HashMap<>();
	private final Map<Integer, Action> regExpStage 	= new HashMap<>();

	private final Map<Integer, Action> notesStage 	= new HashMap<>();
	private final Map<Integer, Action> flowerStage 	= new HashMap<>();
	private final Map<Integer, Action> treasureStage 	= new HashMap<>();
	private final Map<Integer, Action> flowersInStage 	= new HashMap<>();
	private final Map<Integer, Action> treasureInStage 	= new HashMap<>();

	private final Map<Integer, Action> defaultStage = new HashMap<>();

	private Map<Integer, Action> currentStage = defaultStage;

	private static final StageActionFactory instance = new StageActionFactory();

	private StageActionFactory() {
		branchStage.put(1, new FirstBranchAction());
		branchStage.put(2, new SecondBranchAction());
		branchStage.put(3, new ThirdBranchAction());
		branchStage.put(4, new FourBranchAction());
		branchStage.put(5, new FifthBranchAction());

		cycleStage.put(1, new FirstCycleAction());
		cycleStage.put(2, new SecondCycleAction());
		cycleStage.put(3, new ThirdCycleAction());
		cycleStage.put(4, new FourthCycleAction());
		cycleStage.put(5, new FifthCycleAction());
		cycleStage.put(6, new SixthCycleAction());
		cycleStage.put(7, new SevenCycleAction());
		cycleStage.put(8, new EightCycleAction());

		lineStage.put(1, new FirstLineAction());
		lineStage.put(2, new SecondLineAction());
		lineStage.put(3, new ThirdLineAction());
		lineStage.put(4, new FourthLineAction());
		lineStage.put(5, new FifthLineAction());
		lineStage.put(6, new SixthLineAction());

		arrayStage.put(1, new FirstOneDimArrayAction());
		arrayStage.put(2, new SecondOneDimArrayAction());
		arrayStage.put(3, new ThirdOneDimArrayAction());
		arrayStage.put(4, new FourthOneDimArrayAction());
		arrayStage.put(5, new FifthOneDimArrayAction());
		arrayStage.put(6, new SixthOneDimArrayAction());
		arrayStage.put(7, new SeventhOneDimArrayAction());
		arrayStage.put(8, new EightOneDimArrayAction());
		arrayStage.put(9, new NinthOneDimArrayAction());
		arrayStage.put(10, new TenthOneDimArrayAction());

		matrixStage.put(1, new FirstMatrixAction());
		matrixStage.put(2, new SecondMatrixAction());
		matrixStage.put(3, new ThirdMatrixAction());
		matrixStage.put(4, new FourthMatrixAction());
		matrixStage.put(5, new FifthMatrixAction());
		matrixStage.put(6, new SixthMatrixAction());
		matrixStage.put(7, new SeventhMatrixAction());
		matrixStage.put(8, new EighthMatrixAction());
		matrixStage.put(9, new NinthMatrixAction());
		matrixStage.put(10, new TenthMatrixAction());
		matrixStage.put(11, new EleventhMatrixAction());
		matrixStage.put(12, new TwelveMatrixAction());
		matrixStage.put(13, new ThirteenMatrixAction());
		matrixStage.put(14, new FourteenMatrixAction());
		matrixStage.put(15, new FifteenMatrixAction());
		matrixStage.put(16, new SixteenMatrixAction());

		sortStage.put(1, new FirstSortArrayAction());
		sortStage.put(2, new SecondSortArrayAction());
		sortStage.put(3, new ThirdSortArrayAction());
		sortStage.put(4, new FourthSortArrayAction());
		sortStage.put(5, new FifthSortArrayAction());
		sortStage.put(6, new SixthSortArrayAction());
		sortStage.put(7, new SeventhSortArrayAction());
		sortStage.put(8, new EightSortArrayAction());

		decStage.put(1, new FirstDecAction());
		decStage.put(2, new SecondDecAction());
		decStage.put(3, new ThirdDecAction());
		decStage.put(4, new FourthDecAction());
		decStage.put(5, new FifthDecAction());
		decStage.put(6, new SixthDecAction());
		decStage.put(7, new SevenDecAction());
		decStage.put(8, new EightDecAction());
		decStage.put(9, new NinthDecAction());
		decStage.put(10, new TenthDecAction());
		decStage.put(11, new ElevenDecAction());
		decStage.put(12, new TwelveDecAction());
		decStage.put(13, new ThirteenDecAction());
		decStage.put(14, new FourteenDecAction());
		decStage.put(15, new FifteenDecAction());
		decStage.put(16, new SixteenDecAction());
		decStage.put(17, new SeventeenthDecAction());

		stringStage.put(1, new FirstStringArrayAction());
		stringStage.put(2, new SecondStringArrayAction());
		stringStage.put(3, new ThirdStringArrayAction());
		stringStage.put(4, new FourthStringArrayAction());
		stringStage.put(5, new FifthStringArrayAction());

		buildStage.put(1, new FirstStrBuilderAction());
		buildStage.put(2, new SecondStrBuilderAction());
		buildStage.put(3, new ThirdStrBuilderAction());
		buildStage.put(4, new FourthStrBuilderAction());
		buildStage.put(5, new FifthStrBuilderAction());
		buildStage.put(6, new SixthStrBuilderAction());
		buildStage.put(7, new SeventhStrBuilderAction());
		buildStage.put(8, new EightStrBuilderAction());
		buildStage.put(9, new NinthStrBuilderAction());
		buildStage.put(10, new TenthStrBuilderAction());

		regExpStage.put(1, new FirstRegExpAction());
		regExpStage.put(2, new SecondRegExpAction());
		regExpStage.put(3, new ThirdRegExpAction());

		notesStage.put(1, new AddNoteAction());
		notesStage.put(2, new UpdateNoteAction());
		notesStage.put(3, new SortByFromNameAction());
		notesStage.put(4, new SortByHeadingAction());
		notesStage.put(5, new RemoveNoteAction());

		treasureStage.put(1, new AddTreasureAction());
		treasureStage.put(2, new UpdateTreasureAction());
		treasureStage.put(4, new RemoveTreasureAction());
		treasureStage.put(5, new ShowMostValTreasureAction());
		treasureStage.put(6, new ShowPriceTreasureAction());
		treasureStage.put(7, new XmlExportTreasureAction());

		flowerStage.put(1, new AddFlowerAction());
		flowerStage.put(2, new UpdateFlowerAction());
		flowerStage.put(4, new RemoveFlowerAction());
		flowerStage.put(5, new ShowMostValObjectAction());
		flowerStage.put(6, new ShowPriceFlowerAction());
		flowerStage.put(7, new XmlExportFlowerAction());
	}

	public void setDefaultStage() {
		defaultStage.put(1, new SetLinearStageActions());
		defaultStage.put(2, new SetBranchStageActions());
		defaultStage.put(3, new SetCycleStageActions());
		defaultStage.put(4, new SetOneDimArrayStageActions());
		defaultStage.put(5, new SetMatrixStageActions());
		defaultStage.put(6, new SetSortStageActions());
		defaultStage.put(7, new SetDecompositionStages());
		defaultStage.put(8, new SetStringArrayActionActions());
		defaultStage.put(9, new SetStringBuilderStageActions());
		defaultStage.put(10, new SetRegExpStageActions());
		defaultStage.put(11, new SetNoteStageActions());
		defaultStage.put(12, new SetTreasureStageActions());
		defaultStage.put(13, new SetFlowersStageActions());
		this.addDefaultStageAction();
	}

  private void addDefaultStageAction() {
        defaultStage.put(0, new StopApplicationIAction());
            decStage.put(0, new SetDefaultStageActions());
          arrayStage.put(0, new SetDefaultStageActions());
         matrixStage.put(0, new SetDefaultStageActions());
           sortStage.put(0, new SetDefaultStageActions());
         branchStage.put(0, new SetDefaultStageActions());
           lineStage.put(0, new SetDefaultStageActions());
          cycleStage.put(0, new SetDefaultStageActions());

         stringStage.put(0, new SetDefaultStageActions());
          buildStage.put(0, new SetDefaultStageActions());
         regExpStage.put(0, new SetDefaultStageActions());

          notesStage.put(0, new SetDefaultStageActions());

        treasureInStage.put(0, new SetTreasureStageActions());
        treasureInStage.put(1, new SortByNameTreasureAction());
        treasureInStage.put(2, new SortByPriceTreasureAction());

        treasureStage.put(0, new SetDefaultStageActions());
        treasureStage.put(3, new SetSortTreasureAction());

        flowersInStage.put(0, new SetFlowersStageActions());
        flowersInStage.put(1, new SortByNameFlowerAction());
        flowersInStage.put(2, new SortByPriceFlowerAction());

        flowerStage.put(0, new SetDefaultStageActions());
        flowerStage.put(3, new SetSortFlowersAction());
    }


	public static StageActionFactory getInstance() {
		return instance;
	}

	public Action getActionStage(int index)
		throws WrongStageException {
		if (currentStage.containsKey(index)) {
			return currentStage.get(index);
		}
		throw new WrongStageException(index);
	}

	public Map<Integer, Action> getLineStage() {
		return lineStage;
	}

	public Map<Integer, Action> getBranchStage() {
		return branchStage;
	}

	public Map<Integer, Action> getCycleStage() {
		return cycleStage;
	}

	public Map<Integer, Action> getDecomposeStage() {
		return decStage;
	}

	public Map<Integer, Action> getDefaultStage() {
		return defaultStage;
	}

	public Map<Integer, Action> getArraysStage() {
		return arrayStage;
	}

	public Map<Integer, Action> getMatrixStage() {
		return matrixStage;
	}

	public Map<Integer, Action> getSortStage() {
		return sortStage;
	}

	public Map<Integer, Action> getStringStage() {
		return stringStage;
	}

	public Map<Integer, Action> getBuildStage() {
		return buildStage;
	}

	public Map<Integer, Action> getRegExpStage() {
		return regExpStage;
	}

	public Map<Integer, Action> getNotesStage() {
		return notesStage;
	}

	public Map<Integer, Action> getFlowerStage() {
		return flowerStage;
	}

	public Map<Integer, Action> getTreasureStage() {
		return treasureStage;
	}

	public Map<Integer, Action> getFlowersShowStage() {
		return flowersInStage;
	}

	public Map<Integer, Action> getTreasureShowStage() {
		return treasureInStage;
	}

	public void setCurrentStage(Map<Integer, Action> stage) {
		currentStage = stage;
	}

	public void showStageMenu() {
		currentStage.forEach((key, value)
				-> out.printf("%d - %s%n", key, value.description()));
		out.println("Choose the action you want:");
	}
}
