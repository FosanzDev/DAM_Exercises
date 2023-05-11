package com.fosanzdev.T11.Ej7;

import java.util.ArrayList;
import java.util.Arrays;

public class Ej7 {

    private static final int AREAS_ESTANDAR = 6;
    private static final int AREAS_VIP = 2;
    private static final int STD_FILAS = 50;
    private static final int STD_ASIENTOS_POR_FILA = 100;
    private static final double MULTIPLICADOR_VIP = 2;
    private static final double MULTIPLICADOR_BAJA = 0.75;
    private static final double MULTIPLICADOR_MEDIA = 1;
    private static final double MULTIPLICADOR_ALTA = 1.3;

    private static final ArrayList<Area> AREAS = new ArrayList<>(Arrays.asList(
            new Area(false, STD_FILAS, STD_ASIENTOS_POR_FILA, "Palco noroeste"),
            new Area(false, STD_FILAS, STD_ASIENTOS_POR_FILA, "Palco nordeste"),
            new Area(false, STD_FILAS, STD_ASIENTOS_POR_FILA, "Palco este superior"),
            new Area(false, STD_FILAS, STD_ASIENTOS_POR_FILA, "Palco oeeste superior"),
            new Area(false, STD_FILAS, STD_ASIENTOS_POR_FILA, "Palco sudoeste"),
            new Area(false, STD_FILAS, STD_ASIENTOS_POR_FILA, "Palco sudeste"),
            new Area(true, STD_FILAS, STD_ASIENTOS_POR_FILA, "Palco este inferior"),
            new Area(true, STD_FILAS, STD_ASIENTOS_POR_FILA, "Palco oeste inferior")));

    public Ej7(){
        Estadio estadio = new Estadio("Estadio de la Cartuja", "Sevilla", AREAS);
        Partido partido = new Partido(Afluencias.ALTA, "Sevilla FC", "Real Madrid");
        GestorEntradas gestorEntradas = new GestorEntradas(estadio, partido, 50, MULTIPLICADOR_VIP, MULTIPLICADOR_BAJA, MULTIPLICADOR_MEDIA, MULTIPLICADOR_ALTA);
    }

}
