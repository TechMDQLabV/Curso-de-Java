package org.sergiogarguir.patrones.observer.ejemplo;

import org.sergiogarguir.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1500);
        google.addObserver((observable, obj) -> {
            System.out.println("John " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Pepe " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Juana " + ((Corporacion)observable).getName() +
                    " nuevo precio $" +
                    ((Corporacion)observable).getPrecio());
        });

        google.modificaPrecio(2000);
        google.modificaPrecio(1500);

    }
}
