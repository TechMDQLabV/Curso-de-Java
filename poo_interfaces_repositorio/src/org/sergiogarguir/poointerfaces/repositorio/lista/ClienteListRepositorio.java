package org.sergiogarguir.poointerfaces.repositorio.lista;

import org.sergiogarguir.poointerfaces.modelo.Cliente;
import org.sergiogarguir.poointerfaces.repositorio.AbstractListRepositorio;
import org.sergiogarguir.poointerfaces.repositorio.Direccion;
import org.sergiogarguir.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractListRepositorio<Cliente> {

    @Override
    public void editar(Cliente cliente) throws LecturaAccesoDatoException {
        Cliente cli = this.porId(cliente.getId());
        cli.setName(cliente.getName());
        cli.setLastName(cliente.getLastName());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((Cliente a, Cliente b) -> {
                    int result = 0;
                    if(dir == Direccion.ASC){
                        result = this.ordenar(campo, a,b);
                    }else if(dir == Direccion.DESC){
                        result = this.ordenar(campo, b,a);
                    }
                    return result;

        });
        return listaOrdenada;
    }

    private int ordenar(String campo, Cliente a, Cliente b){
        int result = 0;
        switch(campo){
            case "id" ->
                    result = a.getId().compareTo(b.getId());
            case "name" ->
                    result = a.getName().compareTo(b.getName());
            case "lastName" ->
                    result = a.getLastName().compareTo(b.getLastName());
        }
        return result;
    }

}
