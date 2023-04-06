package org.sergiogarguir.hilos.ejemplos.runnable;

import static org.sergiogarguir.hilos.ejemplos.EjemploSincronizacionThread.imprimirFrases;

public class ImprimirFrases implements Runnable{

    String frase1;
    String frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        imprimirFrases(this.frase1, this.frase2);
    }
}
