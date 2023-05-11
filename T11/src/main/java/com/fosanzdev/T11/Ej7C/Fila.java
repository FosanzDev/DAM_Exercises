package com.fosanzdev.T11.Ej7C;

public class Fila {

    private int numeroFila;
    private Asiento[] asientos;
    private double multiplicador;
    private boolean vip;

    public Fila(int numeroFila, int numeroAsientos){
        this.numeroFila = numeroFila;
        this.asientos = new Asiento[numeroAsientos];

        for(int i = 0; i < numeroAsientos; i++){
            this.asientos[i] = new Asiento(vip);
        }
    }

    public int getNumeroFila() {
        return numeroFila;
    }

    public Asiento getAsiento(int numeroAsiento){
        return this.asientos[numeroAsiento];
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }
}
