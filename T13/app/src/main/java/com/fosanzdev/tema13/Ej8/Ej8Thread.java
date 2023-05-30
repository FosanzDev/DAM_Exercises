package com.fosanzdev.tema13.Ej8;

import static com.fosanzdev.tema13.Ej8.Ej8.addNumeroPrimo;

public class Ej8Thread extends Thread{

    private int[] numeros;

    public Ej8Thread(int[] numeros){
        this.numeros = numeros;
    }

    @Override
    public void run() {
        for (int i = 0; i < numeros.length; i++) {
            int n = numeros[i];
            if (isPrime(n)) {
                //System.out.println("Thread " + Thread.currentThread().getName() + " found prime number: " + n);
                addNumeroPrimo(n);
            }
        }
    }

    public boolean isPrime(int n){
        if (n <= 1 || n % 2 == 0 && n != 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
