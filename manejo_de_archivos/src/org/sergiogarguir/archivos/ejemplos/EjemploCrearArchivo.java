package org.sergiogarguir.archivos.ejemplos;

import org.sergiogarguir.archivos.ejemplos.service.ArchivoService;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "d:\\developer\\java\\cursoJava\\manejo_de_archivos\\java.txt";

        ArchivoService service = new ArchivoService();
        service.crearArchivo2(nombreArchivo);
    }
}
