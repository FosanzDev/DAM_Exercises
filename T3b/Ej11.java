import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        //Variable definition
        Scanner lector = new Scanner(System.in);
        int n = 0, sum = 0, times = 0;

        //Printing info
        System.out.println("Introduzca numeros positivos para calcular su media");
        System.out.println("Introduzca números negativos para imprimir el resultado");

        //Getting data with indetermined number of inputs
        while (n >= 0){
            System.out.println("Introduzca número: ");
            n = lector.nextInt();
            if (n<0) break;
            else sum += n;
            times++;
        }

        //Printing results
        float media = (float)sum/times;
        System.out.println("La media es: " + media);

        //Scanner closure
        lector.close();
    }
}