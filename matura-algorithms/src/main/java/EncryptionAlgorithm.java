public class EncryptionAlgorithm {

    private static final int MINIMAL_ASCII_CHARACTER_VALUE = 20;
    private static final int MAXIMAL_ASCII_CHARACTER_VALUE = 126;

    public static String caesarCipher(String text, int encryptionValue) {
        if (text.length() < 1 || encryptionValue == 0)
            return text;

        StringBuilder outputBuilder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            outputBuilder.append(
                caesarEncryptCharacter(text.charAt(i), encryptionValue)
            );
        }

        return outputBuilder.toString();
    }

    private static char caesarEncryptCharacter(char toEncrypt, int encryptionValue) {
        if (encryptionValue == 0)
            return toEncrypt;

        return caesarEncryptCharacter(
            (toEncrypt + 1 > MAXIMAL_ASCII_CHARACTER_VALUE ?
                MINIMAL_ASCII_CHARACTER_VALUE : (char) (toEncrypt + 1)),
            encryptionValue - 1);
    }

    public static String gaderypolukiCipher(String text) {
        String[] substitutions = "GA DE RY PO LU KI".split(" ");
        char[] toEncrypt = text.toCharArray();

        for (int i = 0; i < toEncrypt.length; i++) {
            for (String sub : substitutions) {
                if (sub.contains(String.valueOf(toEncrypt[i]))) {
                    char[] currentCode = sub.toCharArray();
                    toEncrypt[i] = currentCode[0] == toEncrypt[i] ? currentCode[1] : currentCode[0];
                    break;
                }
            }
        }

        return String.valueOf(toEncrypt);
    }

}
