package com.fosanzdev.tema13.Ej9;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lanzadera {
    private List<Cohete> cohetes;
    private Atmosfera atmosfera;

    public Lanzadera(int numCohetes, int numEntornos) {
        this.cohetes = new ArrayList<>();
        for (int i = 0; i < numCohetes; i++) {
            cohetes.add(new Cohete("Cohete " + (i + 1), 1000, 10, 1000, 10000));
        }
        this.atmosfera = new Atmosfera(numEntornos);
    }

    public void lanzarCohete(Cohete cohete) {
        Entorno entorno = atmosfera.getEntorno();
        if (entorno.getWind() > cohete.getMaxWind()) {
            System.out.println("No se puede lanzar el cohete debido a las condiciones climáticas.");
        } else {
            System.out.println("Lanzando cohete " + "...");
        }
    }

    public void lanzarTodosLosCohetes() {
        for (Cohete cohete : cohetes) {
            lanzarCohete(cohete);
        }
    }

}