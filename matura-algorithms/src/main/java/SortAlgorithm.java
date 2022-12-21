import java.util.ArrayList;
import java.util.Arrays;

public class SortAlgorithm {

    public static int[] bubbleSort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = 0; j < arrayToSort.length - i - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }

        return arrayToSort;
    }

    public static Integer[] quickSort(Integer[] arrayToSort) {
        if (arrayToSort.length < 2)
            return arrayToSort;

        int pivot = arrayToSort[0];
        var lowerThanPivot = new ArrayList<Integer>();
        var higherThanPivot = new ArrayList<Integer>();

        for (int i = 1; i < arrayToSort.length; i++) {
            if (arrayToSort[i] < pivot)
                lowerThanPivot.add(arrayToSort[i]);
            else
                higherThanPivot.add(arrayToSort[i]);
        }

        return mergeSortedIntoOneArray(
            quickSort(lowerThanPivot.toArray(new Integer[0])),
            new Integer[]{pivot},
            quickSort(higherThanPivot.toArray(new Integer[0]))
        );
    }

    public static Integer[] mergeSortedIntoOneArray(Integer[]...  arrays) {
        var mergedArray = new ArrayList<Integer>();

        for (Integer[] array : arrays) {
            mergedArray.addAll(Arrays.asList(array));
        }

        return mergedArray.toArray(new Integer[0]);
    }

    public static int[] mergeSort(int[] array) {
        if (array.length < 2)
            return array;

        int[] left = mergeSort(
            Arrays.copyOfRange(array, 0, (array.length / 2))
        );
        int[] right = mergeSort(
            Arrays.copyOfRange(array, (array.length / 2), array.length)
        );

        //return new int[]{};
        return mergeTwoArrays(left, right);
    }

    private static int[] mergeTwoArrays(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int firstArrayIterator = 0, secondArrayIterator = 0;

        while (firstArrayIterator != firstArray.length && secondArrayIterator != secondArray.length) {
            int currentIndex = firstArrayIterator + secondArrayIterator;

            if (firstArray[firstArrayIterator] >= secondArray[secondArrayIterator])
                mergedArray[currentIndex] = secondArray[secondArrayIterator++];
            else
                mergedArray[currentIndex] = firstArray[firstArrayIterator++];
        }

        while (firstArrayIterator != firstArray.length) {
            mergedArray[firstArrayIterator + secondArrayIterator] = firstArray[firstArrayIterator++];
        }

        while (secondArrayIterator != secondArray.length) {
            mergedArray[firstArrayIterator + secondArrayIterator] = secondArray[secondArrayIterator++];
        }

        return mergedArray;
    }

}