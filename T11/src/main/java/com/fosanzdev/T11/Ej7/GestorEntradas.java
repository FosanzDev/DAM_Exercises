package com.fosanzdev.T11.Ej7;

import java.util.ArrayList;

public class GestorEntradas {

    private final Estadio estadio;
    private final Partido partido;
    private final double precioBase;
    private final ArrayList<Area> areas;
    private final double multVip;
    private final double afBaja;
    private final double afMedia;
    private final double afAlta;

    public GestorEntradas(Estadio estadio, Partido partido, double precioBase, double multVip, double afBaja, double afMedia, double afAlta) {
        this.estadio = estadio;
        this.partido = partido;
        this.precioBase = precioBase;
        this.areas = estadio.getAreas();
        this.multVip = multVip;

        //TODO: Sobra
        this.afBaja = afBaja;
        this.afMedia = afMedia;
        this.afAlta = afAlta;
    }


    //El precio de las areas se gestiona de la siguiente manera:
    // Si es VIP --> precioBase * multiplicador VIP
    // Ademas de eso, se aplican tarifas por afluencia:
    // BAJA --> precioBase * multiplicador afluencia baja
    // MEDIA --> precioBase * multiplicador afluencia media
    // ALTA --> precioBase * multiplicador afluencia alta
    public double getPrecioEntrada(boolean vip){
        double precio = 0;
        if(vip){
            precio = this.precioBase * multVip;
        }else{
            precio = this.precioBase;
        }

        switch (this.partido.getAfluencia()){
            case BAJA:
                precio *= afBaja;
                break;
            case MEDIA:
                precio *= afMedia;
                break;
            case ALTA:
                precio *= afAlta;
                break;
        }

        return precio;
    }

    public ArrayList<Integer> getAforo(){
        ArrayList<Integer> aforo = new ArrayList<>();
        for(Area area : this.areas){
            aforo.add(area.getAsientosPorFila() * area.getNumFilas());
        }
        return aforo;
    }
}
