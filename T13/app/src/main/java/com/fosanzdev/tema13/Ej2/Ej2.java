package com.fosanzdev.tema13.Ej2;

import com.fosanzdev.tema13.Ej1.NumberPrinter;

public class Ej2 {
    

    public Ej2(){
        
        NumberPrinter np1 = new NumberPrinter(1, 100);
    
        Thread t1 = new Thread(np1);
        t1.start();

        //Esperamos a que finalice el hilo
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fin del programa");
    }
}
