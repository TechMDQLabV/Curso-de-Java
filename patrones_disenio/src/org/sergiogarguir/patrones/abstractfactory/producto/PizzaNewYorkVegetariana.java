package org.sergiogarguir.patrones.abstractfactory.producto;

import org.sergiogarguir.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        this.name = "Pizza vegetariana New York";
        this.masa = "Masa integral vegana";
        this.salsa = "Salsa de tomate";
        this.ingredientes.add("Queso Vegano");
        this.ingredientes.add("Tomate");
        this.ingredientes.add("Aceitunas");
        this.ingredientes.add("Espinacas");
        this.ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 150ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas.");
    }
}
