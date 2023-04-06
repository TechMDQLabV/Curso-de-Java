package org.sergiogarguir.ejemplos.set.modelo;

import java.util.Objects;

public class Alumno implements Comparable{

    private String name;
    private Integer note;

    public Alumno() {
    }

    public Alumno(String name, Integer note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "name: " + name +
                " note: " + note;
    }

    @Override
    public int compareTo(Object a) {
        if(this.name == null){
            return 0;
        }
        return this.name.compareTo(((Alumno)a).name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(name, alumno.name) && Objects.equals(note, alumno.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, note);
    }
}
