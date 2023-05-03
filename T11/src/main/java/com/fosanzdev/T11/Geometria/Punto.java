package com.fosanzdev.T11.Geometria;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this(0,0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Punto p){
        return sqrt(pow(p.x - this.x, 2) + pow(p.y - this.y, 2));
    }

    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }

}
