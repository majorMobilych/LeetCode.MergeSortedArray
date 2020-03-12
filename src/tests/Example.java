package tests;

import solutions.SolutionsInterface;
import solutions.SolutionsInterfaceImpl;

public class Example {
    private int[] firstArray;
    private int[] secondArray;
    private int[] desiredResult;

    /* Initialize "Example" object by entering all class field by hand */
    Example(int[] firstArray, int[] secondArray, int[]desiredResult) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
        this.desiredResult = desiredResult;
    }
    /* Initialize "Example" object where you get desiredResult auto-generated;
     * mergeUsingIntStreams(firstArray, secondArray) might always work correctly,
     * so it is easy for using during tests */
    Example(int[] firstArray, int[] secondArray) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
        SolutionsInterface solutionsInterface = new SolutionsInterfaceImpl();
        this.desiredResult = solutionsInterface.mergeUsingIntStreams(firstArray, secondArray);
    }

    int[] getFirstArray() {
        return firstArray;
    }
    int[] getSecondArray() {
        return secondArray;
    }
    int[] getDesiredResult() {
        return desiredResult;
    }

    private String printFirstArray() {
        StringBuilder printFirstArrayString = new StringBuilder();
        for (int value : firstArray) {
            printFirstArrayString.append(value).append(" ");
        }
        return printFirstArrayString.toString();
    }
    private String printSecondArray() {
        StringBuilder printSecondArrayString = new StringBuilder();
        for (int value : secondArray) {
            printSecondArrayString.append(value).append(" ");
        }
        return printSecondArrayString.toString();
    }

    @Override
    public String toString() {
        return "firstArray: " + printFirstArray() + "\n" +
                "secondArray: " + printSecondArray();
    }
}
