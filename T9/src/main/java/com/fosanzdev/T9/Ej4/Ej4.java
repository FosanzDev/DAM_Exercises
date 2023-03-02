package com.fosanzdev.T9.Ej4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4 {

    // Static scanner to avoid creating a new one every time we need to read a number
    private static final Scanner lector = new Scanner(System.in);

    // Constructor
    public Ej4() {

        //Trying with an array of 5 elements
        int[] arr = new int[5];
        checkArray(arr);

        //Trying with a null array
        int[] arr2 = null;
        checkArray(arr2);

    }


    /**
     * Reads numbers from the user and stores them in the array
     * If the user doesn't introduce a number, it will throw and manage an InputMismatchException
     * If the user introduces more numbers than the array can store, it will throw and manage an ArrayIndexOutOfBoundsException
     * If the array is null, it will exit from the method
     * @param arr Array to store the numbers
     */
    public void checkArray(int[] arr){
        // If the array is null, we exit from the method
        if (arr == null){
            System.out.println("El array no está inicializado");
            return;
        }

        // If the array is not null, we start reading numbers
        int i=0;

        while (true){
            // We try to read a number and store it in the array
            try{
                arr[i] = readInt("Introduce un número");
                i++;

            // Catching if the user doesn't introduce a number
            } catch (InputMismatchException ime){
                System.out.println("No has introducido un número entero");
                lector.nextLine();
            //Catching if the array is full
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Has introducido demasiados números");
                System.out.println("Saliendo del bucle");
                break;
            }
        }
    }

    /**
     * Reads an integer from the user
     * @param msg Message to show to the user
     * @return The number introduced by the user
     * @throws InputMismatchException If the user doesn't introduce a number
     */
    public int readInt(String msg) throws InputMismatchException {
        System.out.println(msg);
        return lector.nextInt();
    }
}
