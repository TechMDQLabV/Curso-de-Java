package org.sergiogarguir.patrones.singleton;

public class EjemploSingleton {
    public static void main(String[] args) {
        for(int i=0; i<10;i++){
            ConeccionBDSingleton con = ConeccionBDSingleton.getInstance();
            System.out.println("con = " + con);
        }
    }
}
