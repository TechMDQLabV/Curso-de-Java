package org.sergiogarguir.patrones.observer.ejemplo;

import org.sergiogarguir.patrones.observer.UsuarioRepositorio;

public class EjemploObserver2 {
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();

        repo.addObserver((o, u) -> System.out.println("Enviando email al usuario " + u));
        repo.addObserver((o, u) -> System.out.println("Enviando email al administrador " + u));
        repo.addObserver((o, u)  -> System.out.println("Guardando info del usuario en el logs " + u));

        repo.crearUsuario("Pepe");
    }
}
