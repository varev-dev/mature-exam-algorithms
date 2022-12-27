import org.junit.Assert;
import org.junit.Test;

public class SentinelSearchTest {

    @Test
    public void testSearchInEmptyArray() {
        // Given
        int[] array = new int[]{};
        int value = 0;

        // When
        int expectedOutput = Integer.MAX_VALUE;
        int output = SearchAlgorithm.sentinelLinearSearch(array, value);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSearchInArrayWhenValueIsPresent() {
        // Given
        int[] array = new int[]{9, 1};
        int value = 1;

        // When
        int expectedOutput = 1;
        int output = SearchAlgorithm.sentinelLinearSearch(array, value);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSearchInArrayWhenValueIsNotPresent() {
        // Given
        int[] array = new int[]{9, 1};
        int value = 2;

        // When
        int expectedOutput = Integer.MAX_VALUE;
        int output = SearchAlgorithm.sentinelLinearSearch(array, value);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

}
