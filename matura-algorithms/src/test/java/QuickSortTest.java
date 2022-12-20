import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void testSortingSixElements() {
        // Given
        Integer[] input = new Integer[]{5, 3, 9, 4, 1, 6};

        // When
        Integer[] expectedOutput = new Integer[]{1, 3, 4, 5, 6, 9};
        boolean arraysEquals = Arrays.equals(
            SortAlgorithm.quickSort(input),
            expectedOutput
        );

        // Then
        Assert.assertTrue(arraysEquals);
    }

}
