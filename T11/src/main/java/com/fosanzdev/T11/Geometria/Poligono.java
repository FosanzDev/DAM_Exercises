package com.fosanzdev.T11.Geometria;

import java.util.ArrayList;

public class Poligono {

    private final ArrayList<Punto> puntos;

    public Poligono(ArrayList<Punto> args) {
        this.puntos = args;
    }

    public Poligono(Punto... args) {
        this.puntos = new ArrayList<>();
        for (Punto punto : args) {
            this.puntos.add(punto);
        }
    }

    /**
     * Traslada todos los puntos del polígono
     * @param x valor de traslación en el eje x
     * @param y valor de traslación en el eje y
     */
    public void traslada(double x, double y){
        for (Punto punto : puntos) {
            punto.setX(punto.getX() + x);
            punto.setY(punto.getY() + y);
        }
    }

    /**
     * Devuelve el número de vértices del polígono
     * @return int con el número de vértices
     */
    public int numVertices(){
        return puntos.size();
    }

    /**
     * Devuelve el perímetro del polígono
     * @return double con el perímetro
     */
    public double perimetro(){
        double perimetro = 0;
        // Calculamos la distancia entre puntos adyacentes
        for (int i = 0; i < puntos.size() - 1; i++) {
            perimetro += puntos.get(i).distancia(puntos.get(i + 1));
        }
        // Añadimos al cálculo la distancia entre el último y el primero
        perimetro += puntos.get(puntos.size() - 1).distancia(puntos.get(0));
        return perimetro;
    }

    @Override
    public String toString(){
        //Creamos el StringBuilder y añadimos el header
        StringBuilder sb = new StringBuilder();
        sb.append("Poligono: (");
        //Añadimos los puntos
        for (Punto punto : puntos) {
            sb.append(punto.toString()).append(", ");
        }
        // Eliminamos la última coma y añadimos el footer
        sb.delete(sb.length() - 2, sb.length());
        sb.append(")");
        // Devolvemos el String
        return sb.toString();
    }
}
