import java.util.Scanner;

public class Ej11{
    public static void main(String[] args) {
        
        //Variable definition
        Scanner lector = new Scanner(System.in);
        int min, sus;

        //Getting min and sus
        System.out.print("Indtroduzca minuendo: ");
        min = lector.nextInt(); lector.nextLine();
        
        System.out.print("Indtroduce sustraendo: ");
        sus = lector.nextInt(); lector.nextLine();

        //Result printing and scanner closing
        System.out.println("El resultado es: " + (min-sus));
        lector.close();
    }
}