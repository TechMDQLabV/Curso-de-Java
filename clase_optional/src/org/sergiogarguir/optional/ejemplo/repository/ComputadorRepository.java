package org.sergiogarguir.optional.ejemplo.repository;

import org.sergiogarguir.optional.ejemplo.models.Computador;
import org.sergiogarguir.optional.ejemplo.models.Fabricante;
import org.sergiogarguir.optional.ejemplo.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class ComputadorRepository implements Repository<Computador>{

    private Object ArrayList;
    private List<Computador> dataSource;

    public ComputadorRepository() {
        dataSource = new ArrayList<>();
        Procesador procesador = new Procesador("I9-9880H", new Fabricante("Intel"));
        Computador asus = new Computador("Asus ROG", "Strix G512");
        asus.setProcesador(procesador);
        dataSource.add(asus);

        dataSource.add(new Computador("MacBook Pro", "MVVK2CI"));
    }

    @Override
    public Optional<Computador> filtrar(String name) {
        return dataSource.stream().filter(c -> c.getName().toLowerCase(Locale.ROOT)
                .contains(name.toLowerCase(Locale.ROOT)))
                .findFirst();
       /* for (Computador c: dataSource){
            if(c.getName().equalsIgnoreCase(name)){
                return Optional.of(c);
            }
        }
        return Optional.empty();*/
    }
}
