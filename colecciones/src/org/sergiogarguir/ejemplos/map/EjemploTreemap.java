package org.sergiogarguir.ejemplos.map;

import java.util.*;
import java.util.function.BiFunction;

public class EjemploTreemap {
    public static void main(String[] args) {
        var a = "pepe";
        var b = a.toUpperCase(Locale.ROOT);
        a = a.toUpperCase(Locale.ROOT);

        System.out.println(a + " - " + b);

        Integer iUno = 1;
        Integer iDos = 2;

        String xml =
                "<CATALOGO>\n" +
                    "\t<CD>\n" +
                        "\t\t<TITULO>Tinta roja</TITULO>\n" +
                        "\t\t<ARTISTA>Andres Calamaro</ARTISTA>\n" +
                        "\t\t<ORIGEN>AR</ORIGEN>\n" +
                        "\t\t<PRECIO>5.90</PRECIO>\n" +
                        "\t\t<ANO>2006</ANO>\n" +
                    "\t</CD>\n" +
                    "\t<CD>\n" +
                        "\t\t<TITULO>La Lengua Popular</TITULO>\n" +
                        "\t\t<ARTISTA>Andres Calamaro</ARTISTA>\n" +
                        "\t\t<ORIGEN>AR</ORIGEN>\n" +
                        "\t\t<PRECIO>9.90</PRECIO>\n" +
                        "\t\t<ANO>2007</ANO>\n" +
                    "\t</CD>\n" +
                "</CATALOGO>\n";


        var uno = 1;
        var dos = 2;

        var result1 = uno + dos;
        var result2 = resta(uno, dos);
        var result3 = iResta(iUno, iDos);

        int dim = (int)Arrays.stream(EnumMeses.MesesEnum.values()).count();
        int[] verbos = new int[dim];
        Map<String, Boolean> hashMap = new HashMap<String, Boolean>();

        hashMap.put(EnumMeses.MesesEnum.ENERO.name(), true);
        hashMap.put(EnumMeses.MesesEnum.FEBRERO.name(), false);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        BiFunction<Integer, Integer, Integer> suma = (lUno, lDos) -> {return lUno + lDos;};

        System.out.println("La suma es: " + suma.apply(uno, dos));

        //Map<String, Object> persona = new TreeMap<>((a,b) -> b.compareTo(a));
        Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", "23");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);

        System.out.println("------------------------------------------------------------------------");
        System.out.println(xml);

        xml = cleanXML(xml);

        System.out.println("------------------------------------------------------------------------");
        System.out.println(xml);
/*
        for ( EnumMeses.MesesEnum mes : EnumMeses.MesesEnum.values() ) {
            verbos[EnumMeses.MesesEnum.ordinal()]
        }
*/
        System.out.println(Arrays.stream(EnumMeses.MesesEnum.values()).count());
        System.out.println(EnumMeses.MesesEnum.ENERO);
        System.out.println(EnumMeses.MesesEnum.ENERO.name());
        System.out.println(EnumMeses.MesesEnum.ENERO.ordinal());
        System.out.println(EnumMeses.MesesEnum.ENERO.toString());
        System.out.println(EnumMeses.MesesEnum.ENERO.getMes().getName()+" - "+EnumMeses.MesesEnum.ENERO.getMes().getNumber()+" - "+EnumMeses.MesesEnum.ENERO.getMes().getText());
        System.out.println(hashMap.toString());



    }

    public static int resta(int uno, int dos){
        return uno - dos;
    }
    public static Integer iResta(Integer uno, Integer dos){
        return uno - dos;
    }

    public static String cleanXML(String xml){
        return xml.replaceAll("\t|\n| ","");
    }
}



























