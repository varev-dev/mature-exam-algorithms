public class ConversionAlgorithm {

    private static final char[] numberSystemElements = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
        'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    public static String decimalToOtherSystemConverter(int value, int system) {
        if (system < 2 || system > numberSystemElements.length)
            throw new NumberFormatException("number system have to be in range <2;36>");

        int convertedNumberLength = 0;
        StringBuilder output = new StringBuilder();

        while (Math.pow(system, convertedNumberLength) <= value)
            convertedNumberLength++;

        int nextPower = convertedNumberLength - 1;

        while (value != 0 || output.length() <= convertedNumberLength - 1) {
            for (int charId = system - 1; charId >= 0; charId--) {
                int convertedValue = (int) Math.pow(system, nextPower) * charId;

                if (convertedValue <= value) {
                    value -= convertedValue;
                    output.append(numberSystemElements[charId]);
                    break;
                }
            }
            nextPower -= 1;
        }

        return output.toString();
    }

    public static int convertToDecimal(String value, int system) {
        int convertedValue = 0;
        char[] elements = value.toCharArray();

        for (int index = 0; index < elements.length; index++) {
            int power = elements.length - 1 - index;

            convertedValue += Math.pow(system, power) * getCharacterIndex(elements[index]);
        }

        return convertedValue;
    }

    private static int getCharacterIndex(char character) {
        for (int i = 0; i < numberSystemElements.length; i++) {
            if (character == numberSystemElements[i])
                return i;
        }

        return -1;
    }

}
