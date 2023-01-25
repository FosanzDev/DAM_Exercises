package com.fosanzdev.T7.Ej5;

import com.fosanzdev.T7.Ej4.Punto;

public class Ej5 {
    public Ej5() {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(2, 3, 5);
        Circulo c3 = new Circulo(new Punto(4, 5), 6);
        Circulo c4 = new Circulo(new Punto(6, 7), 8);

        c1.visualizarCirculo();
        System.out.println("El area del circulo 1 es: " + c1.calcularArea() + " uds^2 y el perimetro es: " + c1.calcularPerimetro() + " uds\n");

        c2.visualizarCirculo();
        System.out.println("El area del circulo 2 es: " + c2.calcularArea() + " uds^2 y el perimetro es: " + c2.calcularPerimetro() + " uds\n");

        c3.visualizarCirculo();
        System.out.println("El area del circulo 3 es: " + c3.calcularArea() + " uds^2 y el perimetro es: " + c3.calcularPerimetro() + " uds\n");

        c4.visualizarCirculo();
        System.out.println("El area del circulo 4 es: " + c4.calcularArea() + " uds^2 y el perimetro es: " + c4.calcularPerimetro() + " uds\n");

        System.out.println("La distancia entre el centro del circulo 1 y el centro del circulo2 es: " + c1.calcularDistancia(c2.getCentro()));

    }
}
