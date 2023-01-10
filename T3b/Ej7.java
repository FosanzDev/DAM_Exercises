import java.util.Scanner;
import java.lang.Math;

public class Ej7 {
    public static void main(String[] args) {
        
        //Variable definition
        Scanner lector = new Scanner(System.in);
        double a, b, res, orig;

        //Getting data
        System.out.print("Introduzca dos numeros: ");
        a = lector.nextDouble();
        
res = a;
        orig = a;
        b = lector.nextDouble();
        lector.nextLine();

        //Processing data

        if (b < 0){
            a = 1/a;
            res = 1/res;
        }
        for (int i = 1; i < Math.abs(b); i++){
            a *= res;
        }

        //Printing result
        System.out.printf("%.3f ^ %.3f es %.3f", orig, b, a);

        //Scanner closure
        lector.close();
    }
}