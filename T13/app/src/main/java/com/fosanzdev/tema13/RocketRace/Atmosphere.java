package com.fosanzdev.tema13.RocketRace;

import java.util.ArrayList;

public class Atmosphere {

    public static final int MAX_SPEED = 100;
    public static final long MAX_ELLAPSED_TIME = Long.MAX_VALUE;
    
    private final ArrayList<Entorno> entornos = new ArrayList<Entorno>();
    private int[] indexes;

    public Atmosphere(Entorno... entornos){
        for (Entorno entorno : entornos) {
            this.entornos.add(entorno);
        }

        indexes = indexEntornos();
    }

    public Atmosphere(){
        this.entornos.add(new Entorno("Troposfera", 20, 200, 10));
        this.entornos.add(new Entorno("Estratosfera", 30, 200, 20));
        this.entornos.add(new Entorno("Mesosfera", 30, 200, 30));
        this.entornos.add(new Entorno("Termosfera", 40, 200, 40));
        this.entornos.add(new Entorno("Exosfera", 50, 200, 10));
        this.entornos.add(new Entorno("Ionosfera", 70, 200, 20));
        this.entornos.add(new Entorno("Magnetosfera", 70, 200, 30));
        this.entornos.add(new Entorno("Fin", 100, 200, 0, true));
    
        indexes = indexEntornos();
    }

    public Entorno getEntorno(int index){
        return this.entornos.get(index);
    }

    public Entorno getEntornoByPosition(int position){
        for (int i = 0; i < indexes.length; i++) {
            if (position < indexes[i]) {
                return entornos.get(i);
            }
        }

        return entornos.get(entornos.size() - 1);
    }

    public int[] indexEntornos(){
        int[] indexes = new int[entornos.size()];
        int count = 0;
        for (int i = 0; i < entornos.size(); i++) {
            count += entornos.get(i).getTicks();
            indexes[i] = count;
        }

        return indexes;
    }

    public int getTotalTicks(){
        return indexes[indexes.length - 2];
    }

    public int getEntornosSize(){
        return this.entornos.size();
    }

    public int getGeneralMaxSpeed(){
        return MAX_SPEED;
    }

    public long getGeneralMaxEllapsedTime(){
        return MAX_ELLAPSED_TIME;
    }
}
