import org.junit.Assert;
import org.junit.Test;

public class IsNumberPerfectTest {

    @Test
    public void testNegativeNumber() {
        // Given
        int number = -1;

        // When
        boolean expectedResult = false;
        boolean output = NumericalAlgorithms.isNumberPerfect(number);
        boolean result = expectedResult == output;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testPerfectNumber() {
        // Given
        int number = 6;

        // When
        boolean expectedResult = true;
        boolean output = NumericalAlgorithms.isNumberPerfect(number);
        boolean result = expectedResult == output;

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void testNotPerfectNumber() {
        // Given
        int number = 12;

        // When
        boolean expectedResult = true;
        boolean output = NumericalAlgorithms.isNumberPerfect(number);
        boolean result = expectedResult == output;

        // Then
        Assert.assertTrue(result);
    }

}
