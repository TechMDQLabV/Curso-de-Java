package org.sergiogarguir.pooclasesabstractas.form.validador;

import org.sergiogarguir.pooclasesabstractas.form.validador.message.MessageFormatable;

public class LengthValidator extends Validator implements MessageFormatable {

    protected String message = "El campo %s debe tener minimo %d caracteres y máximo %d";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LengthValidator() {
    }

    public LengthValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        //this.message = String.format(this.message, this.min, this.max);
        if(value == null){
            return true;
        }
        int length = value.length();

        return (length >= this.min && length <= this.max);
    }

    @Override
    public String getMessageFormat(String field) {
        return String.format(this.message, field, this.min, this.max);
    }
}
