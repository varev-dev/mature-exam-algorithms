import java.util.TreeMap;

public class NumericalAlgorithms {

    public static boolean isNumberPerfect(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }

        return sum == number;
    }

    public static double[] getQuadraticEquationRoots(int a, int b, int c) {
        if (a == 0)
            throw new ArithmeticException("a(x^2) == 0");

        return calculateQuadraticEquationRoots(a, b, c);
    }

    private static double[] calculateQuadraticEquationRoots(int a, int b, int c) {
        double delta = calculateDelta(a, b, c);

        if (delta > 0) {
            return new double[]{
                Math.round((-b - Math.sqrt(delta)) / (2 * a) * 100) / 100.0,
                Math.round((-b + Math.sqrt(delta)) / (2 * a) * 100) / 100.0
            };
        } else if (delta == 0) {
            return new double[]{
                (-b * 1.0) / (2 * a)
            };
        } else {
            return new double[]{};
        }
    }

    public static double calculateDelta(int a, int b, int c) {
        if (a == 0)
            throw new ArithmeticException("a(x^2) == 0");

        return Math.round((Math.pow(b, 2) - (4 * a * c)) * 100) / 100.0;
    }

    public static TreeMap<Integer, Integer> integerFactorization(int number) {
        if (number == 0)
            return new TreeMap<>();

        var factors = new TreeMap<Integer, Integer>();

        while (number % 2 == 0) {
            factors = overrideElementToTreeMap(factors, 2);
            number /= 2;
        }

        while (number != 1 && number != -1) {
            for (int factor = 3; factor <= Math.round(number * 1.0 / 2); factor += 2) {
                if (number % factor == 0) {
                    factors = overrideElementToTreeMap(factors, factor);
                    number /= factor;
                    break;
                }
            }

            overrideElementToTreeMap(factors, number);
            number /= number;
        }

        return factors;
    }

    public static TreeMap<Integer, Integer> overrideElementToTreeMap(TreeMap<Integer, Integer> map, int value) {
        if (map.containsKey(value))
            map.put(value, map.get(value) + 1);
        else
            map.put(value, 1);

        return map;
    }

    public static int getFibonacciSequenceElement(int elementId) {
        if (elementId == 0)
            return 0;

        if (elementId <= 2)
            return 1;

        return getFibonacciSequenceElement(elementId - 1) + getFibonacciSequenceElement(elementId - 2);
    }

    public static int getFactorialElement(int elementId) {
        if (elementId < 2)
            return 1;

        return elementId * getFactorialElement(elementId - 1);
    }

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
        if (numberTwo == 0)
            return numberOne;

        return greatestCommonDivisor(numberTwo, numberOne % numberTwo);
    }

    public static int minValueIdFromArray(int[] array) {
        if (array.length == 0)
            throw new ArithmeticException("Array size == 0");

        int minId = 0;

        for (int elementId = 1; elementId < array.length; elementId++) {
            if (array[minId] > array[elementId])
                minId = elementId;
        }

        return minId;
    }

    public static int maxValueIdFromArray(int[] array) {
        if (array.length == 0)
            throw new ArithmeticException("Array size == 0");

        int maxId = 0;

        for (int elementId = 1; elementId < array.length; elementId++) {
            if (array[maxId] < array[elementId])
                maxId = elementId;
        }

        return maxId;
    }

}
