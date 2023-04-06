package org.sergiogarguir.patrones.decorator.decorador;

import org.sergiogarguir.patrones.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }

}
