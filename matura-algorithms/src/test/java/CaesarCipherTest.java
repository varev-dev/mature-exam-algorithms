import org.junit.Assert;
import org.junit.Test;

public class CaesarCipherTest {

    @Test
    public void testEncryptingCharacter() {
        // Given
        String text = "Lorem ipsum";
        int shiftValue = 3;

        // When
        String output = "Oruhp#lsvxp";
        boolean matches = EncryptionAlgorithm.caesarCipher(text, shiftValue).equals(output);

        // Then
        Assert.assertTrue("Wrong output: " + EncryptionAlgorithm.caesarCipher(text, shiftValue), matches);

    }

}
