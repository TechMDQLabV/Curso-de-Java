package org.sergiogarguir.optional.ejemplo.models;

import java.util.Optional;

public class Computador {
    private String name;
    private String model;
    private Procesador procesador;

    public Computador() {
    }
    public Computador(String name){
        this.name = name;
    }
    public Computador(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Computador(String name, String model, Procesador procesador) {
        this();
        this.procesador = procesador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public Optional<Procesador> getOptionalProcesador() {
        return Optional.ofNullable(procesador);
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return name + ' ' + model;
    }

}
