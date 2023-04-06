package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        Stream<Usuario> names = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Rodriguez", "Pepe Argento", "Pepe Mena")
                .map(name -> new Usuario(name.split(" ")[0], name.split(" ")[1]))
                .filter(u -> u.getName().equals("Pepe"))
                .peek(System.out::println);
        List<Usuario> list = names.collect(Collectors.toList());
        list.forEach(System.out::println);
        //names.forEach(System.out::println);


    }
}
