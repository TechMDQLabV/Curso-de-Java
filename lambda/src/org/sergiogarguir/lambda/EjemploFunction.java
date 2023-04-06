package org.sergiogarguir.lambda;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String, String> f1 = param -> "Hola que tal " + param;

        String resultado = f1.apply("Juan");
        System.out.println(resultado);

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("juan"));

        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase(Locale.ROOT).concat(b.toUpperCase(Locale.ROOT));
        System.out.println(f3.apply("Hello ", "Pedro"));

        BiFunction<String, String, Integer> f4 = (a, b) -> a.compareTo(b);
        System.out.println(f4.apply("juan", "estereotipo"));

        BiFunction<String, String, String> f5 = String::concat;  // es igual a esto (a, b) -> a.concat(b);
        System.out.println(f5.apply("juan ", "es mi hijo"));
    }
}
