import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        //Variable definition
        Scanner lector = new Scanner(System.in);
        int edad;

        //Getting data
        System.out.print("Introduzca su edad: ");
        edad = lector.nextInt(); lector.nextLine();

        //Data processing
        if (edad >= 18) System.out.println("Eres mayor de edad");
        else System.out.println("No eres mayor de edad");

        //Scanner closing
        lector.close();
    }
}
