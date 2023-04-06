package org.sergiogarguir.hilos.ejemplossync;

import org.sergiogarguir.hilos.ejemplossync.runnable.Consumidor;
import org.sergiogarguir.hilos.ejemplossync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
