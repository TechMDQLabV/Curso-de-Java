package org.sergiogarguir.pooclasesabstractas.form.validador;

public class RequiredValidator extends Validator{

    protected String message = "el campo %s es requerido";
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean isValid(String value) {
        return (value != null && value.length() > 0);
    }
}
