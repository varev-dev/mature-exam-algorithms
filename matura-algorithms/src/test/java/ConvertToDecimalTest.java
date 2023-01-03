import org.junit.Assert;
import org.junit.Test;

public class ConvertToDecimalTest {

    @Test
    public void testBinaryOddNumberToDecimal() {
        // Given
        int system = 2;
        String input = "1101";

        // When
        int expectedOutput = 13;
        int output = ConversionAlgorithm.convertToDecimal(input, system);

        // Then
        Assert.assertTrue(expectedOutput == output);
    }

    @Test
    public void testHexEvenNumberToDecimal() {
        // Given
        int system = 16;
        String input = "F8C0";

        // When
        int expectedOutput = 63680;
        int output = ConversionAlgorithm.convertToDecimal(input, system);

        // Then
        Assert.assertTrue(expectedOutput == output);
    }

}
