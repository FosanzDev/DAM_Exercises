import java.util.Scanner;

public class Ej26 {

    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {


        // Se crea una matriz de 4x8 con valores enteros aleatorios entre 0 y 100
        int[][] matrix = new int[4][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }

        // Se imprime la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Se imprime la matriz traspuesta por columnas
        System.out.println("Matriz traspuesta por columnas:");
        traspuesta(matrix);

        System.out.println();

        // Se imprime la inversa de la matriz
        System.out.println("Matriz inversa:");
        inversa(matrix);

        System.out.println();

        // Se imprime la matriz por filas con la suma total de cada fila
        System.out.println("Matriz por filas con suma total:");
        suma(matrix);

        System.out.println();

        // Se imprime el valor minimo y el maximo de la matriz
        int min = matrix[0][0];
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Valor minimo: " + min);
        System.out.println("Valor maximo: " + max);

        // Se imprime la media de toda la matriz
        media(matrix);

        System.out.println();

        // Se le pide al usuario que ponga una fila y una columna y se imprime el valor
        // en dicha posicion
        System.out.print("Introduce una fila (0-3): ");
        int fila = lector.nextInt();
        lector.nextLine();
        System.out.print("Introduce una columna (0-7): ");
        int columna = lector.nextInt();
        lector.nextLine();

        System.out.println("El valor en la posicion " + fila + ", " + columna + " es: " + matrix[fila][columna]);

        System.out.println();

        // Se le pide al usuario que indique una fila y se imprime la fila indicada
        System.out.print("Introduce una fila (0-3): ");
        fila = lector.nextInt();
        lector.nextLine();

        System.out.println("La fila " + fila + " es: ");
        for (int i = 0; i < matrix[fila].length; i++) {
            System.out.print(matrix[fila][i] + " ");
        }

        System.out.println();
        System.out.println();

        // Se cambia el valor de la ultima columna por la suma de cada fila
        for (int i = 0; i < matrix.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumaFila += matrix[i][j];
            }
            matrix[i][matrix[i].length - 1] = sumaFila;
        }

        // Se imprime la matriz modificada
        System.out.println("Matriz modificada:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * Se imprime la matriz traspuesta por columnas
     */

    public static void traspuesta(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Se imprime la matriz inversa
     */

    public static void inversa(int[][] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Se imprime la matriz por filas con la suma total de cada fila
     */

    public static void suma(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int suma = 0;
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                suma += arr[i][j];
            }
            System.out.println("= " + suma);
        }
    }

    /**
     * Se imprime la media de una matriz
     */
    public static void media(int[][] arr){
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                suma += arr[i][j];
            }
        }
        System.out.println("Media: " + (double) suma / (arr.length * arr[0].length));
    }

}
