package com.fosanzdev.T11.Ej4;

import java.awt.*;
import java.util.Objects;

public class Electrodomestico {

    protected static final double DEFAULT_PRECIOBASE = 100;
    protected static final Colores DEFAULT_COLOR = Colores.BLANCO;
    protected static final Consumo DEFAULT_CONSUMO = Consumo.F;
    protected static final double DEFAULT_PESO = 5;

    private final double precioBase;
    private final Colores color;
    private final Consumo consumo;
    private final double peso;

    //Constructors

    public Electrodomestico(double precioBase, String color, char consumo, double peso) {
        this.precioBase = precioBase;
        Consumo validConsumo = comprobarConsumoEnergetico(consumo);
        Colores validColor = comprobarColor(color);

        if(validConsumo != null)
            this.consumo = validConsumo;
        else
            this.consumo = DEFAULT_CONSUMO;

        this.color = Objects.requireNonNullElse(validColor, DEFAULT_COLOR);

        this.peso = peso;
    }

    public Electrodomestico(){
        this(DEFAULT_PRECIOBASE, DEFAULT_COLOR.name(), DEFAULT_CONSUMO.getValue(), DEFAULT_PESO);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, DEFAULT_COLOR.name(), DEFAULT_CONSUMO.getValue(), peso);
    }

    // Getters

    public double getPrecioBase() {
        return precioBase;
    }

    public Colores getColor() {
        return color;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }


    private Consumo comprobarConsumoEnergetico(char ce){
        for (Consumo c: Consumo.values()){
            if (c.getValue() == ce)
                return c;
        }
        return null;
    }

    private Colores comprobarColor(String ce){
        for (Colores c: Colores.values()){
            if (c.name().equals(ce))
                return c;
        }
        return null;
    }

    public double precioFinal(){
        double precioFinal = precioBase;
        switch (consumo){
            case A:
                precioFinal += 100;
                break;
            case B:
                precioFinal += 80;
                break;
            case C:
                precioFinal += 60;
                break;
            case D:
                precioFinal += 50;
                break;
            case E:
                precioFinal += 30;
                break;
            case F:
                precioFinal += 10;
                break;
        }

        if (peso >= 0 && peso <= 19)
            precioFinal += 10;
        else if (peso >= 20 && peso <= 49)
            precioFinal += 50;
        else if (peso >= 50 && peso <= 79)
            precioFinal += 80;
        else if (peso >= 80)
            precioFinal += 100;

        return precioFinal;
    }

}
