package org.sergiogarguir.pooclasesabstractas.form.elementos.select;

public class Opcion {
    private String value;
    private String name;
    private boolean selected;

    public Opcion() {
    }

    public Opcion(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Opcion setSelected() {
        this.selected = true;
        return this;
    }
}
