import t6lib.Utils;

public class Ej24 {
    public static void main(String[] args) {
        //Generating integer array
        int[] v = Utils.genIntArray(50, 100);
        int[] p = new int[v.length];

        int sum = 0;

        //Iterating v array and adding to the sum the values
        for (int i=0; i<v.length; i++){
            sum += v[i];
            p[i] = sum;
        }

        //Printing results
        for(int i:v){
            System.out.print(i + " ");
            
        }

        System.out.println();

        for(int i:p){
            System.out.print(i + " ");
        }
    }
}
