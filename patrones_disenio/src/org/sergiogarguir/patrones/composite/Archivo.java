package org.sergiogarguir.patrones.composite;

public class Archivo extends Componente{

    public Archivo(String name) {
        super(name);
    }

    @Override
    public String mostrar(int nivel) {
        return "\t".repeat(nivel)+this.name;
    }

    @Override
    public boolean buscar(String name) {
        return this.name.equals(name);
    }
}
