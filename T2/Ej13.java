import java.util.Scanner;

public class Ej13{
    public static void main(String[] args) {
        //Variable definition
        Scanner lector = new Scanner(System.in);
        int current, seconds, minutes, hours;

        //getting input
        System.out.print("Introduzca un numero de segundos: ");
        current = lector.nextInt(); lector.nextLine();
        
        //calculating seconds
        seconds = current%60;	
        current /= 60;		//Seconds / 60 --> Cociente = Minutos // Resto = Segundos

        //calculating minutes
        minutes = current%60;
        current /= 60;		//minutes / 60 --> Cociente = Horas // Resto = Minutos

        //calculating hours
        hours = current%24;
        current /= 24;		//hours / 60 --> Cociente = Dias // Resto = Horas

        //number of days is "current" var after all operations
        System.out.printf("Eso son %d dias, %d horas, %d minutos y %d segundos",
                                        current, hours, minutes, seconds);

        lector.close();
    }
}