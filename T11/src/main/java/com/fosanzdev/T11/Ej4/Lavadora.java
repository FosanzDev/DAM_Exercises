package com.fosanzdev.T11.Ej4;

public class Lavadora extends Electrodomestico{

    private static final double DEFAULT_CARGA = 5;

    private final double carga;

    Lavadora(double precioBase, String color, char consumo, double peso, double carga){
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    Lavadora(){
        this(DEFAULT_PRECIOBASE, DEFAULT_COLOR.name(), DEFAULT_CONSUMO.getValue(), DEFAULT_PESO, DEFAULT_CARGA);
    }

    Lavadora(double precioBase, double peso){
        this(precioBase, DEFAULT_COLOR.name(), DEFAULT_CONSUMO.getValue(), peso, DEFAULT_CARGA);
    }

    Lavadora(double carga){
        this(DEFAULT_PRECIOBASE, DEFAULT_COLOR.name(), DEFAULT_CONSUMO.getValue(), DEFAULT_PESO, carga);
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        if (carga > 30){
            precioFinal += 50;
        }
        return precioFinal;
    }
}
