package org.sergiogarguir.archivos.ejemplos;

import org.sergiogarguir.archivos.ejemplos.service.ArchivoService;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "d:\\developer\\java\\cursoJava\\manejo_de_archivos\\java.txt";
        ArchivoService servicio = new ArchivoService();
        System.out.println(servicio.leerArchivo2(nombreArchivo));

    }
}
