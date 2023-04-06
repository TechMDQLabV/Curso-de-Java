package org.sergiogarguir.optional.ejemplo.models;

import java.util.Optional;

public class Fabricante {
    private String name;

    public Fabricante() {
    }

    public Fabricante(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getOptionalName() {
        return Optional.ofNullable(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
