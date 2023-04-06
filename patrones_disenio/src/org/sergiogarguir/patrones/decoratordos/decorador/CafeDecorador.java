package org.sergiogarguir.patrones.decoratordos.decorador;

import org.sergiogarguir.patrones.decoratordos.Configurable;

abstract public class CafeDecorador implements Configurable {

    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}
