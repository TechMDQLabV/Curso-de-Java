package org.sergiogarguir.api.stream.ejemplos;

import org.sergiogarguir.api.stream.ejemplos.models.Factura;
import org.sergiogarguir.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Pepe", "Argento");
        Usuario u2 = new Usuario("Juana", "Molina");
        u1.addFactura(new Factura("Compras tecnologías"));
        u1.addFactura(new Factura("Compras muebles"));
        u2.addFactura(new Factura("Compra bicicleta"));
        u2.addFactura(new Factura("Compra de Notebook"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);
        usuarios.stream().flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescription().concat(" Cliente: ")
                .concat(f.getUsuario().toString())));

        /*
        for(Usuario u: usuarios){
            for(Factura f: u.getFacturas()){
                System.out.println(f.getDescription());
            }
        }
         */
    }
}
