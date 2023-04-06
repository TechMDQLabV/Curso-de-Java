package org.sergiogarguir.poointerfaces;

import org.sergiogarguir.poointerfaces.modelo.Cliente;
import org.sergiogarguir.poointerfaces.repositorio.*;
import org.sergiogarguir.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.sergiogarguir.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.sergiogarguir.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.sergiogarguir.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import org.sergiogarguir.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public abstract class EjemploRepositorio {
    public static void main(String[] args) {
        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Jano", "Fernandez"));
            repo.crear(new Cliente("Bea", "Gonzalez"));
            repo.crear(new Cliente("Pepe", "Argento"));
            repo.crear(new Cliente("Juana", "Molina"));
            Cliente andres = new Cliente("Andres", "Ali");
            repo.crear(andres);
           //repo.crear(andres);

            System.out.println("\n========================== Muestra todo el Listado ==============================");
            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);
            System.out.println("\n=========================== Muestra el listado Desde - Hasta =============================");
            List<Cliente> paginable = repo.listar(2, 4);
            paginable.forEach(System.out::println);
            System.out.println("\n=========================== Muestra el Listado Ordenado =============================");
            List<Cliente> ordenable = repo.listar("lastName", Direccion.ASC);
            ordenable.forEach(System.out::println);
            System.out.println("\n======================= Editando Cliente =================================");
            Cliente beaActualizado = new Cliente("Bea", "Mena");
            beaActualizado.setId(2);
            repo.editar(beaActualizado);
            Cliente bea = repo.porId(2);
            System.out.println(bea);
            System.out.println("\n=========================== Muestra el Listado Ordenado =============================");
            repo.listar("lastName", Direccion.ASC).forEach(System.out::println);
            System.out.println("\n=========================== Eliminar Cliente =============================");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);
            System.out.println("============================= Total de Registros ================================");
            System.out.println("Total de Registros: " + repo.total());
        }catch(RegistroDuplicadoAccesoDatoException e){
            System.out.println("Registro Duplicado " + e.getMessage());
            e.printStackTrace();
        }catch(LecturaAccesoDatoException e) {
            System.out.println("Lectura " + e.getMessage());
            e.printStackTrace();
        }catch(EscrituraAccesoDatoException e){
            System.out.println("Escritura " + e.getMessage());
            e.printStackTrace();
        }catch(AccesoDatoException e){
            System.out.println("Generica " + e.getMessage());
            e.printStackTrace();
        }
    }
}
