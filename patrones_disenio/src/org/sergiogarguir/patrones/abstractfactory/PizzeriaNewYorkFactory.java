package org.sergiogarguir.patrones.abstractfactory;

import org.sergiogarguir.patrones.abstractfactory.producto.PizzaNewYorkItaliana;
import org.sergiogarguir.patrones.abstractfactory.producto.PizzaNewYorkPepperoni;
import org.sergiogarguir.patrones.abstractfactory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{



    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
