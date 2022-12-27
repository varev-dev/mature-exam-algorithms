import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testSearchInEmptyArray() {
        // Given
        int[] array = new int[]{};
        int value = 0;

        // When
        int expectedOutput = -1;
        int output = SearchAlgorithm.binarySearch(array, value, 0, array.length - 1);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSearchInArrayWithAnOddNumberOfElements() {
        // Given
        int[] array = new int[]{1, 4, 9};
        int value = 1;

        // When
        int expectedOutput = 0;
        int output = SearchAlgorithm.binarySearch(array, value, 0, array.length - 1);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSearchInArrayWithAnEvenNumberOfElements() {
        // Given
        int[] array = new int[]{3, 8, 9, 9};
        int value = 9;

        // When
        int expectedOutput = 2;
        int output = SearchAlgorithm.binarySearch(array, value, 0, array.length - 1);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSearchInArrayWhereValueIsNotPresent() {
        // Given
        int[] array = new int[]{3, 8, 9, 9};
        int value = 5;

        // When
        int expectedOutput = -1;
        int output = SearchAlgorithm.binarySearch(array, value, 0, array.length - 1);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

}
