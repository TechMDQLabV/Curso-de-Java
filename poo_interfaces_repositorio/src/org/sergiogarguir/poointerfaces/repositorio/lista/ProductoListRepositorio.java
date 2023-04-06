package org.sergiogarguir.poointerfaces.repositorio.lista;

import org.sergiogarguir.poointerfaces.modelo.Cliente;
import org.sergiogarguir.poointerfaces.modelo.Producto;
import org.sergiogarguir.poointerfaces.repositorio.AbstractListRepositorio;
import org.sergiogarguir.poointerfaces.repositorio.Direccion;
import org.sergiogarguir.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractListRepositorio<Producto> {

    @Override
    public void editar(Producto producto) throws LecturaAccesoDatoException {
        Producto prod = this.porId(producto.getId());
        prod.setDescripcion(producto.getDescripcion());
        prod.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((Producto a, Producto b) -> {
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

    private int ordenar(String campo, Producto a, Producto b){
        int result = 0;
        switch(campo){
            case "id" ->
                    result = a.getId().compareTo(b.getId());
            case "descripcion" ->
                    result = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" ->
                    result = a.getPrecio().compareTo(b.getPrecio());
        }
        return result;
    }
}
