package com.fosanzdev.T11.Ej2;

import com.fosanzdev.T11.Geometria.Poligono;
import com.fosanzdev.T11.Geometria.Punto;

public class Ej2 {

    public Ej2(){
        // Crea un polígono de cuatro vértices
        Poligono poligono = new Poligono(
                new Punto(0, 0),
                new Punto(2, 0),
                new Punto(2, 2),
                new Punto(0, 2)
        );

        // Muestra la información del polígono
        System.out.println(poligono);

        // Muestra su perímetro
        System.out.println("Perímetro: " + poligono.perimetro());

        // Traslada el polígono 4 unidades en el eje x
        // Y -3 unidades en el eje y

        poligono.traslada(4, -3);

        // Muestra la información del polígono
        System.out.println(poligono);
    }
}
