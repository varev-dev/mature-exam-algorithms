public class TextAlgorithm {

    public static boolean isPalindrome(String text) {
        StringBuilder builder = new StringBuilder(cleanText(text));

        return cleanText(text).equals(builder.reverse().toString());
    }

    public static String cleanText(String text) {
        StringBuilder output = new StringBuilder();
        text = text.toUpperCase();
        int charId = 0;

        while (charId != text.length()) {
            if (isInAlphabet(text.toCharArray()[charId]))
                output.append(text.toCharArray()[charId]);

            charId++;
        }


        return output.toString();
    }

    private static boolean isInAlphabet(char characterToCheck) {
        return (int) characterToCheck <= (int) 'Z' && (int) characterToCheck >= (int) 'A';
    }

}
