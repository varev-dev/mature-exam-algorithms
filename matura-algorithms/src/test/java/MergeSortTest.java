import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {

    @Test
    public void testMergeSortOnSixElements() {
        // Given
        int[] input = new int[]{4, 1, 9, 5, 6, 8, 7};

        // When
        int[] expectedOutput = new int[]{1, 4, 5, 6, 7, 8, 9};
        boolean output = Arrays.equals(SortAlgorithm.mergeSort(input), expectedOutput);

        // Then
        Assert.assertTrue(output);
    }

}