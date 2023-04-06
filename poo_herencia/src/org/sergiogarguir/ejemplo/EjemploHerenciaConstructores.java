package org.sergiogarguir.ejemplo;

import org.sergiogarguir.pooherencia.Alumno;
import org.sergiogarguir.pooherencia.AlumnoInternacional;
import org.sergiogarguir.pooherencia.Persona;
import org.sergiogarguir.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
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

    public static void imprimir(Persona persona){
        System.out.println("==================================================================");
        System.out.println(persona.getName()
                + " " + persona.getLastName()
                + " " + persona.getEdad()
                + " " + persona.getEmail());

        if(persona instanceof Alumno){
            System.out.println("Institución......: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matemática..: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Ciencias....: " + ((Alumno) persona).getNotaCiencias());
            System.out.println("Nota Lenguaje....: " + ((Alumno) persona).getNotaLenguaje());

            if(persona instanceof AlumnoInternacional){
                System.out.println("País.............: " + ((AlumnoInternacional) persona).getPais());
                System.out.println("Nota Idiomas.....: " + ((AlumnoInternacional) persona).getNotaIdiomas());
            }
            System.out.println("============================== Promedio de Notas ====================================");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("==================================================================");
        }

        if(persona instanceof Profesor){
            System.out.println("Asignatura...........: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("==================================================================");
        System.out.println(persona.saludar());
        System.out.println("==================================================================");
    }
}
