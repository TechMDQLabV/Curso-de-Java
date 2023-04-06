package org.sergiogarguir.ejemplos.json;

import java.io.*;

public class Json {

    private static String PATH = "D:\\developer\\java\\cursoJava\\colecciones\\src\\org\\sergiogarguir\\ejemplos\\json\\files\\";

    public static void main(String[] args) {
        String cadena = readFile("prueba.json");
        System.out.println("cadenaJson sin limpiar " + cadena);
        cadena = cleanSpaces(cadena);
        System.out.println("cadenaJson limpia " + cadena);

        cadena = readFile("pruebaTXT.txt");
        System.out.println("cadenaTXT sin limpiar " + cadena);
        cadena = cleanSpaces(cadena);
        System.out.println("cadenaTXT limpia " + cadena);
    }



    private static String readFile(String file){
        String s = null;
        try{
            BufferedReader archi = new BufferedReader(new FileReader(PATH+file));
            StringBuilder sb = new StringBuilder();
            String line = null;

            while((line = archi.readLine()) != null){
                sb.append(line);
            }
            archi.close();
            s = sb.toString();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        return s;
    }

    private static String cleanSpaces(String s){
        //String regex = "\\s+(?=((\\\\[\\\\\"]|[^\\\\\"])*\"(\\\\[\\\\\"]|[^\\\\\"])*\")*(\\\\[\\\\\"]|[^\\\\\"])*$)";
        String regex = "\\s+(?=((\\[\"]|[^\"])*\"(\\[\"]|[^\"])*\")*(\\[\"]|[^\"])*$)";
        return s.replaceAll(regex,"");
    }
}
