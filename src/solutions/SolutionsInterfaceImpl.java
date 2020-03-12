package solutions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SolutionsInterfaceImpl implements SolutionsInterface {
    @Override
    public int[] merge(int[] firstArray, int[] secondArray) {
        /* Merged array of two given arrays; as far as it is merged of two arrays, it's size will be
         * sum of lengths of those given arrays */
        int[] merged = new int[firstArray.length + secondArray.length];
        /* currentFirst - pointer in first given array */
        int currentFirst = 0,
                /* currentSecond - pointer in second given array */
                currentSecond = 0,
                /* currentMerged - last-assigned element in merged array */
                currentMerged = 0;

        /* Assign currentMerged-th element of merged array to lesser of firstArray[currentFirst] and
         * secondArray[currentSecond] */
        while (currentFirst < firstArray.length && currentSecond < secondArray.length) {
            merged[currentMerged++] = firstArray[currentFirst] < secondArray[currentSecond] ?
                    firstArray[currentFirst++] : secondArray[currentSecond++];
        }

        /* Assign currentMerged-th element of merged array to firstArray[currentFirst]
         * (increase currentFirst, while firstArray[currentFirst] < secondArray[currentSecond])
         * and currentFirst < length of firstArray) */
        while (currentFirst < firstArray.length) {
            merged[currentMerged++] = firstArray[currentFirst++];
        }

        /* Assign currentMerged-th element of merged array to secondArray[currentSecond]
         * (increase currentSecond, while firstArray[currentFirst] > secondArray[currentSecond])
         * and currentSecond < length of secondArray) */
        while (currentSecond < secondArray.length) {
            merged[currentMerged++] = secondArray[currentSecond++];
        }

        /* In the end, we get desired array */
        return merged;
    }

    @Override
    public int[] mergeUsingIntStreams(int[] firstArray, int[] secondArray) {
        /* Create IntStream of firstArray */
        IntStream firstIntStream = Arrays.stream(firstArray);
        /* Create IntStream of secondArray */
        IntStream secondIntStream = Arrays.stream(secondArray);

        /*
         * 1. Create new Stream
         * 1. Concat firstIntStream and secondIntStream;
         * 2. Sort it (sort type(MergeSort/QuickSort) - ?);
         * 3. Make an array out of sorted stream
         * 4. Return array */
        return /* 1 */IntStream./* 2 */concat(firstIntStream, secondIntStream)./* 3 */sorted()./* 4 */toArray();
    }
}
