package org.sergiogarguir.ejemplo;

import org.sergiogarguir.pooherencia.Alumno;
import org.sergiogarguir.pooherencia.AlumnoInternacional;
import org.sergiogarguir.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setName("Pepe");
        alumno.setLastName("Argento");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCiencias(7.3);
        alumno.setNotaLenguaje(8.2);
        alumno.setNotaMatematica(5.6);

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setName("Peter");
        alumnoInt.setLastName("York");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(18);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaCiencias(7.3);
        alumnoInt.setNotaLenguaje(8.2);
        alumnoInt.setNotaMatematica(5.6);
        alumnoInt.setNotaIdiomas(10);

        Profesor profesor = new Profesor();
        profesor.setName("Juana");
        profesor.setLastName("Molina");
        profesor.setAsignatura("Musica");

        System.out.println("Alumno: " + alumno.getName() + " " + alumno.getLastName());
        System.out.println("Alumno: " + alumnoInt.getName() + " " + alumnoInt.getLastName());
        System.out.println("Profesor " + profesor.getName() + " " + profesor.getLastName() + " Asignatura: " + profesor.getAsignatura());

        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

    }
}
