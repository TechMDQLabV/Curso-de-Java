package org.sergiogarguir.patrones.abstractfactory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {
    protected String name;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public void preparar(){
        System.out.println("Preparando " + this.name);
        System.out.println("Seleccionando la masa " + masa);
        System.out.println("Agregando salsa " + salsa);
        System.out.println("Agregando  ingredientes: ");
        this.ingredientes.forEach(System.out::println);
    }

    abstract public void cocinar();
    abstract public void cortar();

    public void empaquetar(){
        System.out.println("Poniendo la pizza en una caja de empaque....");
    }

    public String getName() {
        return name;
    }

    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "name='" + name + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
