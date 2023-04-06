package org.sergiogarguir.patrones.abstractfactory.producto;

import org.sergiogarguir.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

    public PizzaCaliforniaPepperoni() {
        super();
        this.name = "Pizza Pepperoni California";
        this.masa = "Masa delgada";
        this.salsa = "Salsa de tomate con PP";
        this.ingredientes.add("Queso Muzzarella");
        this.ingredientes.add("Aceitunas");
        this.ingredientes.add("Pepperoni");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 28 min. a 115ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en porciones comunes.");
    }
}
