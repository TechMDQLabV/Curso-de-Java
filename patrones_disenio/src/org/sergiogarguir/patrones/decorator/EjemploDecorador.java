package org.sergiogarguir.patrones.decorator;

import org.sergiogarguir.patrones.decorator.decorador.MayusculaDecorador;
import org.sergiogarguir.patrones.decorator.decorador.ReversaDecorador;
import org.sergiogarguir.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Pepe Argento");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayado = new SubrayadoDecorador(reversa);


        System.out.println(texto.darFormato());
        System.out.println(mayuscula.darFormato());
        System.out.println(reversa.darFormato());
        System.out.println(subrayado.darFormato());
    }
}
