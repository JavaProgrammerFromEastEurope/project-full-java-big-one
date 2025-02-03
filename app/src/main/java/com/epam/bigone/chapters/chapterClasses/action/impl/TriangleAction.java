package com.epam.bigone.chapters.chapterClasses.action.impl;

import static java.lang.System.out;

import com.epam.bigone.chapters.chapterClasses.action.ClassAction;
import com.epam.bigone.chapters.chapterClasses.entity.common.Triangle;

public class TriangleAction implements ClassAction {

	Triangle firstTriangle;

	@Override
	public void inputVariables() {
		firstTriangle = new Triangle();
	}

	@Override
	public void printResult() {
		addString[0] = "Perimeter of triangle:";
		addString[1] = "Area of triangle:";
		addString[2] = "X Median of triangle:";
		addString[3] = "Y Median of triangle:";
		addString[4] = "For more info about class 'Triangle' structure %n" +
				"look at the class folder '/chapter/chapterClasses/classes/Triangle'!";
		out.printf("%s %s %n %s %s %n %s %s %n %s %s %n %s %n%n",
				addString[0], firstTriangle.findPerimeter(),
				addString[1], firstTriangle.findArea(),
				addString[2], firstTriangle.getXMedian(),
				addString[3], firstTriangle.getYMedian(),
				addString[4]);
	}
}