public class SearchAlgorithm {

    public static int binarySearch(int[] array, int value, int beginning, int end) {
        if (array.length < 1 || beginning > end)
            return -1;

        int middleIndex = (beginning + end) / 2;

        if (array[middleIndex] == value)
            return middleIndex;
        else if (array[middleIndex] > value)
            return binarySearch(array, value, beginning, middleIndex - 1);
        else
            return binarySearch(array, value, middleIndex + 1, end);
    }

}
