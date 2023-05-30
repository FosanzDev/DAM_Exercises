package com.fosanzdev.tema13.Ej8;

import java.util.ArrayList;

public class Ej8 {
    
    private static final int AVAILABLE_THREADS = Runtime.getRuntime().availableProcessors();
    protected static final ArrayList<Integer> numerosPrimos = new ArrayList<>();

    public static synchronized void addNumeroPrimo(int numero) {
        numerosPrimos.add(numero);
    }

    private int Threads = AVAILABLE_THREADS;
    private ArrayList<Thread> threads = new ArrayList<>();


    public Ej8(int... numeros){
        if (numeros.length < AVAILABLE_THREADS) {
            Threads = numeros.length;
        }

        int[] startingPoints = new int[Threads];
        for (int i = 0; i < Threads; i++) {
            startingPoints[i] = i * (numeros.length/Threads);
        }

        //Declaring the array
        int[][] numerosDivididos = new int[Threads][numeros.length/Threads];

        //Dividing the array
        for (int i = 0; i < Threads; i++) {
            if (i == Threads - 1) {
                numerosDivididos[i] = new int[numeros.length - startingPoints[i]];
            } else {
                numerosDivididos[i] = new int[startingPoints[i+1] - startingPoints[i]];
            }
            System.arraycopy(numeros, startingPoints[i], numerosDivididos[i], 0, numerosDivididos[i].length);
        }


        for (int i = 0; i < Threads; i++) {
            Thread t = new Ej8Thread(numerosDivididos[i]);
            threads.add(t);
            t.start();
        }

        for(Thread t : threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        
    }


    public static int[] combineArrays(int[] a, int[] b){
        int[] output = new int[a.length + b.length];
        System.arraycopy(a, 0, output, 0, a.length);
        System.arraycopy(b, 0, output, a.length, b.length);
        return output;
    }
}
