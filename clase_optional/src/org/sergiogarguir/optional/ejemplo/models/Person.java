package org.sergiogarguir.optional.ejemplo.models;

import org.sergiogarguir.optional.ejemplo.Identifiable;

public class Person implements Identifiable<Integer> {
    private Integer dni;
    private String name;
    private String lastName;
    private Address address;
    private String birthDate;

    public Person() {
        this.address = new Address();
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.address = new Address();
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    @Override
    public Integer getId() {
        return this.dni;
    }

    @Override
    public void setId(Integer x) {
        this.dni = x;
    }

    @Override
    public boolean sameId(Integer anotherID) {
        return this.dni == anotherID;
    }
}
