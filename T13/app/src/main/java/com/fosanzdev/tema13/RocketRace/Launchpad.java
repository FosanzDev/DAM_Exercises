package com.fosanzdev.tema13.RocketRace;


public class Launchpad implements ProgressListener{
    public static final int SLEEP_TIME = 200;

    private final String name;
    private final Rocket[] rockets;
    private int[] positions;
    private int[] progresses;

    public Launchpad(String name, Rocket... rockets) {
        this.name = name;
        this.rockets = rockets;
        this.positions = new int[rockets.length];
        this.progresses = new int[rockets.length];

        for (Rocket rocket : rockets) {
            rocket.setLaunchpad(this);
        }
    }

    public synchronized void updateProgress(Rocket rocket) {
        int progress = (rocket.getPosition() * 100 / rocket.getAtmosphere().getTotalTicks());
        positions[rocket.getRocketId()] = rocket.getPosition();
        progresses[rocket.getRocketId()] = progress;
        //Clear the screen
        System.out.print("\033[H\033[2J");
        //Print the progress
        StringBuilder sb = new StringBuilder();
        sb.append("Launchpad: ").append(name).append("\n");
        for (int i = 0; i < rockets.length; i++) {
            int actualProgress = progresses[rockets[i].getRocketId()];
            sb.append("Rocket: ").append(rockets[i].getRocketName()).append("\n");    
            sb.append("Position: ").append(positions[rockets[i].getRocketId()]).append(" Progress: ").append(actualProgress >= 100 ? 100 : actualProgress).append("%\n");
        }
        System.out.print(sb.toString());
    }

    public void startRace() {
        for (Rocket rocket : rockets) {
            rocket.start();
        }

        for (Rocket rocket : rockets) {
            try {
                rocket.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Rocket rocket : rockets) {
            System.out.println(rocket.getRocketName() + " ha tardado " + rocket.getEllapsedTime() + " milisegundos");
        }
    }
}
