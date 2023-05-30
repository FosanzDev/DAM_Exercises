package com.fosanzdev.tema13.Ej7;

public class Ej7 {
    
    private int[] array = new int[10000];


    public Ej7(){
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10000);
        }

        
    }
}
