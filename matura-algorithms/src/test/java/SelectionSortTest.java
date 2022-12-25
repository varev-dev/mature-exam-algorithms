import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SelectionSortTest {

    @Test
    public void findMinValueIndexInWholeArray() {
        // Given
        int[] array = new int[]{9, 3, 5, 1, 6};

        // When
        int expectedOutput = 3;
        int output = SortAlgorithm.findMinValueIndexInArrayFromIndex(array, 0);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }
    @Test
    public void findMinValueIndexInArrayFromSecondElement() {
        // Given
        int[] array = new int[]{9, 3, 5, 1, 6};

        // When
        int expectedOutput = 3;
        int output = SortAlgorithm.findMinValueIndexInArrayFromIndex(array, 1);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void findMinValueIndexInArrayFromPenultimateElement() {
        // Given
        int[] array = new int[]{9, 3, 5, 1, 6};

        // When
        int expectedOutput = 3;
        int output = SortAlgorithm.findMinValueIndexInArrayFromIndex(array, array.length - 2);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void sortEmptyArray() {
        // Given
        int[] array = new int[]{};

        // When
        int[] expectedOutput = new int[]{};
        int[] output = SortAlgorithm.selectionSort(array);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void sortTwoElementArray() {
        // Given
        int[] array = new int[]{5, 3};

        // When
        int[] expectedOutput = new int[]{3, 5};
        int[] output = SortAlgorithm.selectionSort(array);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void sortElevenElementArray() {
        // Given
        int[] array = new int[]{5, 3, 0, 1, 9, 2, 4, 3, 6, 7, 8};

        // When
        int[] expectedOutput = new int[]{3, 5};
        int[] output = SortAlgorithm.selectionSort(array);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }

}