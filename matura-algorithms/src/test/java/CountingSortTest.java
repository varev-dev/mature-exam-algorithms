import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.TreeMap;

public class CountingSortTest {

    // Counting sort
    @Test
    public void countingSortEmptyArray() {
        // Given
        int[] input = new int[]{};

        // When
        int[] output = SortAlgorithm.countingSort(input);
        boolean result = Arrays.equals(output, new int[]{});

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void countingSortArrayWithDifferentValues() {
        // Given
        int[] input = new int[]{5, 3, 2, 9, 4, 1};

        // When
        int[] expectedOutput = new int[]{1, 2, 3, 4, 5, 9};
        int[] output = SortAlgorithm.countingSort(input);
        boolean result = Arrays.equals(output, expectedOutput);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void countingSortArrayWithSameValues() {
        // Given
        int[] input = new int[]{5, 3, 2, 1, 1, 4, 5, 5};

        // When
        int[] expectedOutput = new int[]{1, 1, 2, 3, 4, 5, 5, 5};
        int[] output = SortAlgorithm.countingSort(input);
        boolean result = Arrays.equals(output, expectedOutput);

        // Then
        Assert.assertTrue(result);
    }

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

    // Building array from map of counted elements
    @Test
    public void buildingArrayFromEmptyMap() {
        // Given
        var input = new TreeMap<Integer, Integer>();

        // When
        int[] output = SortAlgorithm.buildArrayFromCountedElements(input);
        boolean result = Arrays.equals(output, new int[]{});

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void buildingArrayFromMapWithSameValues() {
        // Given
        var input = new TreeMap<Integer, Integer>(){{
            put(4, 2);
            put(1, 3);
            put(2, 1);
        }};

        // When
        int[] expectedOutput = new int[]{1, 1, 1, 2, 4, 4};
        int[] output = SortAlgorithm.buildArrayFromCountedElements(input);
        boolean result = Arrays.equals(output, expectedOutput);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void buildingArrayFromMapWithDifferentValues() {
        // Given
        var input = new TreeMap<Integer, Integer>(){{
            put(4, 1);
            put(1, 1);
            put(2, 1);
        }};

        // When
        int[] expectedOutput = new int[]{1, 2, 4};
        int[] output = SortAlgorithm.buildArrayFromCountedElements(input);
        boolean result = Arrays.equals(output, expectedOutput);

        // Then
        Assert.assertTrue(result);
    }


}
