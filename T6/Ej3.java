public class Ej3 {

    /**
     * Returns the number of words in a sentence
     * @param s String to be analized
     * @return Integer with occurrences
     */
    public static int countWords(String s){
        //Example using arrays
        //String[] words = s.trim(). split("\\s+");
        //return words.length;

        //Using alternative method: counting whitespaces
        s = s.trim().replaceAll("\\s+", " ");
        if(s.equals("")) return 0;
        
        int count = 1;

        for(int i=0; i<s.length(); i++){
            if( s.charAt(i) == ' ') count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Hola mundo"));
    }
}
