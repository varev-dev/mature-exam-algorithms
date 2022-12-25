import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class SortAlgorithm {

    public static int[] selectionSort(int[] array) {
        return array;
    }

    public static int[] swapValuesInArray(int[] array, int firstIndex, int secondIndex) {
        if (firstIndex >= array.length || secondIndex >= array.length || firstIndex < 0 || secondIndex < 0)
            throw new ArrayIndexOutOfBoundsException("array doesnt contains this index");

        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

        return array;
    }

    public static int findMinValueIndexInArrayFromIndex(int[] array, int start) {
        return start;
    }

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

        mergedArray = appendArrayToArrayFromIndex(mergedArray, firstArrayIterator + secondArrayIterator,
            Arrays.copyOfRange(firstArray, firstArrayIterator, firstArray.length)
        );

        mergedArray = appendArrayToArrayFromIndex(mergedArray, firstArray.length + secondArrayIterator,
            Arrays.copyOfRange(secondArray, secondArrayIterator, secondArray.length)
        );

        return mergedArray;
    }

    private static int[] appendArrayToArrayFromIndex(int[] array, int currentIndex, int[] arrayToBeAppended) {
        if (array.length < currentIndex + arrayToBeAppended.length)
            throw new ArrayIndexOutOfBoundsException("Array is not capable to handle every element");

        for (int value : arrayToBeAppended) {
            array[currentIndex++] = value;
        }

        return array;
    }

    public static int[] countingSort(int[] array) {
        var elementsInArray = countElementsInArray(array);
        array = buildArrayFromCountedElements(elementsInArray);

        return array;
    }

    public static TreeMap<Integer, Integer> countElementsInArray(int[] array) {
        var values = new TreeMap<Integer, Integer>();

        if (array == null)
            return values;

        for (int value : array) {
            if (values.containsKey(value))
                values.put(value, values.get(value) + 1);
            else
                values.put(value, 1);
        }

        return values;
    }

    public static int[] buildArrayFromCountedElements(TreeMap<Integer, Integer> values) {
        int[] array = new int[values.values().stream().reduce(0, Integer::sum)];
        int index = 0;

        while (!values.isEmpty()) {
            array[index] = values.firstKey();

            if (values.get(array[index]) <= 1)
                values.remove(array[index]);
            else
                values.put(array[index], values.get(array[index]) - 1);
            index++;
        }

        return array;
    }

}