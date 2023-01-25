package com.fosanzdev.T7.Ej5;

import com.fosanzdev.T7.Ej4.Punto;

public class Circulo {

    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Circulo(double x, double y, double radio) {
        this.centro = new Punto(x, y);
        this.radio = radio;
    }

    public Circulo() {
        this.centro = new Punto();
        this.radio = 1;
    }

    public Punto getCentro() {
        return centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setCentro(Punto centro1) {
        centro.setX(centro1.getX());
        centro.setY(centro1.getY());
    }

    public void setRadio(double radio1) {
        radio = radio1;
    }

    public double calcularDistancia(Punto p) {
        return p.distancia(centro);
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void visualizarCirculo() {
        System.out.printf("Circulo de radio %.1f situado en el ", radio);
        if (centro.getX() == 0 && centro.getY() == 0)
            System.out.println("origen de cordenadas");
        else {
            System.out.print("punto ");
            centro.visualizarPunto();
        }
    }

}
