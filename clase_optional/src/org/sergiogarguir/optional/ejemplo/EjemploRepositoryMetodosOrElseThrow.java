package org.sergiogarguir.optional.ejemplo;

import org.sergiogarguir.optional.ejemplo.models.Computador;
import org.sergiogarguir.optional.ejemplo.repository.ComputadorRepository;
import org.sergiogarguir.optional.ejemplo.repository.Repository;

import java.util.Optional;

public class EjemploRepositoryMetodosOrElseThrow {
    public static void main(String[] args) {
        Repository<Computador> repository = new ComputadorRepository();

        Computador pc = repository.filtrar("asus").orElseThrow(() -> new IllegalStateException());
        System.out.println(pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);

    }

    public static Computador valorDefecto(){
        return new Computador("Defecto", "defecto");
    }
}
