import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        //Variable definition
        Scanner lector = new Scanner(System.in);
        double nota;

        //Getting data
        System.out.print("Introduzca la nota: ");
        nota = lector.nextDouble(); lector.nextLine();

        //Processing data
        if (nota >= 0 && nota < 5) System.out.println("INSUFICIENTE");
        else if (nota < 6) System.out.println("SUFICIENTE");
        else if (nota < 7) System.out.println("BIEN");
        else if (nota < 9) System.out.println("NOTABLE");
        else if (nota <= 10) System.out.println("SOBRESALIENTE");
        else System.out.println("ERROR");
        
        //Closing scanner
        lector.close();
    }
}
