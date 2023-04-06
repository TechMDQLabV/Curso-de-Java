package org.sergiogarguir.pooclasesabstractas.form.validador;

public class EmailValidator extends Validator{

    protected String message = "El campo %s es incorrecto";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

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
        return value.matches(EMAIL_REGEX);
    }
}
