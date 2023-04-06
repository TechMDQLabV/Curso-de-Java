package org.sergiogarguir.java8.lambda;

import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        Function<String, String> f1 = param -> "Hola que tal " + param;

        String resultado = f1.apply("Andres");
        System.out.println(resultado);
    }
}
