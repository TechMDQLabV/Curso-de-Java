package org.sergiogarguir.patrones.observer;

public class Corporacion extends Observable{

    private String name;
    private int precio;

    public Corporacion() {
    }

    public Corporacion(String name, int precio) {
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return this.name;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void modificaPrecio(int precio){
        this.precio = precio;
        notifyObservers();
    }

    @Override
    public String toString() {
        return  getName() +
                " nuevo precio $" +
                getPrecio();
    }
}
