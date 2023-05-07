package com.fosanzdev.T11.Ej7;

import java.util.ArrayList;
public class Estadio {

    private String nombre;
    private String direccion;
    private int aforo;
    private int aforoVIP;
    private ArrayList<Partido> partidos;
    private ArrayList<Area> areas;

    public Estadio(String nombre, String direccion, ArrayList<Area> areas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.areas = areas;
        this.partidos = new ArrayList<>();
        this.aforo = 0;
        this.aforoVIP = 0;

        for(Area area : areas){
            if(area.isVip()){
                this.aforoVIP += area.getAforo();
            }else{
                this.aforo += area.getAforo();
            }
        }
    }
}
