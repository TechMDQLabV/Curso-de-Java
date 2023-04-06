package org.sergiogarguir.hilos.ejemplos;

import org.sergiogarguir.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo1 = new NombreThread("John Doe");
        hilo1.start();
        //Thread.sleep(30);
        Thread hilo2 = new NombreThread("María Doe");
        hilo2.start();
        Thread hilo3 = new NombreThread("Pepe Argento");
        hilo3.start();
        System.out.println(hilo1.getState());
    }
}
