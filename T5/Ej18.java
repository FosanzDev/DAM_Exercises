//import java.util.HashMap;
import java.util.Scanner;
public class Ej18{

    //KEY-VALUE option
    /**
     * This hashmap links the integer key of the DNI 
     * operation result with its char value
    public static HashMap<Integer, Character> values = new HashMap<Integer, Character>();
    static{
        values.put(0, 'T');
        values.put(1, 'R');
        values.put(2, 'W');
        values.put(3, 'A');
        values.put(4, 'G');
        values.put(5, 'M');
        values.put(6, 'Y');
        values.put(7, 'F');
        values.put(8, 'P');
        values.put(9, 'D');
        values.put(10, 'X');
        values.put(11, 'B');
        values.put(12, 'N');
        values.put(13, 'J');
        values.put(14, 'Z');
        values.put(15, 'S');
        values.put(16, 'Q');
        values.put(17, 'V');
        values.put(18, 'H');
        values.put(19, 'L');
        values.put(20, 'C');
        values.put(21, 'K');
        values.put(22, 'E');
    }
    */

    //String option
    public static String values = "TRWAGMYFPDXBNJZSQVHLCKE";


    /**
     * Basic method to get the DNI
     * @return a String with the DNI value
     */
    public static String obtenerDNI(){
        //Initializing variables 
        Scanner lector = new Scanner(System.in);
        boolean valid = true;
        String DNI;
        do {
            //Getting data
            System.out.print("Introduzca su DNI: ");
            DNI = lector.nextLine();

            //If more than 8 numbers, DNI number is not valid
            if (DNI.length() != 8){
                valid = false;
                System.out.println("No valido, pruebe de nuevo");
            }

            //In case of DNI having 8 numbers
            else valid = true;

        } while (!valid);

        //Scanner closure and returning result
        lector.close();
        return DNI;
    }

    /**
     * Function that calculates the letter of the DNI
     * 
     * @param dniStr String with the DNI numbers
     * @return String with the number+letter
     */
    public static String calcularNIF(String dniStr){
        //DNI becomes an integer instead of String
        int dni = Integer.parseInt(dniStr);
        //Key is the result of the operation
        int key = dni%23;
        //Getting the letter that corresponds to the index of 'values' String
        char letter = values.charAt(key);
        //Returning DNI+Letter (NIF)
        return dniStr+letter;
    }

    //KEY-VALUE option
    /*public static String calcularNIF(String dniStr){
        //DNI becomes an integer instead of String
        int dni = Integer.parseInt(dniStr);
        //Key is the result of the operation
        int key = dni%23;
        //Getting the value of the key 'key' over values
        char letter = values.get(key);
        //Returning DNI+Letter (NIF)
        return dniStr+letter;

    }
    */

    public static void main(String[] args) {
        //Getting DNI and calculating NIF
        String nif = calcularNIF(obtenerDNI());
        System.out.println("Su NIF es: " + nif);
        
    }
}