package org.sergiogarguir.patrones.abstractfactory.producto;

import org.sergiogarguir.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        this.name = "Pizza vegetariana California";
        this.masa = "Masa a la piedra delgada";
        this.salsa = "Salsa de tomate con Rúcula";
        this.ingredientes.add("Queso Muzzarella");
        this.ingredientes.add("Aceitunas");
        this.ingredientes.add("Cebollas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35 min. a 125ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en porciones rectangulares.");
    }
}
