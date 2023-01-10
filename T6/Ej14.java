import java.util.Scanner;
import t6lib.Utils;

public class Ej14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca 10 letras: ");
        String s = lector.nextLine();
        
        char[] cArray = Utils.charDivider(s, 10);

        System.out.println("En posicion par:");
        for(int i=1; i<10; i+=2){
            System.out.print(cArray[i] + " ");
        }

        System.out.println("\nEn posicion impar:");
        for(int i=0; i<10; i+=2){
            System.out.print(cArray[i] + " ");
        }

        lector.close();
        
    }
}