package com.fosanzdev.T11.Ej7;

public class Fila {

    private int numeroFila;
    private Asiento[] asientos;
    private double multiplicador;


    public Fila(int numeroFila, int numeroAsientos){
        this.numeroFila = numeroFila;
        this.asientos = new Asiento[numeroAsientos];

        for(int i = 0; i < numeroAsientos; i++){
            this.asientos[i] = new Asiento(i);
        }
    }

    public int getNumeroFila() {
        return numeroFila;
    }

    public Asiento getAsiento(int numeroAsiento){
        return this.asientos[numeroAsiento];
    }
}
