package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterFlatMap {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        Stream<Usuario> names = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Rodriguez", "Pepe Argento", "Pepe Mena")
                .map(name -> new Usuario(name.split(" ")[0], name.split(" ")[1]))
                .flatMap(u -> {
                    if(u.getName().equals("Pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                });

        names.forEach(System.out::println);

    }
}
