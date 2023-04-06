package org.sergiogarguir.anotaciones.ejemplo.procesador;

import org.sergiogarguir.anotaciones.ejemplo.Init;
import org.sergiogarguir.anotaciones.ejemplo.JsonAtributo;
import org.sergiogarguir.anotaciones.ejemplo.procesador.exception.JsonSerializerException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class JsonSerializer {
    public static void inicializarObjeto(Object o){
        if(o == null){ // if(Objects.isNull(o))
            throw new JsonSerializerException("El objeto a serializar no puede ser null!!!");
        }

        Method[] metodos = o.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter(m -> m.isAnnotationPresent(Init.class))
                .forEach(m -> {
                    m.setAccessible(true);
                    try {
                        m.invoke(o);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializerException("Error al serializar, no se puede iniciar el objeto" + e.getMessage());
                    }
                });
    }

    public static String convertirJson(Object o){

        if(o == null){ // if(Objects.isNull(o))
            throw new JsonSerializerException("El objeto a serializar no puede ser null!!!");
        }
        inicializarObjeto(o);
        Field[] atributos = o.getClass().getDeclaredFields();

        return Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f -> {
                    f.setAccessible(true);
                    String name = f.getAnnotation(JsonAtributo.class).name().equals("")
                            ? f.getName() : f.getAnnotation(JsonAtributo.class).name();
                    try {
                        Object valor = f.get(o);
                        if(f.getAnnotation(JsonAtributo.class).capitalizar() && valor instanceof String){
                            String nuevoValor = (String)valor;
                            //nuevoValor = nuevoValor.substring(0 , 1).toUpperCase(Locale.ROOT) + nuevoValor.substring(1).toLowerCase(Locale.ROOT);
                            nuevoValor = Arrays.stream(nuevoValor.split(" "))
                                    .map(palabra -> palabra.substring(0,1).toUpperCase(Locale.ROOT) + palabra.substring(1).toLowerCase(Locale.ROOT))
                                    .collect(Collectors.joining(" "));

                            f.set(o, nuevoValor);
                        }
                        return "\"" + name + "\":\"" + f.get(o) + "\"";
                    } catch (IllegalAccessException e){
                        throw new JsonSerializerException("Error al serializar el JSON " + e.getMessage());
                    }
                })
                .reduce("{", (a,b) -> {
                    if("{".equals(a)){
                        return a + b;
                    }else{
                        return a + ", " + b;
                    }
                }).concat("}");
    }
}
