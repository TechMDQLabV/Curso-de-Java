package org.sergiogarguir.patrones.decoratordos;

public class Cafe implements Configurable{

    private float precio;
    private String name;

    public Cafe() {
    }

    public Cafe(float precio, String name) {
        this.precio = precio;
        this.name = name;
    }

    @Override
    public float getPrecioBase() {
        return this.precio;
    }

    @Override
    public String getIngredientes() {
        return this.name;
    }
}
