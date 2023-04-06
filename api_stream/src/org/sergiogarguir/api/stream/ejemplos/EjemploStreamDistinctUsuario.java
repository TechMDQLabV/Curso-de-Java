package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        Stream<Usuario> names = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Rodriguez", "Pepe Argento", "Pepe Mena", "Pepa Rodriguez", "Pepa Rodriguez", "Pepa Rodriguez")
                .map(name -> new Usuario(name.split(" ")[0], name.split(" ")[1]))
                .distinct();

        names.forEach(System.out::println);
    }
}
