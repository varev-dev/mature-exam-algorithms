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

}