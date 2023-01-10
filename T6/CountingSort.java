import java.util.Arrays;

import t6lib.Utils;

public class CountingSort {
    
    public static void countSort(int[] array, int min, int max){
        int[] cuenta = new int[max+1];
        int contador = 0;

        Arrays.fill(cuenta, 0);
        for(int i=0; i<array.length; i++){
            cuenta[array[i]]++;
        }

        for(int i=0; i<cuenta.length; i++){
            for(int j = 0; j < cuenta[i]; j++){
                array[contador] = i;
                contador++;
            }
        }
    }


    public static void main(String[] args) {

        int[] prueba = Utils.genIntArray(1000000000, 1000000);

        System.out.println("Sorting");
        long tiempoInicio = System.nanoTime();
        countSort(prueba, 0, 1000000);

        long tiempoFin = System.nanoTime();

        double tiempoTransurrido = (float)(tiempoFin - tiempoInicio) / 1_000_000_000;

        System.out.printf("Sorted in %.8f seconds\n", tiempoTransurrido);

    }
}
