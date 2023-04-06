package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        Usuario user = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Rodriguez", "Pepe Argento", "Pepe Mena")
                .map(name -> new Usuario(name.split(" ")[0], name.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(3))
                .findFirst().orElseGet(() -> new Usuario("John", "Doe"));

        System.out.println("____" + user);
    }
}
