package org.sergiogarguir.patrones.abstractfactory.ejemplo;

import org.sergiogarguir.patrones.abstractfactory.PizzaProducto;
import org.sergiogarguir.patrones.abstractfactory.PizzeriaCaliforniaFactory;
import org.sergiogarguir.patrones.abstractfactory.PizzeriaNewYorkFactory;
import org.sergiogarguir.patrones.abstractfactory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getName());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andrés ordena la pizza " + pizza.getName());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("Pepe ordena la pizza " + pizza.getName());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Juana ordena la pizza " + pizza.getName());
    }
}
