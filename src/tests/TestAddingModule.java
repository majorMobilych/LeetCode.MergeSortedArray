package tests;

import org.junit.Assert;
import org.junit.Test;
import solutions.SolutionsInterface;
import solutions.SolutionsInterfaceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TestAddingModule {
    private static SolutionsInterface solutionsInterface = new SolutionsInterfaceImpl();

    private static List<Example> myExamplesAutoGeneratedDesiredResults() {
        List<Example> myExamplesAutoGeneratedDesiredResults = new ArrayList<>();
        myExamplesAutoGeneratedDesiredResults.add(new Example(new int[] {-5, -4, -3, -2, -1}, new int[] {0, 1, 2, 3, 4}));
        myExamplesAutoGeneratedDesiredResults.add(new Example(new int[] {2, 4, 6, 8, 10}, new int[] {1, 3, 5, 7, 9}));
        myExamplesAutoGeneratedDesiredResults.add(new Example(new int[] {2, 3, 5, 6, 9}, new int[] {1, 4, 7, 8, 10}));
        myExamplesAutoGeneratedDesiredResults.add(new Example(new int[] {1, 2, 3, 4, 5}, new int[] {1, 2, 3, 4, 5}));
        myExamplesAutoGeneratedDesiredResults.add(new Example(new int[] {}, new int[] {}));
        return myExamplesAutoGeneratedDesiredResults;
    }

    private static List<Example> myExamplesNonAutoGeneratedDesiredResults() {
        List<Example> myExamplesNonAutoGeneratedDesiredResults = new ArrayList<>();
        myExamplesNonAutoGeneratedDesiredResults.add(new Example(
                new int[] {-5, -4, -3, -2, -1}, new int[] {0, 1, 2, 3, 4}, new int[] {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4}));
        myExamplesNonAutoGeneratedDesiredResults.add(new Example(
                new int[] {2, 4, 6, 8, 10}, new int[] {1, 3, 5, 7, 9}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        myExamplesNonAutoGeneratedDesiredResults.add(new Example(
                new int[] {2, 3, 5, 6, 9}, new int[] {1, 4, 7, 8, 10}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        myExamplesNonAutoGeneratedDesiredResults.add(new Example(
                new int[] {1, 2, 3, 4, 5}, new int[] {1, 2, 3, 4, 5}, new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5}));
        myExamplesNonAutoGeneratedDesiredResults.add(new Example(
                new int[] {}, new int[] {}, new int[] {}));
        /* wrong desiredResult entered */
        myExamplesNonAutoGeneratedDesiredResults.add(new Example(
                new int[] {}, new int[] {}, new int[] {0}));
        /* wrong desiredResult entered */
        myExamplesNonAutoGeneratedDesiredResults.add(new Example(
                new int[] {}, new int[] {}, new int[] {1}));
        return myExamplesNonAutoGeneratedDesiredResults;
    }

    /* Full auto-generated example */
    private static Example getRandomExample(int sizeOfFirstArray, int sizeOfSecondArray) {
        int[] firstArray = new int[sizeOfFirstArray];
        int[] secondArray = new int[sizeOfSecondArray];
        for (int i = 0; i < sizeOfFirstArray; i++) {
            firstArray[i] = ThreadLocalRandom.current().nextInt();
        }
        for (int i = 0; i < sizeOfSecondArray; i++) {
            secondArray[i] = ThreadLocalRandom.current().nextInt();
        }
        return new Example(firstArray, secondArray);
    }

    @Test
    public void myExamplesAutoGeneratedDesiredResultsTest() {
        List<Example> examples = myExamplesAutoGeneratedDesiredResults();
        for (Example example : examples) {
            Assert.assertArrayEquals(example.getDesiredResult(),
                    solutionsInterface.merge(example.getFirstArray(), example.getSecondArray()));
        }
    }

    /* here we get wrong desiredResults in some of "examples", so that test will fail */
    @Test
    public void myExamplesNonAutoGeneratedDesiredResultsTest() {
        List<Example> examples = myExamplesNonAutoGeneratedDesiredResults();
        for (Example example: examples) {
            Assert.assertArrayEquals(example.getDesiredResult(),
                    solutionsInterface.merge(example.getFirstArray(), example.getSecondArray()));
        }
    }

    @Test
    public void getRandomExampleTest() {
        Example example = getRandomExample(2, 2);
        Assert.assertArrayEquals(example.getDesiredResult(),
                solutionsInterface.merge(example.getFirstArray(), example.getSecondArray()));
    }
}
