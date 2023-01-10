import java.util.Scanner;

public class Ej15 {

    /**
     * Compara dos strings y devuelve la mas larga o corta dependiendo de la opcion
     * @param a palabra 1
     * @param b palabra 2
     * @param option "short" o "long"
     * @return
     */
    public static String compareString(String a, String b, String option){

        String res="";

        if (option == "short"){
            if (a.length() > b.length()) res = b;
            else res = a;
        }

        else if (option == "long"){
            if (a.length() > b.length()) res = a;
            else res = b;
        }

        return res;
    }

    /**
     * Compara tres strings y devuelve la mas larga o corta dependiendo de la opcion 
     * @param a palabra 1
     * @param b palabra 2
     * @param c palabra 3
     * @param option "short" o "long "
     * @return
     */
    public static String compareString(String a, String b, String c, String option){
        String res = "";

        if (option == "short"){
            res = compareString(a, compareString(b, c, "short"), "short");
        }

        else if (option == "long"){
            res = compareString(a, compareString(b, c, "long"), "long");
        }

        return res;
    }

    /**
     * Funcion que devuelve el numero de vocales de un string
     * @param a Palabra a analizar
     * @return un entero con el numero de vocales
     */
    public static int nvocales(String a){
        int res = 0;

        //Making all lowercase and non-accentuated(?)
        a = a.toLowerCase();
        a = a.replace("á", "a");
        a = a.replace("é", "e");
        a = a.replace("í", "i");
        a = a.replace("ó", "o");
        a = a. replace("ú", "u");

        //For all chars in string, check if it is a vowel
        for(int i=0; i<a.length(); i++){
            char letter = a.charAt(i);
            if (letter == 'a' ||
                letter == 'e' ||
                letter == 'i' ||
                letter == 'o' ||
                letter == 'u') res += 1;
        }

        //Returns number of vowels
        return res;
    }

    /**
     * Prints the main menu
     */
    public static void printMenu(){
        System.out.println("""
        
        MENU PRINCIPAL
        ==============
        1. Palabra más larga.
        2. Palabra más corta.
        3. Número de vocales.
        --------------------------------
        0. Salir
        """);
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean continues = true;

        //do while that keeps executing until '0' is read
        do {
            //Prints the menu and reads preference
            printMenu();
            System.out.print("Introduzca preferencia: ");
            int opcion = lector.nextInt();
            lector.nextLine();

            //Option 1 --> Returns most long string
            if (opcion == 1){
                System.out.print("Introduzca 3 palabras: ");
                String a = lector.next();
                String b = lector.next();
                String c = lector.next();
                lector.nextLine();

                String res = compareString(a, b, c, "long");
                System.out.println(res);
            }

            //Opction 2 --> Returns less long string
            else if (opcion == 2){
                System.out.println("Introduzca 3 palabras: ");
                String a = lector.next();
                String b = lector.next();
                String c = lector.next();
                lector.nextLine();

                String res = compareString(a, b, c, "short");
                System.out.println(res);
            }

            //Opction 3 --> Returns number of vowels in a word
            else if (opcion == 3){
                System.out.println("Introduzca una palabra: ");
                String a = lector.nextLine();

                int res = nvocales(a);
                System.out.println("Numero de vocales: " + res);
            }

            //If option == 0, do-while condition is false
            else if (opcion == 0)
                continues = false;
            
            //In case of no valid option
            else System.out.println("No valido");

            
        } while (continues);

        //Scanner closure
        lector.close();
    }
}