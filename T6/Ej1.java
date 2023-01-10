public class Ej1{

    public static String cap(String s){

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetter(c)){
                return s.substring(0, i) + s.substring(i).replaceFirst("[a-zA-z]", Character.toString(s.toUpperCase().charAt(i)));
            }
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(cap("231 hola mundo"));
    }
}