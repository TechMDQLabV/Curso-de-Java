package org.sergiogarguir.patrones.decorator.decorador;

import org.sergiogarguir.patrones.decorator.Formateable;

import java.util.Locale;

public class MayusculaDecorador extends TextoDecorador{

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return this.texto.darFormato().toUpperCase(Locale.ROOT);
    }
}
