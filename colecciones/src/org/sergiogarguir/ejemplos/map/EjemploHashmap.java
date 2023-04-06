package org.sergiogarguir.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashmap {
    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();
        persona.put(null, "1234");
        persona.put(null, "1234");
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

        System.out.println(persona.size());

        //System.out.println(persona.remove(null));
        System.out.println(persona.remove(null,"1234"));

        System.out.println(persona.containsKey(null));
        System.out.println(persona.containsValue("John"));


        System.out.println("persona = " + persona);

        Map<String, String> dirPersona = (Map<String, String>) persona.get("direccion");
        String pais = dirPersona.get("pais");
        String ciudad = dirPersona.get("ciudad");
        String barrio = dirPersona.getOrDefault("barrio", "La Playa");

        System.out.println("El país de " + persona.get("nombre") + " " + pais);
        System.out.println("La ciudad de " + persona.get("nombre") + " " + ciudad);
        System.out.println("El barrio de " + persona.get("nombre") + " " + barrio);

        Collection<Object> valores = persona.values();
        System.out.println("==================================================================");
        for(Object v: valores){
            System.out.println("v = " + v);
        }

        Set<String> llaves = persona.keySet();
        System.out.println("==================================================================");
        for(String k: llaves){
            System.out.println("k = " + k);
        }
        System.out.println("==================================================================");
        for(Map.Entry<String, Object> par: persona.entrySet()){
            Object valor = par.getValue();
            if(valor instanceof Map){
                Map<String, String> dir = (Map<String, String>) valor;
                System.out.println("El país de " + persona.get("nombre") + ": "
                        + dir.get("pais"));
                System.out.println("La ciudad de " + persona.get("nombre") + ": "
                        + dir.get("ciudad"));
                System.out.println("El estado de " + persona.get("nombre") + ": "
                        + dir.get("estado"));
            }else {
                for(Map.Entry<String, String> parDir: direccion.entrySet()) {
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            }

        }
        System.out.println("==================================================================");
        for(String llave: persona.keySet()){
            Object valor = persona.get(llave);
            if(valor instanceof Map){
                Map<String, String> dir = (Map<String, String>) valor;
                System.out.println("El país de " + persona.get("nombre") + ": "
                        + dir.get("pais"));
                System.out.println("La ciudad de " + persona.get("nombre") + ": "
                        + dir.get("ciudad"));
                System.out.println("El estado de " + persona.get("nombre") + ": "
                        + dir.get("estado"));
            }else {
                System.out.println(llave + " => " + valor);
            }
        }
        System.out.println("==================================================================");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });
        
        persona.replace("nombre", "Antonio");
        persona.replace("nombre","Juan", "Antonio");
        System.out.println("persona = " + persona);
    }
}
