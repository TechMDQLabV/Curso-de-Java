package org.sergiogarguir.patrones.decoratordos.decorador;

import org.sergiogarguir.patrones.decoratordos.Configurable;

public class ConChocolateDecorador extends CafeDecorador{

    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return this.cafe.getPrecioBase() + 5F;
    }

    @Override
    public String getIngredientes() {
        return this.cafe.getIngredientes() + ", Chocolate";
    }
}
