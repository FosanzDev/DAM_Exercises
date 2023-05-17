package com.fosanzdev.T12.Ej13;

import java.io.*;
import java.util.ArrayList;

public class PrimeCalculator {

    private static ArrayList<Long> primes;
    private static ArrayList<Long> newPrimes = new ArrayList<>();
    private static ArrayList<Double> times = new ArrayList<>();

    public PrimeCalculator(){
        primes = fileLoader("C:\\Users\\fosan\\OneDrive\\Escritorio\\primes.dat");
        double deltaTime;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            for (int j = 0; j < 1000; j++){
                primes.add(calculateNextPrime(primes));
                newPrimes.add(primes.get(primes.size() - 1));

            }
            deltaTime = (System.currentTimeMillis() - startTime) / 1000.0;
            startTime = System.currentTimeMillis();
            System.out.println("Iteration: " + (i + 1) + " Time: " + deltaTime + "s");
            saveData(newPrimes);
            newPrimes.clear();
        }
    }

    private static ArrayList<Long> fileLoader(String path){
        File f = new File(path);
        if (!f.exists()){
            System.out.println("El archivo no existe, creando uno nuevo...");
            try {
                if (f.createNewFile()){
                    System.out.println("Archivo creado correctamente");
                } else {
                    System.out.println("No se ha podido crear el archivo");
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo");
            }
        } else {
            System.out.println("El archivo ya existe, cargando datos...");
        }

        try (DataInputStream fr = new DataInputStream(new FileInputStream(f))){
            ArrayList<Long> primes = new ArrayList<>();
            while (fr.available() > 0){
                primes.add(fr.readLong());
            }
            return primes;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static long calculateNextPrime(ArrayList<Long> primes){
        if (primes.size() == 0) return 2;
        long lastPrime = primes.get(primes.size() - 1);
        long nextPrime = lastPrime + 1;
        boolean isPrime = false;
        while (!isPrime){
            for (long prime : primes){
                if (prime < (nextPrime/2)+1 && nextPrime % prime == 0){
                    nextPrime++;
                    break;
                }
                if (prime == primes.get(primes.size() - 1)){
                    isPrime = true;
                }
            }
        }
        return nextPrime;
    }

    private static void saveData(ArrayList<Long> primes){
        File f = new File("C:\\Users\\fosan\\OneDrive\\Escritorio\\primes.dat");
        try (DataOutputStream fw = new DataOutputStream(new FileOutputStream(f, true))){
            for (long prime : primes){
                fw.writeLong(prime);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
