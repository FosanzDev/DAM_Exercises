package com.fosanzdev.T11.Ej7;

public class Partido {

    private final Afluencias afluencia;
    private final String equipoLocal;
    private final String equipoVisitante;

    public Partido(Afluencias afluencia, String equipoLocal, String equipoVisitante) {
        this.afluencia = afluencia;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public Afluencias getAfluencia() {
        return afluencia;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }
}
