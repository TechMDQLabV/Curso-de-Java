package org.sergiogarguir.java.jdbc;

import org.sergiogarguir.java.jdbc.models.Category;
import org.sergiogarguir.java.jdbc.models.Product;
import org.sergiogarguir.java.jdbc.repositorio.ProductRepositoryImpl;
import org.sergiogarguir.java.jdbc.repositorio.Repository;
import org.sergiogarguir.java.jdbc.util.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {
        String chain;
        chain = "Pepe dos";
        System.out.println("________ " + chain.split(" ").length);

        try (Connection conn = DBConnection.getInstance()) {
            Repository<Product> repositorio = new ProductRepositoryImpl();

            System.out.println("============================= fingAll() =============================");
            repositorio.findAll().forEach(System.out::println);

            System.out.println("============================= forId() =============================");
            System.out.println(repositorio.forId(1L));

            System.out.println("============================= save() =============================");
            Product product = new Product();
            product.setName("Teclado Razer Ergonómico");
            product.setPrice(7000);
            product.setRegister_date(new Date());
            Category category = new Category();
            category.setId(3L);
            product.setCategory(category);
            repositorio.save(product);
            System.out.println("Producto Listado con Exito!!!!");

            System.out.println("============================= fingAll() =============================");
            repositorio.findAll().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

