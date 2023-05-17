package com.fosanzdev.T11.Ej7C;

import com.fosanzdev.T11.Ej7C.Partido;

import java.util.ArrayList;

public class Asiento {

    private boolean ocupado;
    private ArrayList<Partido> partidos;
    private String numSorteo;
    private boolean vip;

    public Asiento(boolean vip){
        this.ocupado = false;
        this.partidos = new ArrayList<>();
        this.vip = vip;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public String getNumSorteo() {
        return numSorteo;
    }

    public boolean isVip() {
        return vip;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setNumSorteo(String numSorteo) {
        this.numSorteo = numSorteo;
    }

    public void addPartido(Partido partido){
        this.partidos.add(partido);
    }

    public boolean removePartido(Partido partido){
        return partidos.remove(partido);
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

}
