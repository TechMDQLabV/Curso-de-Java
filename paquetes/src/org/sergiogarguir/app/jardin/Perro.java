package org.sergiogarguir.app.jardin;

import org.sergiogarguir.app.hogar.Persona;

public class Perro {
    protected String name;
    protected String raza;

    String jugar(Persona p){
        return p.lanzarPelota();
    }
}
