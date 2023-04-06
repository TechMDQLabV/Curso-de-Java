package org.sergiogarguir.ejemplos.list;

import org.sergiogarguir.ejemplos.set.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> al = new ArrayList<>();
        System.out.println("========================== Lista Vacía ===============================");
        System.out.println("al.size() = " + al.size());
        System.out.println("Está vacía = " + al.isEmpty());
        al.add(new Alumno("Pepe", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(new Alumno("Jano", 7));
        al.add(new Alumno("Jano", 7));
        al.add(new Alumno("Juana", 3));
        al.add(2, new Alumno("Juana", 3));
        al.set(2, new Alumno("Jaime", 3));
        al.add(new Alumno("Zeus", 8));
        al.add(new Alumno("Zeus", 8));
        List<Alumno> a2 = new ArrayList<>(al);

        System.out.println("<<<Lista a2>>>");
        System.out.println(a2);
        System.out.println(al);

        al.remove(new Alumno("Jano", 7));
        al.remove(2); // elimina por indice
        boolean b = al.contains(new Alumno("Jano", 7));
        System.out.println(al + " " + b);

        System.out.println("========================== Lista Cargada ===============================");
        System.out.println("al.size() = " + al.size());
        System.out.println("Está vacía = " + al.isEmpty());

        Object a[] = al.toArray();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
