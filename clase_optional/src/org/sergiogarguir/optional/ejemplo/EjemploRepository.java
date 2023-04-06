package org.sergiogarguir.optional.ejemplo;

import org.sergiogarguir.optional.ejemplo.models.Computador;
import org.sergiogarguir.optional.ejemplo.repository.ComputadorRepository;
import org.sergiogarguir.optional.ejemplo.repository.Repository;

import java.util.Optional;

public class EjemploRepository {
    public static void main(String[] args) {
        Repository<Computador> repository = new ComputadorRepository();

        //Optional<Computador> pc = reposotory.filtrar("asus roge");
        repository.filtrar("asus").ifPresentOrElse(System.out::println, () -> System.out.println("No se Encontro"));


       /* if(pc.isPresent()){
            System.out.println(pc.toString());
        }else{
            System.out.println("No se encontró");
        }*/
    }
}
