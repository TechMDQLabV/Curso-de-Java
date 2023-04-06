package org.sergiogarguir.poointerfaces.repositorio;

import org.sergiogarguir.poointerfaces.modelo.BaseEntity;
import org.sergiogarguir.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.sergiogarguir.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.sergiogarguir.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T>{

    protected List<T> dataSource;

    public AbstractListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return this.dataSource;
    }

    @Override
    public T porId(Integer id) throws LecturaAccesoDatoException{
        if(id == null || id <=0 ){
            throw new LecturaAccesoDatoException("Id inválido debe ser mayor a 0");
        }
        T c = null;
        for(T cli: dataSource){
            if(cli.getId()!=null && cli.getId().equals(id)){
                c = cli;
                break;
            }
        }
        if(c == null){
            throw new LecturaAccesoDatoException("No existe el registro con el id: "+ id);
        }
        return c;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatoException {
        if(t == null){
            throw new EscrituraAccesoDatoException("Error al insertar un objeto null");
        }
        if(this.dataSource.contains(t)){
            throw new RegistroDuplicadoAccesoDatoException("Error insertar el objeto, éste ya existe en el repositorio");
        }
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException {
         this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }

    public int total(){
        return this.dataSource.size();
    }
}
