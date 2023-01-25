package com.fosanzdev.T7.Ej4;

public class Ej4 {

    public Ej4() {
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(3, 4);

        System.out.printf("Distancia entre puntos: %.3f\n", p1.distancia(p2));

        p1.visualizarPunto();
        p2.visualizarPunto();
    }
}
