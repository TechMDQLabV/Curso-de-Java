package org.sergiogarguir.anotaciones.ejemplo;

import org.sergiogarguir.anotaciones.ejemplo.models.Producto;
import org.sergiogarguir.anotaciones.ejemplo.procesador.JsonSerializer;

import java.time.LocalDate;

public class EjemploAnotacion {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setDate(LocalDate.now());
        p.setName("mesa centro ROBLE");
        p.setPrice(1000L);

        System.out.println("==========================================================");

        System.out.println("json = " + JsonSerializer.convertirJson(p));
    }
}
