package org.sergiogarguir.ejemplos.list;

import org.sergiogarguir.ejemplos.set.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pepe", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Juana", 3));
        sa.add(new Alumno("Zeus", 8));
        sa.add(new Alumno("Zeus", 8));

        //Collections.sort(sa, (a,b) -> a.getNote().compareTo(b.getNote()));
        //sa.sort((a,b) -> a.getNote().compareTo(b.getNote()));
        sa.sort(Comparator.comparing((Alumno a) -> a.getNote()));

        System.out.println(sa.size() + " " + sa);

        sa.sort(Comparator.comparing(Alumno::getNote).reversed());
        System.out.println(sa.size() + " " + sa);

        System.out.println("==================== Iterando expresiones Stream lambda =============================");
        sa.forEach(System.out::println);
    }
}
