package org.sergiogarguir.archivos.ejemplos.service;

import java.io.*;
import java.util.Scanner;

public class ArchivoService {

    public void crearArchivo(String name){
        File archivo = new File(name);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){
            buffer.append("Hola que tal\n")
                  .append("todo bien?\n")
                  .append("yo aca escribiendo un archivo...\n")
                  .append("Hasta luego");
            //buffer.close();
            System.out.println("El archivo se ha creado con éxito....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String name){
        File archivo = new File(name);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))){
            buffer.println("Hola que tal");
            buffer.println("todo bien?");
            buffer.println("yo aca escribiendo un archivo...");
            buffer.println("Hasta luego");
            //buffer.close();
            System.out.println("El archivo se ha creado con éxito....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String name){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(name);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));

            String linea;
            while((linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String leerArchivo2(String name){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(name);
        try(Scanner s = new Scanner(archivo)){
            s.useDelimiter("\n");
            while(s.hasNext()){
                sb.append(s.next()).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
