import java.util.Scanner;

public class Ej8{
    public static void main(String[] args) {
        
        //Variable definition
        int age, lifeDays;
        Scanner lector = new Scanner(System.in);    
        
        //Age in years request
        System.out.print("Introduce tu edad: "); 
        age = lector.nextInt(); lector.nextLine();

        //Calculus and system.out printing
        lifeDays = age*365;
        System.out.println("Tu edad (" + age + " años) en dias serian:");
        System.out.println(lifeDays + " dias");

        //Closing the scanner
        lector.close();
    }
}