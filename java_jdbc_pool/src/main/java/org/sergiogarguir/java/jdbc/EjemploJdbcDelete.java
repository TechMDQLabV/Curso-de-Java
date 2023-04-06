package org.sergiogarguir.java.jdbc;

import org.sergiogarguir.java.jdbc.models.Product;
import org.sergiogarguir.java.jdbc.repositorio.ProductRepositoryImpl;
import org.sergiogarguir.java.jdbc.repositorio.Repository;
import org.sergiogarguir.java.jdbc.util.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {
    public static void main(String[] args) {

            Repository<Product> repositorio = new ProductRepositoryImpl();

            System.out.println("============================= findAll() =============================");
            repositorio.findAll().forEach(System.out::println);

            System.out.println("============================= forId() =============================");
            System.out.println(repositorio.forId(1L));

            System.out.println("============================= delete() =============================");
            repositorio.delete(3L);
            System.out.println("Producto Listado con Exito!!!!");

            System.out.println("============================= findAll() =============================");
            repositorio.findAll().forEach(System.out::println);

    }
}

