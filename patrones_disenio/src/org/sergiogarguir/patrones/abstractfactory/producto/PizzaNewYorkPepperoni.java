package org.sergiogarguir.patrones.abstractfactory.producto;

import org.sergiogarguir.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {

    public PizzaNewYorkPepperoni() {
        super();
        this.name = "Pizza Pepperoni New York";
        this.masa = "Masa delgada a la piedra";
        this.salsa = "Salsa de tomate";
        this.ingredientes.add("Queso Muzzarella");
        this.ingredientes.add("Extra Pepperoni");
        this.ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 90ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos.");
    }
}
