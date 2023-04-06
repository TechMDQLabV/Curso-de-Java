package org.sergiogarguir.ejemplos.map;

public class Mes {
    String name;
    int number;
    String text;

    public Mes() {
    }

    public Mes(String name, int number, String text) {
        this.name = name;
        this.number = number;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
