import java.util.Scanner;
import t6lib.Utils;

public class Ej8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        
        String[] palabras = Utils.separateWords(lector.nextLine());

        for(String palabra : palabras){
            System.out.printf("%s -- %d palabras\n", palabra, palabra.length());
        }
        lector.close();
    }   
}