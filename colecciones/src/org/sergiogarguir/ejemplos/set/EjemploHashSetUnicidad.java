package org.sergiogarguir.ejemplos.set;

import org.sergiogarguir.ejemplos.set.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        //Set<Alumno> sa = new HashSet<>();
        List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Pepe", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Juana", 3));
        sa.add(new Alumno("Zeus", 8));
        sa.add(new Alumno("Zeus", 8));

        System.out.println(sa.size() + " " + sa);

        System.out.println("==================== Iterando usando for clasico =============================");
        for(int i=0; i < sa.size(); i++){
            Alumno a = sa.get(i);
            System.out.println(a);
        }

        System.out.println("==================== Iterando usando foreach =============================");
        for(Alumno a: sa){
            System.out.println(a);
        }

        System.out.println("==================== Iterando usando while con iterator =============================");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a);
        }

        System.out.println("==================== Iterando expresiones Stream lambda =============================");
        sa.forEach(System.out::println);
    }
}
