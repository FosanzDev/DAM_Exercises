import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        
        //Variable definition
        Scanner lector = new Scanner(System.in);
        DecimalFormat decimalF = new DecimalFormat("#.00");
        double eur;
        final double libToEur = 0.88;


        System.out.println("Ahora mismo la libra está a " + libToEur + " euros");
        System.out.print("Introduzca la cantidad en euros: ");
        eur = lector.nextDouble(); lector.nextLine();

        System.out.println(eur + " son " + decimalF.format((eur*libToEur)) + " libras");
        lector.close();
    }
}