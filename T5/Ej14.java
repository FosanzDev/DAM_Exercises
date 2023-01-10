import java.util.Scanner;

public class Ej14 {

    /**
     * Funcion para devolver el factorial de un numero
     * 
     * @param n El numero al que aplicarle el factorial
     * @return un entero con el resultado
     */
    public static int factorial(int n){
        int res = 1;
        
        for(int i=2; i<=n; i++){
            res *= i;
        }

        return res;
    }

    /**
     * Funcion para devolver el resultado de la combinatoria entre dos numeros
     * @param n un entero que tomara el valor superior (n)
     * @param m un entero que tomara el valor inferior (m)
     * @return un entero con el resultado de la operacion combinatoria n sobre m.
     *  En caso de error devuelve -1
     */
    public static int combinatoria(int n, int m){

        if(m>n || m<0 || n<0){
            System.out.println("Imposible calcular");
            return -1;
        }

        int divindendo = factorial(n);
        int divisor = factorial(m)*factorial(n-m);

        return divindendo/divisor;
    }


    public static void main(String[] args) {
        //Variable definition
        Scanner lector = new Scanner(System.in);
        int a, b;

        //Getting data
        System.out.print("Introduzca dos numeros: ");
        a = lector.nextInt();
        b = lector.nextInt();
        lector.nextLine();

        //Printing the result
        System.out.println(combinatoria(a, b));

        //Scanner closure
        lector.close();        
    }
}
