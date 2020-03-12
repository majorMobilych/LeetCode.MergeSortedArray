package com;

public interface SolutionsInterface {
    /**
     * @param firstArray - one of two given sorted arrays
     * @param secondArray - another given sorted array
     * @return new array, merged of two ones above
     * @see SolutionsInterfaceImpl#merge(int[], int[]) for full description of algoritm
     */
    int[] merge(int[] firstArray, int[] secondArray);

    /**
     * @param firstArray - one of two given sorted arrays
     * @param secondArray - another given sorted array
     * @return new array, merged of two ones above
     * @see SolutionsInterfaceImpl#mergeUsingIntStreams(int[], int[]) for full description of algoritm
     * less writing
     */
    int[] mergeUsingIntStreams(int[] firstArray, int[] secondArray);
}
