import java.util.Scanner;

public class Ej10 {
    Scanner lector = new Scanner(System.in);

    //for loop for the multiplications
    public static String genTabla(int x){
        String s = "";
        for(int i=1; i<=10; i++){
            s += String.format("%d x %d = %d\n", x, i, x*i);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean notNegative = true;
        do {
            System.out.print("Introduzca un numero: ");
            int x = lector.nextInt();
            lector.nextLine();

            //if x <= 0 >> Stop loop
            if (x <= 0) 
                notNegative = false;

            else
                System.out.println(genTabla(x));
                
        } while (notNegative);

        //Scanner closure
        lector.close();
    }    
}