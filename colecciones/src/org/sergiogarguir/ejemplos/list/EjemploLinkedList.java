package org.sergiogarguir.ejemplos.list;

import org.sergiogarguir.ejemplos.set.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println("========================== Lista Vacía ===============================");
        System.out.println("al.size() = " + enlazada.size());
        System.out.println("Está vacía = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pepe", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Juana", 3));
        enlazada.add(new Alumno("Juana", 3));
        enlazada.add(new Alumno("Jaime", 3));
        enlazada.add(new Alumno("Zeus", 8));
        enlazada.add(new Alumno("Zeus", 8));

        System.out.println("========================== Lista Cargada ===============================");
        System.out.println("al.size() = " + enlazada.size());
        System.out.println("Está vacía = " + enlazada.isEmpty());

        enlazada.addFirst(new Alumno("Primero", 5));
        enlazada.addLast(new Alumno("Ultimo", 8));

        System.out.println(enlazada);
        System.out.println(enlazada.peekFirst());
        System.out.println(enlazada.peekLast());
        System.out.println("Con el indice 2 " + enlazada.get(2));

        ListIterator<Alumno> li = enlazada.listIterator();

        System.out.println("========================== Iterando Lista ===============================");
        while(li.hasNext()){
            System.out.println(li.next());
        }
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
