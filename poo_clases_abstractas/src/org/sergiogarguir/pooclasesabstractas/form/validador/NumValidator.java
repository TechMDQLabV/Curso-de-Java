package org.sergiogarguir.pooclasesabstractas.form.validador;

public class NumValidator extends Validator{

    protected String message = "el campo %s debe ser numerico";
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
        try{
            Integer.parseInt(value);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
