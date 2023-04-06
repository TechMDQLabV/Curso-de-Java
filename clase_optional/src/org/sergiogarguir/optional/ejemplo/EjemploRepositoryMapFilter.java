package org.sergiogarguir.optional.ejemplo;

import org.sergiogarguir.optional.ejemplo.models.Computador;
import org.sergiogarguir.optional.ejemplo.models.Fabricante;
import org.sergiogarguir.optional.ejemplo.models.Procesador;
import org.sergiogarguir.optional.ejemplo.repository.ComputadorRepository;
import org.sergiogarguir.optional.ejemplo.repository.Repository;

public class EjemploRepositoryMapFilter {
    public static void main(String[] args) {
        Repository<Computador> repository = new ComputadorRepository();

        String f = repository.filtrar("asus")
                .flatMap(Computador::getOptionalProcesador)
                .flatMap(Procesador::getOptionalFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getName()))
                .map(Fabricante::getName)
                .orElse("Desconocido");

        System.out.println(f);

    }

}
