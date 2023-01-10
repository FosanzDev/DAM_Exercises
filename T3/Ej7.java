import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        //Variable definition
        Scanner lector = new Scanner(System.in);
        final int cuotaBase = 500;
        int edad, discount;
        char socio;

        System.out.print("¿Cuántos años tienes?: ");
        edad = lector.nextInt(); lector.nextLine();

        if (edad > 65) System.out.println("Tendrá que pagar: " + cuotaBase/2);
        else{
            System.out.print("¿Son sus padres socios?(s/n) ");
            socio = lector.next().charAt( 0);

            if (socio == 's') discount = 35;
            else discount = 25;

            int finalPrice = cuotaBase - (cuotaBase*discount)/100;
            System.out.println("Tendrá que pagar: " + finalPrice);

            lector.close();
        }
    }
}