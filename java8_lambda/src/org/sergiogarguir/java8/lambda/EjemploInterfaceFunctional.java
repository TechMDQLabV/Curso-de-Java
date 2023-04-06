package org.sergiogarguir.java8.lambda;

import org.sergiogarguir.java8.lambda.aritmetica.Aritmetic;
import org.sergiogarguir.java8.lambda.aritmetica.Calculator;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {
        Aritmetic suma = (a, b) -> a + b;
        Aritmetic resta = (a, b) -> a - b;

        Calculator cal = new Calculator();

        System.out.println(cal.computar(10, 5, suma));
        System.out.println(cal.computar(10, 5, resta));
        System.out.println(cal.computar(10,5, (a,b) -> a * b));
        System.out.println(cal.computarConBiFunction(10, 5, (a,b) -> a + b));
    }
}
