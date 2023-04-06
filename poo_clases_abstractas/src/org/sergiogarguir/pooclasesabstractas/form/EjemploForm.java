package org.sergiogarguir.pooclasesabstractas.form;

import org.sergiogarguir.pooclasesabstractas.form.elementos.ElementoForm;
import org.sergiogarguir.pooclasesabstractas.form.elementos.InputForm;
import org.sergiogarguir.pooclasesabstractas.form.elementos.SelectForm;
import org.sergiogarguir.pooclasesabstractas.form.elementos.TextAreaForm;
import org.sergiogarguir.pooclasesabstractas.form.elementos.select.Opcion;
import org.sergiogarguir.pooclasesabstractas.form.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidator(new RequiredValidator());

        InputForm password = new InputForm("pass", "password");
        password.addValidator(new RequiredValidator())
            .addValidator(new LengthValidator(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidator(new RequiredValidator())
                .addValidator(new EmailValidator());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidator(new NumValidator());

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 10);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidator(new NotNullValidator());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2", "Python").setSelected())
        .addOpcion(new Opcion("3", "JavaScript"))
        .addOpcion(new Opcion("4", "PHP"))
        .addOpcion(new Opcion("5", "Ruby"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" +
                        this.name + "' value='" +
                        this.value + "'>";
            }
        };

        saludar.setValue("Hello man");
        username.setValue("john.doe");
        password.setValue("1");
        email.setValue("john@doe.com");
        edad.setValue("25");
        experiencia.setValue("... más de 20 años de experiencia ...");
        //java.setSelected(true);

        List<ElementoForm> elem = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);

        for(ElementoForm e: elementos){
            System.out.println(e.dibujarHtml());
        }
        elementos.forEach(e -> {
            if(!e.isValid()){
                //e.getErrors().forEach(err -> System.out.println(err));
                e.getErrors().forEach(System.out::println);
            }
        });

        System.out.println("======================================================================");
        elem.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

    }
}
