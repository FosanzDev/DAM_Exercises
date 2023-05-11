package com.fosanzdev.T11.Ej7C;

import java.util.GregorianCalendar;

public class Partido {

    private String local;
    private String visitante;
    private GregorianCalendar fecha;
    private String idSorteo;

    public Partido(String local, String visitante, GregorianCalendar fecha, String idSorteo){
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.idSorteo = idSorteo;
    }
}
