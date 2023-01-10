import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca su nombre completo");
        String[] nom = lector.nextLine().split("\\s+");

        //String nombre = nom[0]; ??
        //String primApe = nom[1];
        //String segApe = nom[2];


        // Lower, upper and lenght
        for(String s : nom) 
            System.out.printf("%s %s %d\n", s.toLowerCase(), s.toUpperCase(), s.length());        

        // 5 First chars
        for(String s : nom){
            if(s.length() >= 5){
                for (int i=0; i<5; i++) System.out.print(s.charAt(i));
                System.out.println();
            }
        }    

        System.out.println();

        // 2 Last chars
        for(String s : nom){
            if(s.length() >= 2){
                for (int i=s.length()-2; i<s.length(); i++) System.out.print(s.charAt(i));
                System.out.println();
            }
        }
              
        
        System.out.println();

        // Number of occurrences of last char per word
        for(String s : nom){
            int c = 0;
            for(int i=0; i<s.length()-1; i++) if(s.charAt(i) == s.charAt(s.length()-1)) c++;
            System.out.printf(c + " occurrences of %s in %s\n", s.charAt(s.length()-1), s);
        }

        // Capitalize words
        for(String s: nom) System.out.print(s.substring(0, 1).toUpperCase() + s.substring(1) + " ");
        System.out.println();

        // *** full name ***
        System.out.print("*** ");
        for(String s : nom) System.out.print(s + " ");
        System.out.println("***");

        // Reversed words
        StringBuilder sb = new StringBuilder();
        for(String s:nom) sb.append(s).append(" ");
        System.out.println(sb.reverse().toString());

        lector.close();
    }
}