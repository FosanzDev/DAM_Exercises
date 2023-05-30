package com.fosanzdev.tema13.RocketRace;

public class RocketRace {
    

    public static void main(String[] args) {
        Atmosphere atmosphere = new Atmosphere();
        Rocket rocket1 = new Rocket("Rocket 1", 0, 1000, atmosphere);
        Rocket rocket2 = new Rocket("Rocket 2", 0, 0, atmosphere);
        Rocket rocket3 = new Rocket("Rocket 3", 0, 0, atmosphere);
        Rocket rocket4 = new Rocket("Rocket 4", 0, 0, atmosphere);

        Launchpad launchpad = new Launchpad("Launchpad 1", rocket1, rocket2, rocket3, rocket4);
        launchpad.startRace();
    }
}
