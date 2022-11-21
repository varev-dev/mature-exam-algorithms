import org.junit.Assert;
import org.junit.Test;

public class IsPrimeTest {

    @Test
    public void isFiftyThreePrimeNumber() {
        // Given
        int number = 53;

        // When
        boolean result = MathAlgorithm.isPrime(number);

        // Then
        Assert.assertTrue(result);
    }

}
