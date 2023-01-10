import java.util.Random;
import java.util.Scanner;

public class Ej12{
    public static void main(String[] args) {
        //Variable definition
        boolean partida;
        int n, intentos, rand_n;
        final int MAXIMO = 100;
        Scanner lector = new Scanner(System.in);

        do {
            Random rand = new Random();
            rand_n = rand.nextInt(MAXIMO+1);            //Generating random number between 0 and maximo
            boolean acierto = false;
        
            //Getting data
            System.out.print("Introduzca el número de intentos: ");
            intentos = lector.nextInt();
            System.out.println("¡El juego ha comenzado!");

            //Loop with range "intentos"
            //for(int i = intentos; i>0; i--){
            //    System.out.print(">>");
            //    n = lector.nextInt(); lector.nextLine();
            //    if(n == rand_n){
            //        acierto = true;         //Correct number --> Break the loop, change "acierto" to true state
            //        break;
            //    }
            //
            //    else if (n > rand_n) System.out.println("El número que buscas es menor");   //n > random number case
            //    else if (n < rand_n) System.out.println("El numero que buscas es mayor");   //n < random number case
            //    //System.out.println("Intentos restantes: " + i);
            //}

            do {
                System.out.print(">>");
                n = lector.nextInt(); lector.nextLine();

                if(n == rand_n) acierto = true;
                else if (n > rand_n) System.out.println("El número que buscas es menor");   //n > random number case
                else if (n < rand_n) System.out.println("El numero que buscas es mayor");   //n < random number case
                intentos--;

            } while (intentos > 0 && !acierto);

            //Response based on "acierto"
            if(acierto) System.out.println("Has acertado!");
            else System.out.println("Se te han acabado los intentos!");

            //Asking if the player wants  to play again
            System.out.println("¿Quiere jugar otra partida? (s/n): ");
            char res = lector.next().charAt(0);
            if (res == 's') partida = true;
            else partida = false;

        } while (partida);

        //Scanner closure
        lector.close();
    }
}