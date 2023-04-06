package org.sergiogarguir.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematica;
    private double notaLenguaje;
    private double notaCiencias;

    public Alumno() {

    }

    public Alumno(String name, String lastName) {
        super(name, lastName);
    }

    public Alumno(String name, String lastName, String institucion) {
        super(name, lastName);
        this.institucion = institucion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaCiencias() {
        return notaCiencias;
    }

    public void setNotaCiencias(double notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    public double calcularPromedio(){
        //System.out.println("calcularPromedio " + Alumno.class.getCanonicalName());
        return (this.notaCiencias + this.notaLenguaje + this.notaMatematica ) / 3;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar += " soy " + this.getName() + " " + this.getLastName();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\ninstitucion=" + institucion +
                ", notaMatematica=" + notaMatematica +
                ", notaLenguaje=" + notaLenguaje +
                ", notaCiencias=" + notaCiencias +
                ", promedio=" + this.calcularPromedio();
    }
}
