package org.sergiogarguir.genericos;

import org.sergiogarguir.poointerfaces.modelo.Cliente;
import org.sergiogarguir.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenerico {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andrés", "Gusmán"));

        Cliente andres = (Cliente)clientes.get(0);
        Cliente gusman = clientes.iterator().next();
        Cliente[] clientesArreglo = {new Cliente("Bea", "Galindo"), new Cliente("Andrés", "Gusmán")};
        Integer[] enterosArreglo = {1, 2, 3, 4};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        List<String> nombres = fromArrayToList(new String[]{"Andres", "María", "Pepe", "Bea"}, enterosArreglo);
        List<ClientePremium> clientesPremiumList = fromArrayToList(new ClientePremium[]{new ClientePremium("Paco", "Martinez"),new ClientePremium("Jaime", "Gandublia")});
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPremiumList);

        System.out.println("El Máximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("El Máximo de 1.3, 3.9 y 11.4 es: " + maximo(1.3f, 3.9f, 11.4f));
        System.out.println("El Máximo de anahoria, arándanos y caca es: " + maximo("anahoria", "arándanos", "caca"));

    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for(G elemento: g){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
