import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej20{
    
    /**
     * Returns wether a number is or is not in the String
     * @param s String to be analized   
     * @param n Searched number
     * @return True if the number is in the string
     */
    public static boolean nInString(String s, int n){
        //Defines new Scanner
        Scanner lector;
        for(int i=0; i<s.length(); i++){
            if (Character.isLetter(s.charAt(i)))
                continue;
            String ss = s.substring(i);
            //Create new Scanner with the substring
            lector = new Scanner(ss);
            //Try - Catch if the substring is not a number
            try {
                //New number equals the next int
                int nn = lector.nextInt();
                //If the new number equals the searched one, returns true
                if (n == nn){
                    lector.close();
                    return true;
                }
                //If not, increment i into x positions
                else
                    i += Integer.toString(nn).length();
            
            //If is not a number, continue
            } catch (InputMismatchException e) {
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(nInString("H3s", 3));
    }
}