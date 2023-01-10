import java.util.Scanner;

public class Ej15{
    public static void main(String[] args) {
        
        //Variable definition
        Scanner lector = new Scanner(System.in);
        double celsius;

        //Celsius read
        System.out.print("Introduce en Celsius: ");
        celsius = lector.nextFloat(); lector.nextLine();

        //Calculus and printing
        System.out.println("En kelvin: " + (273.15+celsius) + " ºK");
        System.out.println("En Fahrenheit: " + ( (celsius * 9/5f) + 32) + " ºF");

        //scanner closing
        lector.close();
    }
}