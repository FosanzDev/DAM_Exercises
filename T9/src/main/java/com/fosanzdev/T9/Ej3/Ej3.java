package com.fosanzdev.T9.Ej3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {

    //Static scanner to avoid creating a new one every time
    private Scanner lector = new Scanner(System.in);

    public Ej3() {
        //Variable declaration
        //Creating ArrayList due to the fact that we don't know how many numbers will be introduced
        ArrayList<Integer> numbers = new ArrayList<>();

        //While loop to keep asking for numbers until an invalid one is introduced
        while (true) {
            try{
                //Try to add the number to the ArrayList
                numbers.add(readInt("Introduce un numero: "));

            // If the number is invalid, break the loop
            } catch (InputMismatchException e) {
                System.out.println("Numero invalido introducido");
                System.out.println("Rompiendo bucle");
                break;

            // If there is an unknown error, break the program
            } catch (Exception e) {
                System.out.println("Error desconocido");
                System.out.println("Rompiendo programa");
                System.exit(0);
            }
        }

        //If there are numbers in the ArrayList, find the biggest one
        if (numbers.size() > 0) {
            int max = numbers.get(0);
            for (int i : numbers){
                if (i > max)
                    max = i;
            }

            System.out.println("El numero mas grande es: " + max);

        // If there are no numbers, print a message
        } else {
            System.out.println("No se han introducido numeros");
        }
    }

    /**
     * Method to read an integer from the console
     * @param message Personalized message to show to the user
     * @return The integer read from the console
     * @throws InputMismatchException If the input is not an integer
     */
    public int readInt(String message) throws InputMismatchException{
        System.out.println(message);
        return lector.nextInt();
    }
}
