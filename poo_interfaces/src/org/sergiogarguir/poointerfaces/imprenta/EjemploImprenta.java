package org.sergiogarguir.poointerfaces.imprenta;

import org.sergiogarguir.poointerfaces.imprenta.models.*;

import static org.sergiogarguir.poointerfaces.imprenta.models.Imprimible.imprimir;

public class EjemploImprenta {
    public static void main(String[] args) {
        Resume cv = new Resume(new Person("John", "Doe"), "Ingeniero en Sistemas", "Resumen laboral ....");
        cv.addExperiences("java")
                .addExperiences("Oracle DBA")
                .addExperiences("Spring Framework")
                .addExperiences("Fullstack Developer")
                .addExperiences("Angular");

        Book libro = new Book(new Person("Erich", "Gamma"), "Patrones de Diseño: Elementos Reusables POO", Genre.PROGRAMACION);
        libro.addPage(new Page("Patron Singleton"))
                .addPage(new Page("Patron Observador"))
                .addPage(new Page("Patron Factory"))
                .addPage(new Page("Patron Facade"));

        Report report = new Report( new Person("Martin", "Fowler"), new Person("James", "Gosling"), "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(report);
        imprimir(libro);

        imprimir(new Imprimible(){

        });
    }


}
