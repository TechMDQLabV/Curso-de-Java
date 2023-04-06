package org.sergiogarguir.pooherencia;

public class Persona {
    private String name;
    private String lastName;
    private int edad;
    private String email;

    public Persona(){

    }

    public Persona(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Persona(String name, String lastName, int edad, String email) {
        this.name = name;
        this.lastName = lastName;
        this.edad = edad;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar(){
        return "Hola que tal";
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", lastName=" + lastName +
                ", edad=" + edad +
                ", email='" + email +
                ", saludo = " + this.saludar();
    }
}
