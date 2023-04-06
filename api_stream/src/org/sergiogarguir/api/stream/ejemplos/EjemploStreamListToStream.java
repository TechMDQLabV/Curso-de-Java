package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {
        List<Usuario> list = new ArrayList<>();
        list.add(new Usuario("Andrés","Montenegro"));
        list.add(new Usuario("Juan","Araldi"));
        list.add(new Usuario("Alfonso","Sonso"));
        list.add(new Usuario("Pepe","Argento"));
        list.add(new Usuario("Juana","Molina"));
        list.add(new Usuario("Tobias","Alonso"));
        list.add(new Usuario("Pepe","Torres"));

        Stream<String> names = list.stream()
                        .map(u -> u.getName().toUpperCase(Locale.ROOT)
                        .concat(" ")
                        .concat(u.getLastName()
                        .toUpperCase(Locale.ROOT)))
                        .flatMap(name -> {
                            if (name.contains("pepe".toUpperCase(Locale.ROOT))) {
                                return Stream.of(name);
                            }
                            return Stream.empty();
                        })
                        .map(String::toLowerCase)
                        .peek(System.out::println);
        System.out.println(names.count());
    }
}
