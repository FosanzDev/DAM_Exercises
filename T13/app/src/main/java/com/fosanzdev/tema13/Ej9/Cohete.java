package com.fosanzdev.tema13.Ej9;

public class Cohete implements Runnable {

    private String nombre;
    private int maxAcceleration;
    private int maxQSupported;
    private int maxWind;
    private int thrust;
    private int generalDamage;
    private int currentQ;
    private int currentDamage;
    private boolean missionCompleted;

    public Cohete(String nombre, int maxAcceleration, int maxQSupported, int thrust, int generalDamage) {
        this.nombre = nombre;
        this.maxAcceleration = maxAcceleration;
        this.maxQSupported = maxQSupported;
        this.thrust = thrust;
        this.generalDamage = generalDamage;
        this.currentQ = 0;
        this.currentDamage = 0;
        this.missionCompleted = false;
    }

    public void run() {
        while (!missionCompleted) {
            // Calculate current acceleration based on thrust and current Q
            int currentAcceleration = thrust * (maxQSupported - currentQ) / maxQSupported;

            // Update current Q based on current acceleration
            currentQ += currentAcceleration;

            // Check if current Q exceeds max Q supported
            if (currentQ > maxQSupported) {
                currentQ = maxQSupported;
                currentDamage += generalDamage;
            }

            // Check if current damage exceeds max damage
            if (currentDamage >= generalDamage) {
                missionCompleted = true;
            }

            // Sleep for 1 second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getCurrentQ() {
        return currentQ;
    }

    public int getCurrentDamage() {
        return currentDamage;
    }

    public boolean isMissionCompleted() {
        return missionCompleted;
    }

    public int getMaxWind() {
        return maxWind;
    }


}