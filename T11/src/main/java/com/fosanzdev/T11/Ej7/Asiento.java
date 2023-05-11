package com.fosanzdev.T11.Ej7;

import java.util.ArrayList;

public class Asiento {

    private boolean ocupado;
    private int numeroAsiento;
    private ArrayList<Partido> partidos;

    public Asiento(int numeroAsiento){
        this.numeroAsiento = numeroAsiento;
        this.ocupado = false;
        this.partidos = new ArrayList<>();
    }
}
