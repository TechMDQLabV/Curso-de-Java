package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
    public static void main(String[] args) {
        List<Usuario> list = new ArrayList<>();
        list.add(new Usuario("Andrés","Montenegro"));
        list.add(new Usuario("Juan","Araldi"));
        list.add(new Usuario("Alfonso","Sonso"));
        list.add(new Usuario("Pepe","Argento"));
        list.add(new Usuario("Juana","Molina"));
        list.add(new Usuario("Tobias","Alonso"));
        list.add(new Usuario("Pepe","Torres"));

        long t1 = System.currentTimeMillis();
        String result = list.stream()
                        .parallel()
                        .map(u -> u.toString().toUpperCase(Locale.ROOT))
                        .peek(n -> {
                            System.out.println("Nombre Thread: " + Thread.currentThread().getName()
                            + " - " + n);
                        })
                        .flatMap(name -> {
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            if (name.contains("pepe".toUpperCase(Locale.ROOT))) {
                                return Stream.of(name);
                            }
                            return Stream.empty();
                        })
                .findAny().orElse("");
        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (t2-t1));
        System.out.println(result);
    }
}
