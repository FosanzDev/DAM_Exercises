package com.fosanzdev.T9.Ej8;

public class Ej8 {
    public Ej8() {
        // ArithmeticException
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        // NullPointerException
        try {
            String cadena = null;
            cadena.charAt(0);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        // IndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
    }
}
