import java.util.Scanner;

public class Ej4{
    public static void main(String[] args) {
        //Variable definition
        Scanner lector = new Scanner(System.in);
        int num1, num2;

        //Getting data
        System.out.println("Introduce dos numeros:");
        num1 = lector.nextInt();
		 num2 = lector.nextInt();
		 lector.nextLine();

        //Processing data
        if (num1 > num2)
				System.out.printf("%d, %d", num2, num1);

        else if (num2 > num1)
				System.out.printf("%d, %d", num1, num2);

        else 
				System.out.println("¡Los numeros son iguales!");

        //Scanner closing
        lector.close();
    }
}