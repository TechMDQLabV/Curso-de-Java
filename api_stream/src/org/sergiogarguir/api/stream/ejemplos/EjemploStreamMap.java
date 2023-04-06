package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        Stream<Usuario> names = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Rodriguez", "Pepe Argento")
                .map(name -> new Usuario(name.split(" ")[0], name.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String name = usuario.getName().toUpperCase(Locale.ROOT);
                    usuario.setName(name);
                    return usuario;
                });
        List<Usuario> list = names.collect(Collectors.toList());
        list.forEach(System.out::println);
        //names.forEach(System.out::println);


    }
}
