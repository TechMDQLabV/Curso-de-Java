package org.sergiogarguir.patrones.composite.ejemplo;

import org.sergiogarguir.patrones.composite.Archivo;
import org.sergiogarguir.patrones.composite.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("API Stream");
        stream.addComponente(new Archivo("stream-map.docx"));
        java.addComponente(stream);
        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpg"));

        System.out.println(doc.mostrar(0));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("encontrado = " + encontrado);

        boolean encontradoDir = doc.buscar("Java");
        System.out.println("encontradoDir = " + encontradoDir);

        boolean encontradoDir2 = doc.buscar("Javax");
        System.out.println("encontradoDir = " + encontradoDir2);
    }
}
