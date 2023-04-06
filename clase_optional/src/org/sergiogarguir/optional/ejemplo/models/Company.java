package org.sergiogarguir.optional.ejemplo.models;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private static Integer cont = 0;
    private Integer id;
    private String name;
    private List<Person> employees = new ArrayList<>();

    public Company(){
        cont++;
        this.id = cont;
    }
    public Company(String name){
        cont++;
        this.id = cont;
        this.name = name;
    }

    public Company(String name, Person person){
        cont++;
        this.id = cont;
        this.name = name;
        this.employees.add(person);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Person> employees) {
        this.employees = employees;
    }

    public void addEmployee(Person person){
        this.employees.add(person);
    }

    public void viewCompany(){
        System.out.println("____________________________________________________________________");
        System.out.println(this.id + " " + this.name);
        System.out.println("____________________________________________________________________");
        for (Person ps : this.employees) {
            System.out.println(ps);
        }
    }
}
