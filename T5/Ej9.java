import java.util.Scanner;

public class Ej9 {

    /**
     * Calcula el sumatorio desde 0 hasta n
     * 
     * @param n El número de sumas a realizar
     * @return  El sumatorio desde 0 hasta n
     */
    public static int sumatorio(int n){
        int foo = n;
        for(int i=1; i<n; i++){
            foo += i;
        }

        return foo;
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int x = lector.nextInt(); lector.nextLine();


        System.out.printf("Resultado del sumatorio: %d", sumatorio(x));
        lector.close();
    }
}