package org.sergiogarguir.poosobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println("la suma "+c.sumar(2.5F,2.2F));
    }
}
