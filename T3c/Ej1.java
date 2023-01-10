import java.util.Scanner;

public class Ej1{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        double d = lector.nextDouble();
        lector.nextLine();

        System.out.printf("%.2f\n",d);

        lector.close();
    }
}