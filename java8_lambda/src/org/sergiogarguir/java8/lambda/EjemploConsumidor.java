package org.sergiogarguir.java8.lambda;

import org.sergiogarguir.java8.lambda.models.User;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumidor {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println("Nombre: " + nombre + " - Edad: " + edad);

        consumidorBi.accept("Pepe", 40);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola Mundo!!!!!");

        List<String> nombres = Arrays.asList("Andrés", "Pepe", "Sergio", "Juana", "Andrea");
        nombres.forEach(consumidor2);

        Supplier<User> creaUsuario = User::new;
        User usuario = creaUsuario.get();

        BiConsumer<User, String> asignarNombre = User::setName;

        asignarNombre.accept(usuario, "Andres");
        System.out.println("Nombre usuario: " + usuario.getName());

        Supplier<String> proveedor = () -> "Hola Mundo lambda supplier";

        System.out.println(proveedor.get());

    }
}
