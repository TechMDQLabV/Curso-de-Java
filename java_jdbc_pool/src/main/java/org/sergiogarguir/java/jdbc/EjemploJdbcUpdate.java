package org.sergiogarguir.java.jdbc;

import org.sergiogarguir.java.jdbc.models.Category;
import org.sergiogarguir.java.jdbc.models.Product;
import org.sergiogarguir.java.jdbc.repositorio.ProductRepositoryImpl;
import org.sergiogarguir.java.jdbc.repositorio.Repository;
import org.sergiogarguir.java.jdbc.util.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {

            Repository<Product> repositorio = new ProductRepositoryImpl();

            System.out.println("============================= findAll() =============================");
            repositorio.findAll().forEach(System.out::println);

            System.out.println("============================= forId() =============================");
            System.out.println(repositorio.forId(1L));

            System.out.println("============================= save() =============================");
            Product product = new Product();
            product.setId(5L);
            product.setName("Teclado Red Dragon Mecánico");
            product.setPrice(4500);
            Category category = new Category();
            category.setId(3L);
            product.setCategory(category);
            repositorio.save(product);
            System.out.println("Producto Listado con Exito!!!!");

            System.out.println("============================= findAll() =============================");
            repositorio.findAll().forEach(System.out::println);

    }
}

