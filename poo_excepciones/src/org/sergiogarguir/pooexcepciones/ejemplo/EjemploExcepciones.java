package org.sergiogarguir.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador");


        int divisor;
        double division;

        try {
            //divisor = Integer.parseInt(valor);
            //division = cal.dividir(10, divisor);
            //System.out.println(division);

            double division2 = cal.dividir(numerador, denominador);
            System.out.println(division2);
        }catch(NumberFormatException nfe) {
            System.out.println("Error, ingrese un valor numérico" + nfe.getMessage());
            main(args);
        }catch(FormatoNumeroException e){
            System.out.println("Se detecto una excepcion, ingrese un numero valido" + e.getMessage());
            e.printStackTrace(System.out);
        }catch(DivisionPorZeroException dpze){
            System.out.println("Capturamos el error " + dpze);
            main(args);
        }finally {
            System.out.println("_______________Ejecutando finally");
        }
        System.out.println("Continua la ejecucion");
    }
}
