package com.epam.bigone.chapters.chapterFunctions.controllers.impl;


import java.util.HashMap;
import java.util.Map;

import com.epam.bigone.chapters.chapterFunctions.controllers.FunctionController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.algorithmization.DecompositionController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.algorithmization.MatrixArrayController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.algorithmization.OneDimArrayController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.algorithmization.SortArrayController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.devSoftware.BranchStageController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.devSoftware.CycleStageController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.devSoftware.LinearStageController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.stringProcessing.RegExpController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.stringProcessing.StringBuildersController;
import com.epam.bigone.chapters.chapterFunctions.controllers.impl.stringProcessing.StringsController;


public class FunctionsFactory {

    private final Map<Integer, FunctionController> algorithmControllers = new HashMap<>();
    private final Map<Integer, FunctionController> devSoftControllers 	= new HashMap<>();
    private final Map<Integer, FunctionController> strProcControllers 	= new HashMap<>();

    private static final FunctionsFactory instance = new FunctionsFactory();

    private FunctionsFactory() {
        algorithmControllers.put(1, new OneDimArrayController());
        algorithmControllers.put(2, new MatrixArrayController());
        algorithmControllers.put(3, new SortArrayController());
        algorithmControllers.put(4, new DecompositionController());

        devSoftControllers.put(1, new BranchStageController());
        devSoftControllers.put(2, new CycleStageController());
        devSoftControllers.put(3, new LinearStageController());

        strProcControllers.put(1, new StringsController());
        strProcControllers.put(2, new StringBuildersController());
        strProcControllers.put(3, new RegExpController());
    }

    public static FunctionsFactory getInstance() {
        return instance;
    }

    public Map<Integer, FunctionController> getAlgorithmControllers() {
        return algorithmControllers;
    }

    public Map<Integer, FunctionController> getDevSoftControllers() {
        return devSoftControllers;
    }

    public Map<Integer, FunctionController> getStrProcControllers() {
        return strProcControllers;
    }
}