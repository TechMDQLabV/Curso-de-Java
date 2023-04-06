package org.sergiogarguir.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {
        
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Pejerrey", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for(String pez: peces){
            if(!unicos.add(pez)){
                duplicados.add(pez);
            }

        }
        System.out.println(unicos.size() + "elementos no duplicados " + unicos);
        System.out.println(duplicados.size() + "elementos duplicados " + duplicados);
        unicos.removeAll(duplicados);
        System.out.println(unicos.size() + "elementos no duplicados " + unicos);
    }
}
