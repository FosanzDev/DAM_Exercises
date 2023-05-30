package com.fosanzdev.tema13.Ej9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Atmosfera {
    private List<Entorno> entornos;

    public Atmosfera(int numEntornos) {
        this.entornos = new ArrayList<>();
        for (int i = 0; i < numEntornos; i++) {
            entornos.add(new Entorno());
        }
    }

    public Entorno getEntorno() {
        Random random = new Random();
        return entornos.get(random.nextInt(entornos.size()));
    }
    
}