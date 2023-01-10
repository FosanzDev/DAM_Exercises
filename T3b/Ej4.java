public class Ej4 {
    public static void main(String[] args) {
        //Variable definition
        final int range = 100;
        int q = 0;

        for (int i=0; i<range; i++){
            if (i%2 != 0){
                q+=1;
                System.out.print(i + " ");
            }
        }

        System.out.println("\nEn total hay: " + q + " números impares");
    }
}
