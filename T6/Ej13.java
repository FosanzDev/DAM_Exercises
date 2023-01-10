import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int media = 0;

        //Getting numbers
        System.out.println("Introduzca 10 numeros: ");
        String[] snums = lector.nextLine().split("\\s");

        // Adding numbers to num array and adding it to the average var
        int[] nums = new int[10];
        for(int i=0; i<snums.length; i++){
            int n = Integer.parseInt(snums[i]);
            nums[i] = n;
            media += n;
        }

        //Number and average printing
        for(int i : nums) System.out.print(i + " ");
        System.out.println("\nMedia aproximada = " + media/10);

        //Scanner closure
        lector.close();
    }
}
