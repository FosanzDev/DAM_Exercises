package com.fosanzdev.T11.Ej7;

import java.util.ArrayList;
import java.util.Arrays;

public class Ej7 {

    private static final int AREAS_ESTANDAR = 6;
    private static final int AREAS_VIP = 2;
    private static final int MAX_AFORO_POR_AREA = 1000;
    private static final ArrayList<Area> AREAS = new ArrayList<>(Arrays.asList(
            new Area(false, MAX_AFORO_POR_AREA),
            new Area(false, MAX_AFORO_POR_AREA),
            new Area(false, MAX_AFORO_POR_AREA),
            new Area(false, MAX_AFORO_POR_AREA),
            new Area(false, MAX_AFORO_POR_AREA),
            new Area(false, MAX_AFORO_POR_AREA),
            new Area(true, MAX_AFORO_POR_AREA),
            new Area(true, MAX_AFORO_POR_AREA)));

    public Ej7(){
        Estadio estadio = new Estadio("Estadio de la Cartuja", "Sevilla", AREAS);


    }

}
