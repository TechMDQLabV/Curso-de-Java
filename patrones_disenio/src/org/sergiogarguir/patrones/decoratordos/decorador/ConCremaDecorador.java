package org.sergiogarguir.patrones.decoratordos.decorador;

import org.sergiogarguir.patrones.decoratordos.Configurable;

public class ConCremaDecorador extends CafeDecorador{

    public ConCremaDecorador(Configurable cafe) {
        super(cafe);
    }


    @Override
    public float getPrecioBase() {
        return this.cafe.getPrecioBase() + 10F;
    }

    @Override
    public String getIngredientes() {
        return this.cafe.getIngredientes() + ", Crema";
    }
}
