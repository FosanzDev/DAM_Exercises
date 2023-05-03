package com.fosanzdev.T11.Ej4;

public class Television extends Electrodomestico{

    protected static double DEFAULT_PULGADAS = 20;
    protected static boolean DEFAULT_SMARTTV = false;

    private final double pulgadas;
    private final boolean smartTV;

    Television(double precioBase, String color, char consumo, double peso, double pulgadas, boolean smartTV){
        super(precioBase, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.smartTV = smartTV;
    }

    Television(){
        this(DEFAULT_PRECIOBASE, DEFAULT_COLOR.name(), DEFAULT_CONSUMO.getValue(), DEFAULT_PESO, DEFAULT_PULGADAS, DEFAULT_SMARTTV);
    }

    Television(double precioBase, double peso){
        this(precioBase, DEFAULT_COLOR.name(), DEFAULT_CONSUMO.getValue(), peso, DEFAULT_PULGADAS, DEFAULT_SMARTTV);
    }

    // Getters

    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    @Override
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        if (pulgadas > 40){
            precioFinal += precioFinal * 0.3;
        }
        if (smartTV){
            precioFinal += 50;
        }
        return precioFinal;
    }

}
