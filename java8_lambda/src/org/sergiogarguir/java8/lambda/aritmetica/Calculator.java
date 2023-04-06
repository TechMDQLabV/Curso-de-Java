package org.sergiogarguir.java8.lambda.aritmetica;

import java.util.function.BiFunction;

public class Calculator {
    public double computar(double a, double b, Aritmetic lambda){
        return lambda.operacion(a, b);
    }

    public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda){
        return lambda.apply(a,b);
    }
}
