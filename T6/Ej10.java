import java.util.Scanner;
import t6lib.Utils;

public class Ej10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca una frase o palabra: ");
        String frase = lector.nextLine();

        System.out.println(Utils.isPalindrome(frase));

        lector.close();
    }
}