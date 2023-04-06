package org.sergiogarguir.java.jdbc.repositorio;

import org.sergiogarguir.java.jdbc.models.Product;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
    T forId(Long Id);
    void save(Product product);
    void delete(Long id);
}
