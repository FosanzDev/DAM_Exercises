import t6lib.Utils;

public class Ej25 {

    public static void main(String[] args) {
        int[] arr = Utils.genIntArray(50, 100);
        getEvens(arr);
    }

    /**
     * Imprime los elementos pares de un array
     */
    public static void getEvens(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}