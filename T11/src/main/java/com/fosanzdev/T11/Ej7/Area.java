package com.fosanzdev.T11.Ej7;

public class Area {

    boolean vip;
    int aforo;
    String nombre;

    public Area(boolean vip, int capacidad, String nombre) {
        this.vip = vip;
        this.aforo = capacidad;
        this.nombre = nombre;
    }

    //Making the copy constructor
    public Area(Area area){
        this.vip = area.isVip();
        this.aforo = area.getAforo();
        this.nombre = area.getNombre();
    }

    public boolean isVip() {
        return vip;
    }

    public int getAforo() {
        return aforo;
    }

    public String getNombre() {
        return nombre;
    }
}
