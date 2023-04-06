package org.sergiogarguir.poosobrecarga;

public class Calculadora {

    public int sumar(int a, int b){
        return a+b;
    }

    public float sumar(float a, float b){
        return a+b;
    }

    public float sumar(int a, float b){
        return a+b;
    }

    public int sumar(int... args){
        int total = 0;
        for(int a: args){
            total += a;
        }
        return total;
    }

    public float sumar(float f, int... args){
        float total = f;
        for(int a: args){
            total += a;
        }
        return total;
    }
}
