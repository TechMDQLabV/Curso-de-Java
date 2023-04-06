package org.sergiogarguir.ejemplos.json.utils;

import java.lang.reflect.Field;

public class Validator {

    public static boolean FieldsValidator(Object T){
        for(Field field : T.getClass().getDeclaredFields()){
            try {
                field.setAccessible(true);
                if (field.get(T) == null) {
                    return false;
                }
            }
                catch(Exception e){
                    System.out.println("Exception occured in processing");
            }
        }

        return true;
    }
}
