package ro.sci.functions.math;


public class Calculator {
    /**
     * Sum function
     *
     * @param a
     * @param b
     * @return the sum of parameters
     */
    public int adunare(int a, int b) {
        return a + b;
    }

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}