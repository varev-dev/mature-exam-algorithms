import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class QuadraticEquationTest {

    @Test
    public void testEquationIsNotQuadratic() {
        // Given
        int a = 0, b = 1, c = 2;

        // Then
        Assert.assertThrows(ArithmeticException.class, () -> {
           NumericalAlgorithms.calculateDelta(a, b, c);
        });
    }

    @Test
    public void testCalculatingDeltaLowerThanZero() {
        // Given
        int a = 2, b = 1, c = 2;

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
        int a = 2, b = 4, c = 2;

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
        int a = -3, b = 4, c = 4;

        // When
        double expectedOutput = 64;
        double output = NumericalAlgorithms.calculateDelta(a, b, c);
        boolean result = output == expectedOutput;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testCalculatingRootsForNonQuadraticEquation() {
        // Given
        int a = 0, b = 1, c = 1;

        // Then
        Assert.assertThrows(ArithmeticException.class, () -> {
            NumericalAlgorithms.calculateDelta(a, b, c);
        });
    }

    @Test
    public void testCalculatingRootsForEquationWithNegativeDelta() {
        // Given
        int a = 2, b = 1, c = 2;

        // When
        double[] expectedOutput = new double[]{};
        double[] output = NumericalAlgorithms.getQuadraticEquationRoots(a, b, c);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testCalculatingRootsForEquationWithDeltaEqualsZero() {
        // Given
        int a = 2, b = 4, c = 2;

        // When
        double[] expectedOutput = new double[]{-1.0};
        double[] output = NumericalAlgorithms.getQuadraticEquationRoots(a, b, c);
        boolean result = Arrays.equals(expectedOutput, output);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testCalculatingRootsForEquationWithPositiveDelta() {
        // Given
        int a = -3, b = 4, c = 4;

        // When
        double[] expectedOutput = new double[]{
            2.0,
           -0.67
        };
        double[] output = NumericalAlgorithms.getQuadraticEquationRoots(a, b, c);
        boolean result = Arrays.equals(expectedOutput, output);

        System.out.println(Arrays.toString(output));
        // Then
        Assert.assertTrue(result);
    }

}
