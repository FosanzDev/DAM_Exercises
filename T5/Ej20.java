import java.util.Scanner;

public class Ej20 {

    /**
     * Generates the lucky number of the given date
     * @param date Validated date format
     * @return an integer with the lucky number
     */
    public static int genLucky(String date){
        int sum = 0;

        //While the String has more than 1 number
        while (date.length() > 1){
            //Go through all chars on date (String)
            for(int i=0; i<date.length(); i++){
                char c = date.charAt(i);
                //Ignore - and /
                if (c == '-' || c == '/')
                    continue;
                
                //sum its numeric value (Casting)
                sum += Character.getNumericValue(c);
            }
            //Create a new String with the result and reset the sum value
            date = Integer.toString(sum);
            sum = 0;
        }

        //When theres only one char on the String, return its numeric value
        return Integer.parseInt(date);
    }

    /**
     * Valida si una fecha sigue el formato dd mm aaaa con los separadores / o -
     * @param date String con la fecha a comprobar
     * @return true o false, dependiendo si es valida o no
     */
    public static boolean fechaValid(String date){
        //Checks if it matches with the regex
        return date.matches("([1-9]|0[1-9]|1\\d|2\\d|3[0-1])(-|/)([1-9]|0[1-9]|1[0-2])(-|/)\\d{1,4}");
    }

    public static void main(String[] args) {
        //Initializing variables
        Scanner lector = new Scanner(System.in);
        boolean valid = true;
        int lucky = 0;

        //Repeats the loop until the date given is valid
        do {
            System.out.print("Introduzca su fecha de nacimiento (dd-mm-aaaa): ");
            String date = lector.nextLine();
        
            //Generate the lucky number if the format matches
            if (fechaValid(date)){
                valid = true;
                lucky = genLucky(date);
            }
            //In other case, repeat the loop
            else{
                valid = false;
                System.out.println("Not valid");
            }

        } while (!valid);

        //Print the lucky number
        System.out.println("Tu lucky number: " + lucky);

        //Scannner closure
        lector.close();        
    }
}
