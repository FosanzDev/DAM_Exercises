import java.util.Scanner;

import t6lib.Utils;

public class Ej7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");

        String[] words = Utils.separateWords(lector.nextLine());

        for (String word : words){
            System.out.println(word);        
        }

        lector.close();
    }    
}
