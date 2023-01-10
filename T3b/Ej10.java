import java.util.Scanner;

public class Ej10{
    public static void main(String[] args){
        //Variable definition
        Scanner lector = new Scanner(System.in);
        int sum = 0, n;

        //Getting data, infinite loop
        do {
            System.out.print("Introduzca un numero (0 para terminar): ");
            n = lector.nextInt();
            sum += n;
        } while (n != 0);

        //Printing
        System.out.println("Resultado: " + sum);

        //Scanner closure
        lector.close();
    }
}