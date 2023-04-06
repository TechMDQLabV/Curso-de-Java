package org.sergiogarguir.patrones.abstractfactory;

import org.sergiogarguir.patrones.abstractfactory.producto.PizzaCaliforniaPepperoni;
import org.sergiogarguir.patrones.abstractfactory.producto.PizzaCaliforniaQueso;
import org.sergiogarguir.patrones.abstractfactory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "queso" -> new PizzaCaliforniaQueso();
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };
    }
}

