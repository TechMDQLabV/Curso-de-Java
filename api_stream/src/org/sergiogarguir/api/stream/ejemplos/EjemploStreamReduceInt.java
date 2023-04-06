package org.sergiogarguir.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        Stream<Integer> enteros = Stream.of(5, 10 , 15 , 20);

        Integer resultado = enteros.reduce(0, (a,b) -> a + b);
        System.out.println(resultado.toString());
    }
}
