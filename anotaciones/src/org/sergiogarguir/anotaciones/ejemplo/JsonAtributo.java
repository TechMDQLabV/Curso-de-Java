package org.sergiogarguir.anotaciones.ejemplo;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface JsonAtributo {
    String name() default "";
    boolean capitalizar() default false;
}
