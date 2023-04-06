package org.sergiogarguir.recursividad.ejemplo;

import org.sergiogarguir.recursividad.ejemplo.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente gabinete = new Componente("Gabinete PC ATX");
        Componente fuente = new Componente("Fuente Poder 700w");
        Componente mother = new Componente("MainBoard Asus sockets AMD");
        Componente cpu = new Componente("CPU AMD Ryzen 5");
        Componente ventilador = new Componente("Cooler CPU");
        Componente disipador = new Componente("Disipador CPU");
        Componente tv = new Componente("Nvidia RTX 3080 8GB");
        Componente gpu = new Componente("Nvidia GPU RTX");
        Componente gpuRam1 = new Componente("4GB Ram");
        Componente gpuRam2 = new Componente("4GB Ram");
        Componente coolers = new Componente("Coolers");
        Componente ram = new Componente("Memoria RAM 32GB");
        Componente ssd = new Componente("Disco SSD 2T");

        cpu.addComponente(ventilador)
                .addComponente(disipador);
        tv.addComponente(gpu)
                .addComponente(gpuRam1)
                .addComponente(gpuRam2)
                .addComponente(coolers);
        mother.addComponente(cpu)
                .addComponente(tv)
                .addComponente(ram)
                .addComponente(ssd);
        gabinete.addComponente(fuente)
                .addComponente(mother)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mouse"));

        System.out.println("===================================== Metodo Recursivo =========================================");
        metodoRecursivo(gabinete, 0);
        System.out.println("====================================== Metodo Recursivo con Stream ========================================");
        metodoRecursivoStream(gabinete, 0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getName()));
    }

    public static void metodoRecursivo(Componente c, int nivel){
        System.out.println("\t".repeat(nivel) + c.getName());
        if(c.hasChildren()){
            for(Componente hijo: c.getHijos()){
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }

    public static Stream<Componente> metodoRecursivoStream(Componente c, int nivel){
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c),
                c.getHijos().stream().flatMap(hijo -> metodoRecursivoStream(hijo, nivel +1)));
    }
}
