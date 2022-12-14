public class EncryptionAlgorithm {

    private static final int MINIMAL_ASCII_CHARACTER_VALUE = 20;
    private static final int MAXIMAL_ASCII_CHARACTER_VALUE = 126;

    public static String caesarCipher(String text, int encryptionValue) {
        if (text.length() < 1 || encryptionValue == 0)
            return text;

        return encryptText(text, encryptionValue);
    }

    private static String encryptText(String text, int encryptionValue) {
        StringBuilder outputBuilder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            outputBuilder.append(
                encryptCharacter(text.charAt(i), encryptionValue)
            );
        }

        return outputBuilder.toString();
    }

    private static char encryptCharacter(char toEncrypt, int encryptionValue) {
        if (encryptionValue == 0)
            return toEncrypt;

        return encryptCharacter(
            (toEncrypt + 1 > MAXIMAL_ASCII_CHARACTER_VALUE ?
                MINIMAL_ASCII_CHARACTER_VALUE : (char) (toEncrypt + 1)),
            encryptionValue - 1);
    }

}
