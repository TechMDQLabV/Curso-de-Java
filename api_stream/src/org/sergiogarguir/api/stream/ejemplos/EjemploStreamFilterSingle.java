package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        Stream<Usuario> names = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Rodriguez", "Pepe Argento", "Pepe Mena")
                .map(name -> new Usuario(name.split(" ")[0], name.split(" ")[1]))
                .filter(u -> u.getName().equals("Pepes"))
                .peek(System.out::println);
        Optional<Usuario> user = names.findFirst();
        //System.out.println("____" + user.orElse(new Usuario("John", "Doe")).getName());
        //System.out.println("____" + user.orElseGet(() ->new Usuario("John", "Doe")).getName());
        if(user.isPresent()) {
            System.out.println("____" + user.get());
        }else{
            System.out.println("No se encontró el objeto");
        }
        //names.forEach(System.out::println);
    }
}
