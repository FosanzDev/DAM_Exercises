package com.fosanzdev.tema13.Ej9;

import java.util.Random;

public class Entorno {
    String nombre;
    private int generalDeceleration;
    private int maxQLimit;
    private int damage;
    private int wind;

    public Entorno() {
        Random random = new Random();
        this.generalDeceleration = random.nextInt(10) + 1;
        this.maxQLimit = random.nextInt(50) + 1;
        this.damage = random.nextInt(10) + 1;
        this.wind = random.nextInt(20) + 1;
    }

    public int getGeneralDeceleration() {
        return generalDeceleration;
    }

    public int getMaxQLimit() {
        return maxQLimit;
    }

    public int getDamage() {
        return damage;
    }

    public int getWind() {
        return wind;
    }
}
