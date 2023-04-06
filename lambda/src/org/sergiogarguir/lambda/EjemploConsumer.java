package org.sergiogarguir.lambda;

import org.sergiogarguir.lambda.models.User;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {
        var nombre = "Pepe";

        Consumer<String> consumidor1 = saludo -> System.out.println(saludo);
        Consumer<String> consumidor = System.out::println;
        consumidor1.accept("Hola como va");
        consumidor.accept("Hola Mundo");

        Consumer<Date> consumidor2 = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor2.accept(new Date());

        BiConsumer<String, Integer> consumidor3 = (name, edad) -> System.out.println(name + " tiene " + edad);
        consumidor3.accept(nombre, 10);

        List<String> names = Arrays.asList("Juan", "Nico", "Pedro", "Nicasio", "Facundo", "Sergio", "Manuela", "Juana");
        names.forEach(consumidor);

        User user = new User();

        BiConsumer<User, String> asignarNames = (persona, name) -> {persona.setName(name);};
        //BiConsumer<User, String> asignarNames = User::setName;
        asignarNames.accept(user, "Pepe");
        System.out.println("Nombre de usuario: " + user.getName());

        Supplier<String> proveedor = () -> {return "Hola Mundo";};
    }
}
