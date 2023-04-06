package org.sergiogarguir.patrones.singleton;

public class ConeccionBDSingleton {

    private static ConeccionBDSingleton instancia;
    private ConeccionBDSingleton() {
        System.out.println("Conectandonos con el motor de DB");
    }

    public static ConeccionBDSingleton getInstance(){
        if(instancia == null){
            instancia = new ConeccionBDSingleton();
        }
        return instancia;
    }

}
