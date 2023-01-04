import org.junit.Assert;
import org.junit.Test;

public class ConvertingFromDecimalTest {

    @Test
    public void testConvertingToWrongSystem() {
        // Given
        int input = 0;
        int system = 1;
        
        // When
        // Then
        Assert.assertThrows(NumberFormatException.class, () -> {
           ConversionAlgorithm.decimalToOtherSystemConverter(input, system);
        });
    }

    @Test
    public void testConvertingDecimalToBinary() {
        // Given
        int input = 17;
        int system = 2;

        // When
        String output = ConversionAlgorithm.decimalToOtherSystemConverter(input, system);
        String expectedOutput = "10001";

        // Then
        Assert.assertEquals(output, expectedOutput);
    }

    @Test
    public void testConvertingDecimalToHex() {
        // Given
        int input = 556;
        int system = 16;

        // When
        String output = ConversionAlgorithm.decimalToOtherSystemConverter(input, system);
        String expectedOutput = "22C";

        // Then
        Assert.assertEquals(output, expectedOutput);
    }

}
