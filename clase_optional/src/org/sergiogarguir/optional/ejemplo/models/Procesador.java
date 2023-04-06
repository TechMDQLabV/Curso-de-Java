package org.sergiogarguir.optional.ejemplo.models;

import java.util.Optional;

public class Procesador {
    private String name;
    private Fabricante fabricante;

    public Procesador() {
    }

    public Procesador(String name) {
        this.name = name;
    }

    public Procesador(String name, Fabricante fabricante) {
        this();
        this.fabricante = fabricante;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public Optional<Fabricante> getOptionalFabricante() {
        return Optional.ofNullable(fabricante);
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return name + " - " + fabricante;
    }
}
