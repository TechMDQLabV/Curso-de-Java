package org.sergiogarguir.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        Stream<String> names = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Rodriguez", "Pepe Argento", "Pepe Mena", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();

        String resultado = names.reduce("resultado contatenacion", (a,b) -> a + ", " + b);
        System.out.println(resultado);
    }
}
