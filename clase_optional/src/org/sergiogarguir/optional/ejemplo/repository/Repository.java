package org.sergiogarguir.optional.ejemplo.repository;

import org.sergiogarguir.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repository<T> {
    Optional<Computador> filtrar(String name);
}
