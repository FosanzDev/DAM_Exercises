import t6lib.Utils;

public class Ej4 {
    public static void main(String[] args) {
        String[] words = Utils.separateWords("Hola mundo como estamos");

        for(String a : words){
            System.out.println("La palabra \"" + a + "\" tiene: ");
            Utils.count(a);
            System.out.println();
        }
    }   
}