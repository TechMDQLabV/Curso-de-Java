package org.sergiogarguir.patrones.decoratordos;

import org.sergiogarguir.patrones.decoratordos.decorador.ConChocolateDecorador;
import org.sergiogarguir.patrones.decoratordos.decorador.ConCremaDecorador;
import org.sergiogarguir.patrones.decoratordos.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe(7, "Café Moca");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("========================== Café Moca ==========================");
        System.out.println("El precio del café moca es: " + conChocolate.getPrecioBase());
        System.out.println("Los ingredientes: " + conChocolate.getIngredientes());

        Configurable capuchino = new Cafe(4, "Café Capuchino");
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);

        System.out.println("\n========================== Café Capuchino ==========================");
        System.out.println("El precio del café capuchino es: " + conLeche.getPrecioBase());
        System.out.println("Los ingredientes: " + conLeche.getIngredientes());

        Configurable cafeExpresso = new Cafe(3, "Café Expresso");

        System.out.println("\n========================== Café Expresso ==========================");
        System.out.println("El precio del café capuchino es: " + cafeExpresso.getPrecioBase());
        System.out.println("Los ingredientes: " + cafeExpresso.getIngredientes());

    }
}
