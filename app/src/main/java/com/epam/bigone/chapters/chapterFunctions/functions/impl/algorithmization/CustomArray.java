package com.epam.bigone.chapters.chapterFunctions.functions.impl.algorithmization;

import static java.lang.String.format;
import static java.util.Arrays.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class CustomArray {

	private Object[] firstArray;
	private Object[] extraArray;
	private Object[][] matrix;

	public Object[] getFirstArray() {
		return firstArray;
	}

	public void setFirstArray(Object[] firstArray) {
		this.firstArray = firstArray;
	}

	public Object[] getExtraArray() {
		return extraArray;
	}

	public void setExtraArray(Object[] extraArray) {
		this.extraArray = extraArray;
	}

	public Object[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(Object[][] matrix) {
		this.matrix = matrix;
	}

	public List<Object> setFormattedMatrix(Object[][] numbers) {
		var objectList = new ArrayList<>();
		for (Object[] objects : numbers) {
			objectList.add(getLineObjects(objects));
			objectList.add("\n");
		}
		objectList.add("\n");
		return objectList;
	}

	public static Object[][] initMatrix(int line, int column) {
		Object[][] matrixSample = new Object[line][];
		IntStream.range(0, line).forEach(index -> matrixSample[index] = initLineObjects(true, true, column));
		return matrixSample;
	}

	public static Object[] initLineObjects(Boolean bPositive, int fullBound, int emptyBound) {
		Object[] lineArray = new Object[fullBound + emptyBound];
		initObjects(true, bPositive, lineArray, fullBound);
		return lineArray;
	}

	public static Object[] initLineObjects(Boolean bInteger, Boolean bPositive, int bound) {
		Object[] lineArray = new Object[bound];
		initObjects(bInteger, bPositive, lineArray, bound);
		return lineArray;
	}

	public static void initObjects(Boolean bInteger, Boolean bPositive, Object[] numbers, int bound) {
		int negativeValue = bPositive ? 0 : 5;
		for (int index = 0; index < bound; index++) {
			if (bInteger) {
				numbers[index] = ThreadLocalRandom.current().nextInt(15) + 1 - negativeValue;
			} else {
				numbers[index] = ThreadLocalRandom.current().nextDouble(15) + 1 - negativeValue;
			}
		}
	}

	public static Object[][] reverseLineToColumn(Object[][] sampleMatrix, int line, int column) {
		var reverseLineSample = new Object[column][line];
		for (int j = 0; j < column; j++)
				for (int i = line - 1; i >= 0; i--) {
						reverseLineSample[j][i] = sampleMatrix[i][j];
				}
		return reverseLineSample;
}

public static Object[][] reverseColumnToLine(Object[][] sampleMatrix, int line, int column) {
		var reverseColumnSample = new Object[line][column];
		for (int j = line - 1; j >= 0; j--)
				for (int i = 0; i < column; i++) {
						reverseColumnSample[j][i] = sampleMatrix[i][j];
				}
		return reverseColumnSample;
}

	public Object[] combineArrays(Object[] firstArray, Object[] secondArray) {
		int firstBound = (int) stream(firstArray).filter(Objects::nonNull).count(),
				secondBound = (int) stream(secondArray).filter(Objects::nonNull).count();
		System.arraycopy(secondArray, 0, firstArray, firstBound, secondBound);
		return firstArray;
	}

	public Object[] combineArrays(Object[] firstArray, Object[] secondArray, int pos) {
		int firstBound = (int) stream(firstArray).filter(Objects::nonNull).count(),
				secondBound = (int) stream(secondArray).filter(Objects::nonNull).count(),
				tempValue;
		for (int index = 0; index < secondBound; index++) {
			tempValue = (int) firstArray[pos + index];
			firstArray[pos + index] = secondArray[index];
			firstArray[firstBound + index] = tempValue;
		}
		return firstArray;
	}

	public List<Object> getArray(String tempString, Object[] array) {
		var objectList = new ArrayList<Object>();
		objectList.add(tempString);
		objectList.add(getLineObjects(array));
		objectList.add("\n");
		return objectList;
	}

	public List<Object> getLineObjects(Object[] array) {
		var objectList = new ArrayList<>();
		array = stream(array).filter(Objects::nonNull).toArray();
		for (Object object : array) {
			objectList.add(format(
					object.getClass().getName().equals("java.lang.Double")
							? " %6.3f"
							: "%3s",
					object));
		}
		return objectList;
	}
}
