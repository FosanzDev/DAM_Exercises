package com.fosanzdev.T9.Ej9;

public class Ej9 {

    public Ej9(){
        // ArithmeticException
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            try {
                throw new PersonalisedArithmeticException("ArithmeticException");
            } catch (PersonalisedArithmeticException e1) {
                e1.printStackTrace();
            }
        }

        // NullPointerException
        try {
            String cadena = null;
            cadena.charAt(0);
        } catch (NullPointerException e) {
            try {
                throw new PersonalisedNullPointerException("NullPointerException");
            } catch (PersonalisedNullPointerException e1) {
                e1.printStackTrace();
            }
        }

        // IndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[3]);
        } catch (IndexOutOfBoundsException e) {
            try{
                throw new PersonalisedIOOBE("IndexOutOfBoundsException");
            } catch (PersonalisedIOOBE e1) {
                e1.printStackTrace();
            }
        }
    }
}
