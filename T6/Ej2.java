public class Ej2 {

    //Private string containing all vowels
    private static String vowels = "AEIOUÁÀÂÄÉÈËÊÍÒÔÖÚÙÜÛ";

    /**
     * Receives an string and prints the number of vowels and consonants
     * @param s String to be analized
     */
    public static void count(String s){
        //Variable definition
        s = s.toUpperCase();
        int counter = 0;

        //Count the vowels
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (vowels.indexOf(c) != -1)
                counter++;
        }

        //Number of consonants = string length without spaces- number of vowels
        System.out.print("Hay " + counter + " vocales");
        System.out.println(" y " + (s.replaceAll("\\s+", "").length()-counter) + " consonantes");
    }

    public static void main(String[] args) {
        
        count("Hola mundo");
        
    }
}
