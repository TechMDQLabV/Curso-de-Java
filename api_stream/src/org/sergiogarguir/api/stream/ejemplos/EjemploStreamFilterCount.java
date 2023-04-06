package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterCount {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        long count = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Rodriguez", "Pepe Argento", "Pepe Mena")
                .map(name -> new Usuario(name.split(" ")[0], name.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println("____" + count);


    }
}
