package com.fosanzdev.T11.Ej7;

import java.util.ArrayList;
public class Estadio {

    private final String nombre;
    private final String direccion;
    private int aforo;
    private int aforoVIP;
    private ArrayList<Partido> partidos;
    private final ArrayList<Area> areas;

    public Estadio(String nombre, String direccion, ArrayList<Area> areas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.areas = areas;
        this.partidos = new ArrayList<>();
        this.aforo = 0;
        this.aforoVIP = 0;

        for(Area area : areas){
            if(area.isVip()){
                this.aforoVIP += area.getAsientosPorFila() * area.getNumFilas();
            }else{
                this.aforo += area.getAsientosPorFila() * area.getNumFilas();
            }
        }
    }

    private void addPartido(Partido partido){
        this.partidos.add(partido);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Area> getAreas() {
        //Make a copy of each area of the arraylist
        ArrayList<Area> areasCopy = new ArrayList<>();
        for(Area area : this.areas){
            areasCopy.add(new Area(area));
        }
        return areasCopy;
    }
}
