package org.sergiogarguir.poointerfaces.imprenta.models;

public interface Imprimible {

    String TEXTO_DEFECTO = "Imprimiendo por defecto";

    default String print(){
        return TEXTO_DEFECTO;
    }

    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.print());
    }
}
