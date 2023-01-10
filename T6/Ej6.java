import java.util.Scanner;
import t6lib.Utils;

public class Ej6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        String palabra = lector.nextLine();
        System.out.println("Introduzca un multiplicador: ");
        int mult = lector.nextInt();

        System.out.println("Resultado = " + Utils.multiplyString(palabra, mult));
        lector.close();
    }
}
