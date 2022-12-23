import org.junit.Assert;
import org.junit.Test;

public class FibonacciSequenceTest {

    @Test
    public void fibonacciSequenceZeroElement() {
        // Given
        int elementId = 0;

        // When
        int expectedOutput = 0;
        int output = NumericalAlgorithms.getFibonacciSequenceElement(elementId);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void fibonacciSequenceFirstElement() {
        // Given
        int elementId = 1;

        // When
        int expectedOutput = 1;
        int output = NumericalAlgorithms.getFibonacciSequenceElement(elementId);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void fibonacciSequenceThirdElement() {
        // Given
        int elementId = 3;

        // When
        int expectedOutput = 2;
        int output = NumericalAlgorithms.getFibonacciSequenceElement(elementId);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void fibonacciSequenceFifthElement() {
        // Given
        int elementId = 5;

        // When
        int expectedOutput = 5;
        int output = NumericalAlgorithms.getFibonacciSequenceElement(elementId);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

}
