import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        
        //Variable definition
        Scanner lector = new Scanner(System.in);
        long num;
        boolean isPrime = true;

        //Getting data
        System.out.print("Numero a comprobar: ");
        num = lector.nextLong(); lector.nextLine();

        //Processing data
        for (int i = 2; i < num / 2; i++){
            if (num % i == 0){
                System.out.println(num + " no es un numero primo");
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println(num + " es un numero primo");

        //Lector closure
        lector.close();
    }
} 