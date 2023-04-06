package org.sergiogarguir.ejemplos.set;

import org.sergiogarguir.ejemplos.set.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        //Set<Alumno> sa = new TreeSet<>((a,b) -> b.getName().compareTo(a.getName()));
        Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getName).reversed());
        sa.add(new Alumno("Pepe", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Juana", 3));
        sa.add(new Alumno("Zeus", 8));
        sa.add(new Alumno("Zeus", 8));

        System.out.println(sa);
    }
}
