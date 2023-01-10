import t6lib.Utils;

public class BackDragSort{

    public static void dragSort(int[] arr){

        boolean mod;
        int idx=-1;

        do {
            mod = false;
            int idj = -1;

            for(int i=arr.length-2; i>=0; i--){
                if (arr[i] > arr[i+1] && i>idx){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    idj = i;
                    mod = true;
                }
            }

            idx = idj;

            if(idx % 1000 == 0)
                System.out.println("On index" + idx);

        } while(mod);
    }


    public static void main(String[] args) {
        int[] prueba = Utils.genIntArray(1000000, 10);
        System.out.println("Built");

        long tiempoInicio = System.nanoTime();
        dragSort(prueba);

        long tiempoFin = System.nanoTime();

        double tiempoTransurrido = (float)(tiempoFin - tiempoInicio) / 1_000_000_000;

        System.out.printf("Sorted in %.8f seconds\n", tiempoTransurrido);

        // for(int i : prueba){
        //     System.out.print(i + " ");
        // }

    }

}