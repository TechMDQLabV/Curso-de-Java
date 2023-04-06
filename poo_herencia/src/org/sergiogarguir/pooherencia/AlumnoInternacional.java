package org.sergiogarguir.pooherencia;

public class AlumnoInternacional extends Alumno{
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional() {

    }

    public AlumnoInternacional(String name, String lastName) {
        super(name, lastName);
    }

    public AlumnoInternacional(String name, String lastName, String institucion) {
        super(name, lastName, institucion);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public double calcularPromedio() {
       // System.out.println("calcularPromedio " + AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio()*3) + this.notaIdiomas) /4;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar += " soy el alumno " + this.getName() + " " + this.getLastName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npais=" + pais +
                ", notaIdiomas=" + notaIdiomas;
    }
}
