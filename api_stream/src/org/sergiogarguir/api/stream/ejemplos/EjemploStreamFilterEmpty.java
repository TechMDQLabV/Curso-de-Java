package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        long count = Stream
                .of("Pato Guzman", "", "Pepa Rodriguez", "", "Pepe Mena")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("count = " + count);
    }
}
