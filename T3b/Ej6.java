import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        //Variable definition
        Scanner lector = new Scanner(System.in);
        int tabla;
        boolean valido;

        //Getting data. While true loop will break once "tabla" is between limits

        do{
            System.out.print("Introduzca número de tabla a buscar [1-10]");
            tabla = lector.nextInt(); lector.nextLine();

            valido = tabla <= 0 || tabla > 10;
            if (valido) System.out.println("Número no valido");

        }while (valido);
        

        //Breaking the loop leads to this part of the code
        for (int i = 1; i <= 10; i++){
            int result = tabla * i;
            System.out.printf("%d x %d = %d\n", tabla, i, result);
        }
            
        //Scanner closure
        lector.close();
    }
}
