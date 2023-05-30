package com.fosanzdev.tema13.Ej1;

public class Ej1 {
    
    public Ej1(){

        NumberPrinter np1 = new NumberPrinter(1, 100);

        Thread t1 = new Thread(np1);
        t1.start();

        //No esperamos a que finalice el hilo
        System.out.println("Fin del programa");
    }
}
