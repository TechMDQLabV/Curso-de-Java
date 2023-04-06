package org.sergiogarguir.optional.ejemplo;

import org.sergiogarguir.optional.ejemplo.enums.CardProduct;
import org.sergiogarguir.optional.ejemplo.enums.CardProduct1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class EjemploEnums {
    private static final Map<String, String> provincesAndCodes = new HashMap<>() {{
        put("CIUDAD_AUTONOMA_DE_BUENOS_AIRES", "C");
        put("CIUDAD AUTONOMA DE BUENOS AIRES", "C");
        put("CIUDAD_AUTONOMA_DE_BS_AS", "C");
        put("CIUDAD AUTONOMA DE BS AS", "C");
        put("CIUDAD_DE_BUENOS_AIRES", "C");
        put("CIUDAD DE BUENOS AIRES", "C");
        put("BUENOS_AIRES", "B");
        put("BUENOS AIRES", "B");
        put("CATAMARCA", "K");
        put("CHACO", "H");
        put("CHUBUT", "U");
        put("CORDOBA", "X");
        put("CORRIENTES", "W");
        put("ENTRE_RIOS", "E");
        put("ENTRE RIOS", "E");
        put("FORMOSA", "P");
        put("JUJUY", "Y");
        put("LA_PAMPA", "L");
        put("LA PAMPA", "L");
        put("LA_RIOJA", "F");
        put("LA RIOJA", "F");
        put("MENDOZA", "M");
        put("MISIONES", "N");
        put("NEUQUEN", "Q");
        put("RIO_NEGRO", "R");
        put("RIO NEGRO", "R");
        put("SALTA", "A");
        put("SAN_JUAN", "J");
        put("SAN JUAN", "J");
        put("SAN_LUIS", "D");
        put("SAN LUIS", "D");
        put("SANTA_CRUZ", "Z");
        put("SANTA CRUZ", "Z");
        put("SANTA_FE", "S");
        put("SANTA FE", "S");
        put("SANTIAGO_DEL_ESTERO", "G");
        put("SANTIAGO DEL ESTERO", "G");
        put("TIERRA_DEL_FUEGO", "V");
        put("TIERRA DEL FUEGO", "V");
        put("TUCUMAN", "T");
    }};


    public static void main(String[] args) {
        List<String> provinces = new ArrayList<>(
            Arrays.asList("CIUDAD_AUTONOMA_DE_BUENOS_AIRES",
                        "CIUDAD AUTONOMA DE BUENOS AIRES",
                        "CIUDAD AUTONOMA DE BS AS",
                        "CIUDAD DE BUENOS AIRES",
                        "BUENOS_AIRES",
                        "BUENOS AIRES",
                        "CATAMARCA",
                        "CHACO",
                        "CHUBUT",
                        "CORDOBA",
                        "CORRIENTES",
                        "ENTRE_RIOS",
                        "ENTRE RIOS",
                        "FORMOSA",
                        "JUJUY",
                        "LA_PAMPA",
                        "LA PAMPA",
                        "LA_RIOJA",
                        "LA RIOJA",
                        "MENDOZA",
                        "MISIONES",
                        "NEUQUEN",
                        "RIO_NEGRO",
                        "RIO NEGRO",
                        "SALTA",
                        "SAN_JUAN",
                        "SAN JUAN",
                        "SAN_LUIS",
                        "SAN LUIS",
                        "SANTA_CRUZ",
                        "SANTA CRUZ",
                        "SANTA_FE",
                        "SANTA FE",
                        "SANTIAGO_DEL_ESTERO",
                        "SANTIAGO DEL ESTERO",
                        "TIERRA_DEL_FUEGO",
                        "TIERRA DEL FUEGO",
                        "TUCUMAN",
                        "Otra PROVINCIA")
        );


        String visaCredit = "VISAEXCLU";
        String masterCredit = "YOYMASTREN";
        String visaDebit = "YOYBANEALT";
        String cardCode;

        System.out.println(CardProduct1.valueOf(visaCredit).getCode());

        try{
            cardCode = CardProduct1.valueOf(masterCredit).getCode();
        }catch (IllegalArgumentException err){
            cardCode = "0";
        }

        System.out.println("el código de la tarjeta es: " + cardCode);

        for(CardProduct tmp: CardProduct.values()){
            if(tmp.getDescription().equals(visaDebit)){
                cardCode = tmp.getCode();
            }
        }

        System.out.println("for - el código de la tarjeta es: " + cardCode);

        cardCode = CardProduct.UNDEFINED.getCardCode(visaDebit).getCode();

        System.out.println("getCardCode - el código de la tarjeta es: " + cardCode);

        cardCode = getCardProduct(visaCredit).getCode();

        System.out.println("getCardProduct - El código de la tarjeta es: " + cardCode);

        cardCode = getCardCodeStream("al");

        System.out.println("getCardCodeStream - El código de la tarjeta es: " + cardCode);


        provinces.forEach(p -> System.out.println("- getProvinceCode: " + p + " - " + getProvinceCode(p)));
        System.out.println("getProvinceCode: Buenos Aires " + getProvinceCode("BUENOS AIRES"));
        System.out.println("getProvinceCode: Buenos_Aires " + getProvinceCode("BUENOS_AIRES"));
        System.out.println("getProvinceCode: CIUDAD AUTONOMA DE BS AS " + getProvinceCode("CIUDAD AUTONOMA DE BS AS"));
        System.out.println("getProvinceCode: CACA " + getProvinceCode("CACA"));
        System.out.println("getProvinceCode: CORDOBA " + getProvinceCode("CORDOBA"));

    }

    private static CardProduct getCardProduct(String cardName){
        return Stream.of(CardProduct.values())
                    .filter(c -> c.getDescription().equals(cardName))
                    .findFirst()
                    .orElse(CardProduct.UNDEFINED);
    }

    private static String getCardCodeStream(String cardName){
        return Stream.of(CardProduct.values())
                                .filter(c -> c.getDescription().equals(cardName))
                                .findFirst()
                                .orElse(CardProduct.UNDEFINED)
                                .getCode();
    }

    private static String getProvinceCode(String provinceName) {
        return provincesAndCodes.entrySet()
                                    .stream()
                                    .filter(p -> provinceName.equals(p.getKey()))
                                    .map(Map.Entry::getValue)
                                    .findFirst()
                                    .orElse(provinceName);
    }
}
