import java.util.Scanner;

public class Ej1{
    public static void main(String[] args) {
        //Variable definition
        Scanner lector = new Scanner(System.in);
        int num;

        //Getting data
        System.out.println("Introduce un numero:");
        num = lector.nextInt(); lector.nextLine();

        //Printing and scanner closing
        if (num%2 == 0) System.out.println("Es par");
        else System.out.println("Es impar");
        lector.close();
    }
}