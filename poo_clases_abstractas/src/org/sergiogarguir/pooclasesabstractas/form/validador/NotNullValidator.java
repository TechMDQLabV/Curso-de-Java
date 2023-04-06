package org.sergiogarguir.pooclasesabstractas.form.validador;

public class NotNullValidator extends Validator{

    protected String message = "el campo %s no puede ser null";
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
        return (value != null);
    }
}
