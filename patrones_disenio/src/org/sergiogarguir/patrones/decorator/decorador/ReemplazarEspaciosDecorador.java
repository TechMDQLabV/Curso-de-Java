package org.sergiogarguir.patrones.decorator.decorador;

import org.sergiogarguir.patrones.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador{


    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return this.texto.darFormato().replace(" ", "_");
    }
}
