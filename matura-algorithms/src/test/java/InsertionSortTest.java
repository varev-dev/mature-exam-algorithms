import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {

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
