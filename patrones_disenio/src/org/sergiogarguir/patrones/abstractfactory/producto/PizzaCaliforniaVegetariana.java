package org.sergiogarguir.patrones.abstractfactory.producto;

import org.sergiogarguir.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        this.name = "Pizza vegetariana California";
        this.masa = "Masa delgada light";
        this.salsa = "Salsa de tomate BBQ";
        this.ingredientes.add("Queso Muzzarella");
        this.ingredientes.add("Espinacas");
        this.ingredientes.add("Cebollas");
        this.ingredientes.add("Aceitunas");
        this.ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 180ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas.");
    }
}
