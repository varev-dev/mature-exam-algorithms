import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void testSortingSixElementArray() {
        // Given
        int[] arrayToSort = new int[]{6, 5, 8, 2, 4, 2};

        // When
        boolean isArraySorted = Arrays.equals(
            SortAlgorithm.bubbleSort(arrayToSort),
            new int[]{2, 2, 4, 5, 6, 8});

        // Then
        Assert.assertTrue(isArraySorted);
    }

    @Test
    public void testSortingTwentyElementArray() {
        // Given
        int[] arrayToSort = new int[]{
            9, 7, 8, 8, 3, 2, 2, 1, 6, 4,
            5, 5, 1, 7, 3, 5, 2, 4, 8, 9};

        // When
        boolean isArraySorted = Arrays.equals(
            SortAlgorithm.bubbleSort(arrayToSort),
            new int[]{
                1, 1, 2, 2, 2, 3, 3, 4, 4, 5,
                5, 5, 6, 7, 7, 8, 8, 8, 9, 9});

        // Then
        Assert.assertTrue(isArraySorted);
    }

}
