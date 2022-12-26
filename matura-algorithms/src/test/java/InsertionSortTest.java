import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {

    @Test
    public void sortNull() {
        // Given
        int[] array = null;

        // When
        int[] expectedOutput = new int[]{};
        int[] output = SortAlgorithm.insertionSort(array);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void sortEmptyArray() {
        // Given
        int[] array = new int[]{};

        // When
        int[] expectedOutput = new int[]{};
        int[] output = SortAlgorithm.insertionSort(array);
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
        int[] output = SortAlgorithm.insertionSort(array);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }
    @Test
    public void sortSixElementArray() {
        // Given
        int[] array = new int[]{5, 3, 4, 1, 6, 6};

        // When
        int[] expectedOutput = new int[]{1, 3, 4, 5, 6, 6};
        int[] output = SortAlgorithm.insertionSort(array);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void sortElevenElementArray() {
        // Given
        int[] array = new int[]{9, 0, 3, 2, 3, 3, 8, 5, 6, 6, 9};

        // When
        int[] expectedOutput = new int[]{0, 2, 3, 3, 3, 5, 6, 6, 8, 9, 9};
        int[] output = SortAlgorithm.insertionSort(array);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void moveElementsInEmptyArray() {
        // Given
        int[] array = new int[]{};
        int start = 0;
        int amount = 2;

        // When
        int[] expectedOutput = new int[]{};
        int[] output = SortAlgorithm.moveArrayElementsOnePlaceForward(array, start, amount);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void moveElementsInNull() {
        // Given
        int[] array = null;
        int start = 1;
        int amount = 1;

        // When
        int[] expectedOutput = new int[]{};
        int[] output = SortAlgorithm.moveArrayElementsOnePlaceForward(array, start, amount);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void moveOneElementInArray() {
        // Given
        int[] array = new int[]{5, 3, 2, 3, 1};
        int start = 3;
        int amount = 1;

        // When
        int[] expectedOutput = new int[]{5, 3, 2, 3, 3};
        int[] output = SortAlgorithm.moveArrayElementsOnePlaceForward(array, start, amount);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void moveFourElementInArray() {
        // Given
        int[] array = new int[]{5, 3, 2, 3, 1};
        int start = 0;
        int amount = 4;

        // When
        int[] expectedOutput = new int[]{5, 5, 3, 2, 3};
        int[] output = SortAlgorithm.moveArrayElementsOnePlaceForward(array, start, amount);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void moveWhenIndexOutOfBounds() {
        // Given
        int[] array = new int[]{5, 3, 2, 3, 1};
        int start = 0;
        int amount = 6;

        // Then
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
           SortAlgorithm.moveArrayElementsOnePlaceForward(array, start, amount);
        });
    }

}
