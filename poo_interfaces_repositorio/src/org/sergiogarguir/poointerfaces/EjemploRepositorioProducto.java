package org.sergiogarguir.poointerfaces;

import org.sergiogarguir.poointerfaces.modelo.Cliente;
import org.sergiogarguir.poointerfaces.modelo.Producto;
import org.sergiogarguir.poointerfaces.repositorio.Direccion;
import org.sergiogarguir.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import org.sergiogarguir.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.sergiogarguir.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.sergiogarguir.poointerfaces.repositorio.lista.ClienteListRepositorio;
import org.sergiogarguir.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public abstract class EjemploRepositorioProducto {
    public static void main(String[] args) {
        try {
            OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
            repo.crear(new Producto("Mesa", 1500.50));
            repo.crear(new Producto("Silla", 845.20));
            repo.crear(new Producto("Lámpara", 1200.18));
            repo.crear(new Producto("Sillón", 2652.20));
            repo.crear(new Producto("Notebook", 35000.00));

            System.out.println("\n========================== Muestra todo el Listado ==============================");
            List<Producto> productos = repo.listar();
            productos.forEach(System.out::println);
            System.out.println("\n=========================== Muestra el listado Desde - Hasta =============================");
            List<Producto> paginable = repo.listar(2, 4);
            paginable.forEach(System.out::println);
            System.out.println("\n=========================== Muestra el Listado Ordenado =============================");
            List<Producto> ordenable = repo.listar("descripcion", Direccion.ASC);
            ordenable.forEach(System.out::println);
            System.out.println("\n======================= Editando Cliente =================================");
            Producto sillaActualizado = new Producto("Silla", 945.00);
            sillaActualizado.setId(2);
            repo.editar(sillaActualizado);
            Producto silla = repo.porId(2);
            System.out.println(silla);
            System.out.println("\n=========================== Muestra el Listado Ordenado =============================");
            repo.listar("lastName", Direccion.ASC).forEach(System.out::println);
            System.out.println("\n=========================== Eliminar Cliente =============================");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);
            System.out.println("============================= Total de Registros ================================");
            System.out.println("Total de Registros: " + repo.total());
        }catch(LecturaAccesoDatoException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(AccesoDatoException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
