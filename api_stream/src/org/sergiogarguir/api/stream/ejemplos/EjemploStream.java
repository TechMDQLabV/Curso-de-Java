package org.sergiogarguir.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        System.out.println("========================== 1 ==============================");
        Stream<String> names = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        names.forEach(System.out::println);

        System.out.println("========================== 2 ==============================");
        String[] array = {"Pato", "Paco", "Pepa", "Pepe"};
        Stream<String> names2 = Arrays.stream(array);
        names2.forEach(System.out::println);

        System.out.println("============================ 3 ============================");
        Stream<String> names3 = Stream.<String>builder().add("Pato")
                .add("Paco")
                .add("Pepa")
                .add("Pepe")
                .build();
        names3.forEach(System.out::println);

        System.out.println("============================ 4 ============================");
        List<String> list = new ArrayList<>();
        list.add("Pato");
        list.add("Paco");
        list.add("Pepa");
        list.add("Pepe");

        Stream<String> names4 = list.stream();
        names4.forEach(System.out::println);
        System.out.println("______________otra forma");
        list.stream().forEach(System.out::println);


    }
}
