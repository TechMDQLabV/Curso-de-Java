package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        boolean existe = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Rodriguez", "Pepe Argento", "Pepe Mena")
                .map(name -> new Usuario(name.split(" ")[0], name.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(3));

        System.out.println("____" + existe);

        List<Usuario> list = Arrays.asList(new Usuario("Pato", "Guzman"),
                new Usuario("Paco", "Gonzalez"),
                new Usuario("Pepa", "Rodriguez"),
                new Usuario("Pepe", "Argento"),
                new Usuario("Pepe", "Mena"));

        boolean resultado = false;
        for(Usuario u: list){
            if(u.getId().equals(3)){
                resultado = true;
                break;
            }
        }

    }
}
