package org.sergiogarguir.ejemplo;

import org.sergiogarguir.pooherencia.Alumno;
import org.sergiogarguir.pooherencia.AlumnoInternacional;
import org.sergiogarguir.pooherencia.Persona;
import org.sergiogarguir.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Pepe", "Argento","Instituto Nacional");
        alumno.setEmail("pepe@argento.com");
        alumno.setNotaCiencias(7.3);
        alumno.setNotaLenguaje(8.2);
        alumno.setNotaMatematica(5.6);

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "York", "Instituto Nacional");
        alumnoInt.setEmail("peter@york.com");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(18);
        alumnoInt.setNotaCiencias(7.3);
        alumnoInt.setNotaLenguaje(8.2);
        alumnoInt.setNotaMatematica(5.6);
        alumnoInt.setNotaIdiomas(10);

        Profesor profesor = new Profesor("Juana", "Molina");
        profesor.setEmail("juana@molina.com.ar");
        profesor.setAsignatura("Musica");

        System.out.println("Alumno: " + alumno.getName() + " " + alumno.getLastName());
        System.out.println("Alumno: " + alumnoInt.getName() + " " + alumnoInt.getLastName());
        System.out.println("Profesor " + profesor.getName() + " " + profesor.getLastName() + " Asignatura: " + profesor.getAsignatura());
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println(persona);
        System.out.println("==============================================================================================");
    }
}
