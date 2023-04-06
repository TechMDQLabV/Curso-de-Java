package org.sergiogarguir.app.jardin;

import org.sergiogarguir.app.hogar.*;
import org.sergiogarguir.app.hogar.Persona;
import static org.sergiogarguir.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setName("Sergio");
        p.setLastName("Garguir");
        p.setColorPelo(ColorPelo.CASTAÑO);
        System.out.println("Nombre: " + p.getName() + " Apellido: " + p.getLastName());

        Perro dog = new Perro();
        dog.name = "Sandino";
        String jugando = dog.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMasculino = GENERO_MASCULINO;
        String generoFemenino = GENERO_FEMENINO;
    }
}
