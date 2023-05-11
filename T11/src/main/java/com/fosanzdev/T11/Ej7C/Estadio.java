package com.fosanzdev.T11.Ej7C;

public class Estadio {

    private String nombre;
    private Area[] areas;

    public Estadio(String nombre, int numeroAreas){
        this.nombre = nombre;
        this.areas = new Area[numeroAreas];
    }

    public String getNombre() {
        return nombre;
    }

    public Area getArea(int numeroArea){
        return this.areas[numeroArea];
    }
}
