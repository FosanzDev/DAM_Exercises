package com.fosanzdev.tema13.RocketRace;

public class Rocket extends Thread{

    private static int SLEEP_TIME = 100;
    private static int MIN_ACCELERATION = 1;
    private static int MAX_ACCELERATION = 5;
    private static int idCounter = 0;

    private final String name;
    private final int id;
    private int speed;
    private int acceleration;
    private int position;
    private Entorno entorno;
    private Atmosphere atmosphere;
    private long ellapsedTime;
    Launchpad launchpad;

    public Rocket(String name, int speed, int position, Atmosphere atmosphere){
        this.id = idCounter++;
        this.name = name;
        this.speed = speed;
        this.acceleration = getRamdomAcceleration();
        this.position = position;
        this.atmosphere = atmosphere;
        this.entorno = atmosphere.getEntornoByPosition(position);
        this.setDaemon(true);
    }

    private int getRamdomAcceleration(){
        return (int) (Math.random() * (MAX_ACCELERATION - MIN_ACCELERATION + 1) + MIN_ACCELERATION);
    }

    public void setLaunchpad(Launchpad launchpad){
        this.launchpad = launchpad;
    }

    public String getRocketName(){
        return this.name;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getAcceleration(){
        return this.acceleration;
    }

    public int getPosition(){
        return this.position;
    }

    public long getEllapsedTime(){
        return this.ellapsedTime;
    }


    public int getRocketId(){
        return this.id;
    }

    public Atmosphere getAtmosphere(){
        return this.atmosphere;
    }

    public void setEntorno(Entorno entorno){
        this.entorno = entorno;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while(true){
            speed += acceleration;
            acceleration = getRamdomAcceleration();
            if (speed > atmosphere.getGeneralMaxSpeed()) {
                speed = atmosphere.getGeneralMaxSpeed();
            }

            if(speed > entorno.getMaxSpeed()){
                speed = entorno.getMaxSpeed();
            }

            position += speed;

            if (position >= entorno.getTicks()) {
                entorno = atmosphere.getEntornoByPosition(position);
            }

            //System.out.println(name + " va a " + speed + " km/h y está en el entorno " + entorno.getName() + " en la posición " + position);

            launchpad.updateProgress(this);

            if (entorno.isLast()) {
                this.ellapsedTime = System.currentTimeMillis() - startTime;
                try {
                    sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return;
            }

            try {
                sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


}
