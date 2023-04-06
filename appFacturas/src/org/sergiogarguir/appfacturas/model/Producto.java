package org.sergiogarguir.appfacturas.model;

public class Producto {
    private int codigo;
    private String nombre;
    private float precio;
    private static int ultimoCodigo = 0;

    public Producto() {
        this.codigo = ++ultimoCodigo;
    }

    public Producto(String nombre) {
        this();
        this.nombre = nombre;
    }

    public Producto(String nombre, float precio) {
        this(nombre);
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigo +
                "\t" + nombre +
                "\t" + precio;
    }
}
