import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void getFactorialZeroElement() {
        // Given
        int elementId = 0;

        // When
        int expectedOutput = 1;
        int output = NumericalAlgorithms.getFactorialElement(elementId);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void getFactorialSecondElement() {
        // Given
        int elementId = 2;

        // When
        int expectedOutput = 2;
        int output = NumericalAlgorithms.getFactorialElement(elementId);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void getFactorialSixthElement() {
        // Given
        int elementId = 6;

        // When
        int expectedOutput = 720;
        int output = NumericalAlgorithms.getFactorialElement(elementId);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

}
