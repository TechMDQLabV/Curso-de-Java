package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuarioSum {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        IntStream lengthNames = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Rodriguez", "Pepe Argento", "Pepe Mena", "Pepa Rodriguez", "Pepa Rodriguez", "Pepa Rodriguez")
                .map(name -> new Usuario(name.split(" ")[0], name.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.getId())
                .peek(System.out::println);

        //lengthNames.forEach(System.out::println);
        IntSummaryStatistics stats = lengthNames.summaryStatistics();
        System.out.println("Suma total: " + stats.getSum());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Promedio: " + stats.getAverage());
    }
}
