package org.sergiogarguir.optional.ejemplo;

import org.sergiogarguir.optional.ejemplo.models.Company;
import org.sergiogarguir.optional.ejemplo.models.Computador;
import org.sergiogarguir.optional.ejemplo.models.Fabricante;
import org.sergiogarguir.optional.ejemplo.models.Person;
import org.sergiogarguir.optional.ejemplo.models.Procesador;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class EjemploList {
    public static void main(String[] args) {
        Computador computador = new Computador("Computador sin Procesador");
        computador.setProcesador(new Procesador("alguno"));
        List<Company> companies = new ArrayList<>();
        companies.add(getNewCompany("TechMDQ"));
        companies.add(getNewCompany("Garguir & Co."));
        companies.add(getNewCompany("Sergio & Sons"));

        Optional.of(computador)
                .map(Computador::getProcesador)
                .ifPresent(procesador -> {
                        procesador.setFabricante(new Fabricante("Sony"));
                        System.out.println(computador.getName() + " Procesador " + computador.getProcesador());
                });
        /*
        if(computador.getProcesador() == null){
            System.out.println(computador.getName() + " Procesador NULL");
        }else{
            System.out.println(computador.getName() + " Procesador " + computador.getProcesador());
        }
        */
        System.out.println("ArrayList con forEach");
        companies.forEach(c -> c.viewCompany());

        System.out.println("ArrayList con for");
        for (Company c :companies) {
            c.viewCompany();
        }

        List<Company> companiesLinked = new LinkedList<>();
        companiesLinked.add(getNewCompany("TechMDQ"));
        companiesLinked.add(getNewCompany("Garguir & Co."));
        companiesLinked.add(getNewCompany("Sergio & Sons"));

        System.out.println("LinkedList con forEach");
        companiesLinked.forEach(c -> c.viewCompany());

        System.out.println("LinkedList con for");
        for (Company c :companiesLinked) {
            c.viewCompany();
        }
    }

    private static Company getNewCompany(String name){
        Person p;
        Company c = new Company(name);
        for(int i=0; i<10; i++) {
            p = new Person("Pepe "+i, "Argento "+i);
            p.setDni((int) (Math.random()*100000));
            c.addEmployee(p);
        }
        return c;
    }
}
