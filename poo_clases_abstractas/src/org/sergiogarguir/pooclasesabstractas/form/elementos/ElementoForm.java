package org.sergiogarguir.pooclasesabstractas.form.elementos;

import org.sergiogarguir.pooclasesabstractas.form.validador.LengthValidator;
import org.sergiogarguir.pooclasesabstractas.form.validador.Validator;
import org.sergiogarguir.pooclasesabstractas.form.validador.message.MessageFormatable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String value;
    protected String name;

    private List<Validator> validators;
    private List<String> errors;

    public ElementoForm() {
        this.validators = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public ElementoForm(String name) {
        this();
        this.name = name;
    }

    public ElementoForm addValidator(Validator validator){
        this.validators.add(validator);
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isValid(){
        for(Validator v: this.validators){
            if(!v.isValid(this.value)){
                if(v instanceof MessageFormatable){
                    this.errors.add(((MessageFormatable) v).getMessageFormat(name));
                }else {
                    this.errors.add(String.format(v.getMessage(), name));
                }
            }
        }
        return this.errors.isEmpty();
    }

    abstract public String dibujarHtml();

}
