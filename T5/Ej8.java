public class Ej8 {

    //If a,b is the same as d,c --> it's a capicua number
    public static boolean isCapicua(int a, int b, int c, int d){
        if (a==d && b==c)
            return true;
        
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isCapicua(2, 3, 3, 2));
    }
}
