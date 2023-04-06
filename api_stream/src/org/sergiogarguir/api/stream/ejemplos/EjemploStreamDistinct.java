package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        Stream<String> names = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Rodriguez", "Pepe Argento", "Pepe Mena", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();

        names.forEach(System.out::println);

    }
}
