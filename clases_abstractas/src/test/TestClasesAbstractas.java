package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;
import domain.Triangulo;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        System.out.println("============================== Creando Rectangulo ==============================");
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        rectangulo.dibujar();
        System.out.println("============================== Creando Triangulo ==============================");
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        triangulo.dibujar();
    }
}
