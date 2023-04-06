package org.sergiogarguir.pooclasesabstractas.form.elementos;

public class TextAreaForm extends ElementoForm{

    private int filas;
    private int columnas;

    public TextAreaForm(String name) {
        super(name);
    }

    public TextAreaForm(String name, int filas, int columnas) {
        super(name);
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Override
    public String dibujarHtml() {
        return "<textarea name='" + this.name + "' cols='"
                + this.columnas + "' rows='"
                + this.filas + "'>"
                + this.value + "</textarea>";
    }
}
