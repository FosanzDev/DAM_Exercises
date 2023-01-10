public class Ej3 {

    //Returns the max value between a and b
    public static double  max(double a, double b){
        if (a>b)
            return a;
        
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println(max(3,2));
    }
}
