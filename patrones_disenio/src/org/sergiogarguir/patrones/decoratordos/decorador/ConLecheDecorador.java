package org.sergiogarguir.patrones.decoratordos.decorador;

import org.sergiogarguir.patrones.decoratordos.Configurable;

public class ConLecheDecorador extends CafeDecorador{

    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }


    @Override
    public float getPrecioBase() {
        return this.cafe.getPrecioBase() + 3.7F;
    }

    @Override
    public String getIngredientes() {
        return this.cafe.getIngredientes() + ", Leche";
    }
}
