import t6lib.Utils;
import java.util.Scanner;

public class Ej5 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = lector.nextLine();
        String fraseLarga = Utils.getMaxLength(Utils.separateWords(frase));
        System.out.println("La palabra mas larga es: " + fraseLarga);
        System.out.println("Y su longitud es: " + fraseLarga.length());
    
        lector.close();
    }
}
