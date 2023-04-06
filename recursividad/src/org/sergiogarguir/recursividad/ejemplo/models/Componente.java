package org.sergiogarguir.recursividad.ejemplo.models;

import java.util.ArrayList;
import java.util.List;

public class Componente {
    private String name;
    private List<Componente> hijos;
    private int nivel;

    public Componente(String name) {
        this.name = name;
        this.hijos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Componente> getHijos() {
        return hijos;
    }

    public void setHijos(List<Componente> hijos) {
        this.hijos = hijos;
    }

    public Componente addComponente(Componente c){
        this.hijos.add(c);
        return this;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean hasChildren(){
        return !this.hijos.isEmpty();
    }
}
