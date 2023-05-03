package com.fosanzdev.T11.Ej3.Coche;

public class CocheCambioManual extends Coche{

    public CocheCambioManual(String matricula, int[] marchas) throws IllegalArgumentException{
        super(matricula, marchas);
    }

    @Override
    public void cambiarMarcha(int marcha) {
        this.marcha = marcha;
    }

    @Override
    protected void incrementarResto(double resto) {
    }
}