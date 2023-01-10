public class Ej4 {

    //main max method // Compares 2 numbers and returns the maximum
    public static double max(double a, double b){
        if (a>b)
            return a;
        
        else
            return b;
    }

    //max method overload with 4 args, self-iterable
    public static double max(double a, double b, double c, double d){
        return max(max(a,b), max(c,d));
    }

    public static void main(String[] args) {
        System.out.println(max(2, 4, 5, 2));
    }
}
