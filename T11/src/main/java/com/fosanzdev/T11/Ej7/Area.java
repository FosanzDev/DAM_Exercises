package com.fosanzdev.T11.Ej7;

public class Area {

    boolean vip;
    int aforo;

    public Area(boolean vip, int capacidad) {
        this.vip = vip;
        this.aforo = capacidad;
    }

    public boolean isVip() {
        return vip;
    }

    public int getAforo() {
        return aforo;
    }
}
