package org.sergiogarguir.patrones.abstractfactory.producto;

import org.sergiogarguir.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana() {
        super();
        this.name = "Pizza Italiana New York";
        this.masa = "Masa gruesa";
        this.salsa = "Salsa de tomate";
        this.ingredientes.add("Queso Muzzarella");
        this.ingredientes.add("Orégano");
        this.ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min. a 120ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos.");
    }
}
