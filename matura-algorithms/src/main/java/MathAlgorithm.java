public class MathAlgorithm {

    public static boolean isPrime(int number) {
        if (number < 1)
            throw new ArithmeticException();

        int divisor = 2;

        while (divisor < Math.ceil(number / 2.0)) {
            if (number % divisor == 0)
                return false;
            else {
                if (divisor == 2)
                    divisor++;
                else
                    divisor += 2;
            }
        }

        return true;
    }
    
    public static int lowestCommonMultiple(int numberOne, int numberTwo) throws ArithmeticException {
        if (numberOne * numberTwo < 0)
            throw new ArithmeticException("Numbers must have same characters (+/-)");

        if (numberOne == numberTwo)
            return numberOne;

        int multiplierOne = 1, multiplierTwo = 1;

        while (numberOne * multiplierOne != numberTwo * multiplierTwo) {
            if (numberOne * multiplierOne > numberTwo * multiplierTwo)
                multiplierTwo++;
            else
                multiplierOne++;
        }

        return numberOne * multiplierOne;
    }

    public static int greatestCommonDivisor(int numberOne, int numberTwo) {
        if (numberOne == numberTwo)
            return numberOne;

        if (numberOne < numberTwo) {
            int temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }

        for (int divisor = numberTwo; divisor >= 2; divisor--) {
            if (numberOne % divisor == 0 && numberTwo % divisor == 0)
                return divisor;
        }

        return 1;
    }

}
