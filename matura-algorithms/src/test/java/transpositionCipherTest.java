import org.junit.Assert;
import org.junit.Test;

public class transpositionCipherTest {

    @Test
    public void testEncryptingSingleWord() {
        // Given
        String input = "lokomotywa";

        // When
        String output = "OLOKOMYTAW";
        String encrypted = EncryptionAlgorithm.transpositionCipher(input);
        boolean isOutputRight = encrypted.equals(output);

        System.out.println(encrypted);
        // Then
        Assert.assertTrue(isOutputRight);
    }

}
