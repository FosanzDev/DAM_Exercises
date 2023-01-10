import java.util.Scanner;

public class Ej12{
    public static void main(String[] args) {
        
        //Variable definition
        Scanner lector = new Scanner(System.in);
        float dividendo, divisor;

        //Getting dividendo and divisor
        System.out.print("Indtroduzca dividendo: ");
        dividendo = lector.nextFloat(); lector.nextLine();
        
        System.out.print("Indtroduce divisor: ");
        divisor = lector.nextFloat(); lector.nextLine();

        //Result printing and scanner closing
        System.out.println("El resultado es: " + (dividendo/divisor));
        lector.close();
    }
}