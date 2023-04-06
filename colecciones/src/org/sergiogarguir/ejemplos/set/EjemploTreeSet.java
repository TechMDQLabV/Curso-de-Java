package org.sergiogarguir.ejemplos.set;

import java.net.Inet4Address;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

      /*  Set<String> ts = new TreeSet<>((a,b) -> {
            return b.compareTo(a);
        });*/
        //Set<String> ts = new TreeSet<>((a,b) -> b.compareTo(a)); // otra forma
        Set<String> ts = new TreeSet<>(Comparator.reverseOrder()); // otra forma

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        ts.add("tres");
        System.out.println("ts = " + ts);
        
        Set<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(7);
        numeros.add(3);
        numeros.add(9);
        numeros.add(2);
        numeros.add(5);
        System.out.println("numeros = " + numeros);
    }
}
