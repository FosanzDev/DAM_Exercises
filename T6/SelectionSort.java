import t6lib.Utils;

public class SelectionSort {
    
    public static void selectionSort(int[] arr){
        int min;

        for(int i=0; i<arr.length; i++){
            min = arr[i];

            if(i % 1000 == 0)
                System.out.println("On index " + i);

            for(int j=i+1; j<arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                } 
            }
        }
    }


    public static void main(String[] args) {
        int[] prueba = Utils.genIntArray(1000000, 10);

        System.out.println("Built");

        long tiempoInicio = System.nanoTime();
        selectionSort(prueba);

        long tiempoFin = System.nanoTime();

        double tiempoTransurrido = (float)(tiempoFin - tiempoInicio) / 1_000_000_000;

        System.out.printf("Sorted in %.8f seconds\n", tiempoTransurrido);

        System.out.println("Sorted");

        // for(int i:prueba){
        //     System.out.print(i + " ");
        // }
    }
}
