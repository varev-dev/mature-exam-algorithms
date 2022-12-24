import org.junit.Assert;
import org.junit.Test;

public class QuadraticEquationTest {

    @Test
    public void testEquationIsNotQuadratic() {
        // Given
        int a = 0;
        int b = 1;
        int c = 2;

        // When
        // Then
        Assert.assertThrows(ArithmeticException.class, () -> {
           NumericalAlgorithms.calculateDelta(a, b, c);
        });
    }
    
    @Test
    public void testCalculatingDeltaLowerThanZero() {
        // Given
        int a = 2;
        int b = 1;
        int c = 2;

        // When
        double expectedOutput = -15.0;
        double output = NumericalAlgorithms.calculateDelta(a, b, c);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testCalculatingDeltaEqualsZero() {
        // Given
        int a = 2;
        int b = 4;
        int c = 2;

        // When
        double expectedOutput = 0;
        double output = NumericalAlgorithms.calculateDelta(a, b, c);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testCalculatingDeltaHigherThanZero() {
        // Given
        int a = -3;
        int b = 4;
        int c = 4;

        // When
        double expectedOutput = 64;
        double output = NumericalAlgorithms.calculateDelta(a, b, c);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

}
