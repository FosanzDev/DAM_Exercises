package com.fosanzdev.tema13.Ej1;

public class NumberPrinter implements Runnable{
    private int start;
    private int times;

    public NumberPrinter(int start, int times) {
        this.start = start;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(start + i);
        }

        System.out.println("Hilo finalizado");
    }
}
