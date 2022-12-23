import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class IntegerFactorizationTest {

    @Test
    public void integerFactorizationOfZero() {
        // Given
        int value = 0;

        // When
        var expectedOutput = new TreeMap<Integer, Integer>();
        boolean result = NumericalAlgorithms.integerFactorization(value).equals(expectedOutput);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void integerFactorizationOfTwo() {
        // Given
        int value = 2;

        // When
        var expectedOutput = new TreeMap<Integer, Integer>(){{put(2, 1);}};
        boolean result = NumericalAlgorithms.integerFactorization(value).equals(expectedOutput);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void integerFactorizationOfFive() {
        // Given
        int value = 5;

        // When
        var expectedOutput = new TreeMap<Integer, Integer>(){{put(5, 1);}};
        boolean result = NumericalAlgorithms.integerFactorization(value).equals(expectedOutput);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void integerFactorizationOfSix() {
        // Given
        int value = 6;

        // When
        var expectedOutput = new TreeMap<Integer, Integer>(){{
            put(2, 1);
            put(3, 1);
        }};
        boolean result = NumericalAlgorithms.integerFactorization(value).equals(expectedOutput);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void integerFactorizationOfTwelve() {
        // Given
        int value = 12;

        // When
        var expectedOutput = new TreeMap<Integer, Integer>(){{
            put(2, 2);
            put(3, 1);
        }};
        boolean result = NumericalAlgorithms.integerFactorization(value).equals(expectedOutput);

        // Then
        Assert.assertTrue(result);
    }

    @Test
    public void integerFactorizationOfThirtySix() {
        // Given
        int value = 36;

        // When
        var expectedOutput = new TreeMap<Integer, Integer>(){{
            put(2, 2);
            put(3, 2);
        }};
        boolean result = NumericalAlgorithms.integerFactorization(value).equals(expectedOutput);

        // Then
        Assert.assertTrue(result);
    }

}
