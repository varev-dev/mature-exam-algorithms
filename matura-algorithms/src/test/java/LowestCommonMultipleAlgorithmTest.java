import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class LowestCommonMultipleAlgorithmTest {

    /* LCM TEST */

    @Test
    public void LCMOfOneAndOne() {
        // Given
        int number = 1;

        // When
        boolean lcm = MathAlgorithm.lowestCommonMultiple(number, number) == number;

        // Then
        Assert.assertTrue(lcm);
    }

    @Test
    public void LCMOfFiveAndThree() {
        // Given
        int numberOne = 5;
        int numberTwo = 3;

        // When
        boolean lcm = MathAlgorithm.lowestCommonMultiple(numberOne, numberTwo) == 15;

        // Then
        Assert.assertTrue(lcm);
    }

    @Test
    public void LCMOfMinusOneAndTwo() {
        // Given
        int numberOne = -1;
        int numberTwo = 2;

        // When
        // Then
        Assert.assertThrows(ArithmeticException.class, () -> {
            int result = MathAlgorithm.lowestCommonMultiple(numberOne, numberTwo);
        });
    }

    /* GCD TEST */

    @Test
    public void GCDOfFifteenAndNinetyThree() {
        // Given
        int numberOne = 15;
        int numberTwo = 93;

        // When
        boolean result = MathAlgorithm.greatestCommonDivisor(numberOne, numberTwo) == 3;

        // Then
        Assert.assertTrue(result);
    }
}
