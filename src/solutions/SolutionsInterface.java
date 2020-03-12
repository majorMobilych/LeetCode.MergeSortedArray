package solutions;

public interface SolutionsInterface {
    /**
     * @param firstArray - one of two given sorted arrays
     * @param secondArray - another given sorted array
     * @return new array, merged of two ones above
     * @see SolutionsInterfaceImpl#merge(int[], int[]) for full description of algorithm
     */
    int[] merge(int[] firstArray, int[] secondArray);

    /**
     * @param firstArray - one of two given sorted arrays
     * @param secondArray - another given sorted array
     * @return new array, merged of two ones above
     * @see SolutionsInterfaceImpl#mergeUsingIntStreams(int[], int[]) for full description of algorithm
     * less writing, used in tests
     */
    int[] mergeUsingIntStreams(int[] firstArray, int[] secondArray);
}