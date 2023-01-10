import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Ej14{
    public static void main(String[] args) {
        
        //variable definition
        Scanner lector = new Scanner(System.in);
        int radius;
        double pi = Math.PI;

        //Setting decimal limit to 3
        DecimalFormat decimalFormat = new DecimalFormat("#.000");

        //Reading radius
        System.out.print("Introduce el radio: ");
        radius = lector.nextInt(); lector.nextLine();

        //Calculus and printing with formatting
        System.out.println("Longitud = " + decimalFormat.format((2*pi*radius)));
        System.out.println("Area = " + decimalFormat.format((pi*(radius*radius))));

        //Scanner closing
        lector.close();
    }
}