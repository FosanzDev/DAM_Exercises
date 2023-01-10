import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        //Variable definition
        Scanner lector = new Scanner(System.in);
        int n1, n2, sum = 0;

        System.out.print("Introduce dos numeros: ");
        n1 = lector.nextInt();
        n2 = lector.nextInt();
        lector.nextLine();

        //n2 is number of times that sum+n1 occurs
        for(int i=0; i<n2; i++){
            sum += n1;
        }

        System.out.println("Resultado del producto: " + sum);

        //Closing scanner
        lector.close();
    }
}
