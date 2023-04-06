package org.sergiogarguir.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{
    private List<Componente> hijos;

    public Directorio(String name) {
        super(name);
        this.hijos = new ArrayList<>();
    }

    public Componente addComponente(Componente c){
        this.hijos.add(c);
        return this;
    }

    public void removeComponente(Componente c){
        this.hijos.remove(c);
    }

    @Override
    public String mostrar(int nivel) {
        StringBuilder sb = new StringBuilder("\t".repeat(nivel));
        sb.append(this.name)
                .append("/")
                .append("\n");
        for(Componente hijo: this.hijos){
            sb.append(hijo.mostrar(nivel+1));
            if(hijo instanceof Archivo) {
                    sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean buscar(String name) {
        if(this.name.equals(name)){
            return true;
        }
       /*
        for(Componente hijo: hijos){
            if(hijo.buscar(name)){
                return true;
            }
        }
        */
        return hijos.stream().anyMatch(n -> n.buscar(name));
    }
}
