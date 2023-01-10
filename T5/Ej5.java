public class Ej5 {

    //Prints n-times a char
    public static void charMultiply(char chr, int times){
        
        for (int i=0; i<times; i++)
            System.out.println(chr);
    }

    public static void main(String[] args) {
        charMultiply('s', 5);
    }
}
