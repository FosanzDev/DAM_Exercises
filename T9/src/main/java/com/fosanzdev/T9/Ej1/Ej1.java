package com.fosanzdev.T9.Ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {

    public Ej1(){
        Scanner lector = new Scanner(System.in);
        int numero = 1;

        while (numero >= 0){
            System.out.println("Introduce un número: ");
            try{
                numero = lector.nextInt();
            } catch (InputMismatchException ime){
                System.out.println("No has introducido un número");
            } finally {
                lector.nextLine();
            }
        }

    }
}
