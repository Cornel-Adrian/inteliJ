package ro.sci.functions;
/**
 *
 *
 *
 *
 */


import ro.sci.functions.math.Calculator;

public class Main {
    public void main(String[] args) {

        System.out.println("afgaa");

        Calculator calculator = new Calculator();
        System.out.println("Suma: " + calculator.adunare(3, 4));

        System.out.println("Fibonacci: "+ calculator.fibonacci(10));
    }
}
