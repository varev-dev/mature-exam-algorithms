import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class CountingSortTest {


    // Counting values in array
    @Test
    public void countingInNull() {
        // Given
        int[] input = null;

        // When
        var output = SortAlgorithm.countElementsInArray(input);
        boolean result = new TreeMap<Integer, Integer>().equals(output);

        // Then
        Assert.assertTrue(result);
    }
    @Test
    public void countingInEmptyArray() {
        // Given
        int[] input = new int[]{};

        // When
        var output = SortAlgorithm.countElementsInArray(input);
        boolean result = new TreeMap<Integer, Integer>().equals(output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void countingDifferentValuesInArray() {
        // Given
        int[] input = new int[]{5, 4, 3};

        // When
        var expectedOutput = new TreeMap<Integer, Integer>(){{
            put(5, 1);
            put(4, 1);
            put(3, 1);
        }};
        var output = SortAlgorithm.countElementsInArray(input);

        boolean result = expectedOutput.equals(output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void countingSameValuesInArray() {
        // Given
        int[] input = new int[]{9, 1, 1, 2, 1};

        // When
        var expectedOutput = new TreeMap<Integer, Integer>(){{
            put(1, 3);
            put(2, 1);
            put(9, 1);
        }};
        var output = SortAlgorithm.countElementsInArray(input);

        boolean result = expectedOutput.equals(output);

        // Then
        Assert.assertTrue(result);
    }

}
