import org.junit.Assert;
import org.junit.Test;

public class GreatestCommonDivisorTest {

    @Test
    public void GCDOfFifteenAndNinetyThree() {
        // Given
        int numberOne = 15;
        int numberTwo = 93;

        // When
        boolean result = NumericalAlgorithms.greatestCommonDivisor(numberOne, numberTwo) == 3;

        // Then
        Assert.assertTrue(result);
    }

}
