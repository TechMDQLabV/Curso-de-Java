package org.sergiogarguir.optional.ejemplo;

import org.sergiogarguir.optional.ejemplo.models.Computador;
import org.sergiogarguir.optional.ejemplo.repository.ComputadorRepository;
import org.sergiogarguir.optional.ejemplo.repository.Repository;

public class EjemploRepositoryMetodosOrElse {
    public static void main(String[] args) {
        Repository<Computador> repository = new ComputadorRepository();

        Computador pc = repository.filtrar("asus").orElse(valorDefecto());
        System.out.println(pc);

        pc = repository.filtrar("macbook").orElseGet(() -> valorDefecto());
        System.out.println(pc);
    }

    public static Computador valorDefecto(){
        return new Computador("Defecto", "defecto");
    }
}
