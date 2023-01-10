import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        
        //Variable definition
        Scanner lector = new Scanner(System.in);
        DecimalFormat decimalF = new DecimalFormat("#.000");
        
        //Primera parada
        System.out.println("Primera parada:");
        System.out.print("  -¿A cuánto estaba el combustible?: ");
        double precio1 = lector.nextDouble(); lector.nextLine();
        System.out.print("  -¿Cuánto pagó por rellenar?: ");
        double pago1 = lector.nextDouble(); lector.nextLine();
        System.out.print("  -¿Cuánto marcaba el cuentakilómetros?: ");
        int cuentakm1 = lector.nextInt(); lector.nextLine();

        //Segunda parada
        System.out.println("\nSegunda parada: ");
        System.out.print("  -¿A cuánto estaba el combustible?: ");
        lector.nextInt();lector.nextLine();
        System.out.print("  -¿Cuánto pagó por rellenar?: ");
        double pago2 = lector.nextDouble(); lector.nextLine();

        //Tercera parada
        System.out.println("\nTercera parada: ");
        System.out.print("  -¿Cuánto marcaba el cuentakilómetros?: ");
        int cuentakm2 = lector.nextInt(); lector.nextLine();

        //Data processing
        double litros1 = pago1/precio1;
        int distancia = cuentakm2 - cuentakm1;

        double consumo = (litros1 * 2 / distancia) * 100;
        double coste = (pago1+pago2) / distancia;

        //Printing and scanner closing
        System.out.println("\nConsumo medio: " + decimalF.format(consumo) + " L/100km");
        System.out.println("Precio por km: " + decimalF.format(coste) + " euros/km");
        lector.close();
    }   
}
