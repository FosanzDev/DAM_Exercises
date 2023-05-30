package com.fosanzdev.tema13.RocketRace;

public class Entorno {
    
    private String name;
    private int max_speed;
    private int ticks;
    private int sub_acceleration;
    private boolean isLast;

    public Entorno(String name, int max_speed, int ticks, int sub_acceleration, boolean isLast){
        this.name = name;
        this.max_speed = max_speed;
        this.ticks = ticks;
        this.sub_acceleration = sub_acceleration;
        this.isLast = isLast;
    }

    public Entorno(String name, int max_speed, int ticks, int sub_acceleration){
        this(name, max_speed, ticks, sub_acceleration, false);
    }

    public String getName(){
        return this.name;
    }

    public int getMaxSpeed(){
        return this.max_speed;
    }

    public int getTicks(){
        return this.ticks;
    }

    public int getSubAcceleration(){
        return this.sub_acceleration;
    }

    public boolean isLast(){
        return this.isLast;
    }
}
