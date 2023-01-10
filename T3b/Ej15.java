import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int h, m, s;
        boolean is_valid = true;

        do {
            System.out.printf("Introduzca horas: ");
            h = lector.nextInt();

            if (h<0 || h>23){
                is_valid = false;
                System.out.println("El formato de hora no es correcto, intentelo de nuevo");
            }
            else is_valid = true;
        } while (!is_valid);

        do {
            System.out.printf("Introduzca minutos: ");
            m = lector.nextInt();

            if (m<0 || m>59){
                is_valid = false;
                System.out.println("El formato de minutos no es correcto, intentelo de nuevo");
            }
            else is_valid = true;
        } while (!is_valid);

        do {
            System.out.printf("Introduzca segundos: ");
            s = lector.nextInt();

            if (s<0 || s>59){
                is_valid = false;
                System.out.println("El formato de segundos no es correcto, intentelo de nuevo");
            }
            else is_valid = true;
        } while (!is_valid);

        if(is_valid) System.out.printf("Hora introducida: %02d:%02d:%02d", h, m, s);
        
        lector.close();
    }
}