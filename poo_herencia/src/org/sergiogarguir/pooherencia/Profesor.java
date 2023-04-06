package org.sergiogarguir.pooherencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor() {

    }

    public Profesor(String name, String lastName) {
        super(name, lastName);
    }

    public Profesor(String name, String lastName, String asignatura) {
        super(name, lastName);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar += " soy el Profesor " + this.getName() + " " + this.getLastName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura=" + asignatura;
    }
}
