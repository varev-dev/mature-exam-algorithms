import org.junit.Assert;
import org.junit.Test;

public class TranspositionCipherTest {

    @Test
    public void testEncryptingSingleWord() {
        // Given
        String input = "lokomotywa";

        // When
        String output = "OLOKOMYTAW";
        String encrypted = EncryptionAlgorithm.transpositionCipher(input);
        boolean isOutputRight = encrypted.equals(output);

        // Then
        Assert.assertTrue(isOutputRight);
    }

}
