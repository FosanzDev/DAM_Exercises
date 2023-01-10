import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //Variable definition
        Scanner lector = new Scanner(System.in);
        int num1, num2;

        //Getting data
        System.out.println("Introduzca 2 numeros");
        num1 = lector.nextInt(); num2 = lector.nextInt(); lector.nextLine();

        //Data processing

        if (num1 > num2) System.out.printf("%d es mayor que %d", num1, num2);
        
        if (num1 == num2) System.out.printf("%d es igual que %d", num1, num2);

        if (num1 < num2) System.out.printf("%d es menor que %d", num1, num2);

        //Scanner closing
        lector.close();
    }
}
