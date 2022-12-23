public class NumericalAlgorithms {

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

}
