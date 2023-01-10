import java.util.Random;
import t6lib.Utils;

public class Ej21 {

    public static final int LIMIT = 50;

    /**
     * Fills a given array with random numbers from 0 to LIMIT
     * 
     * @param vector Integer array
     */
    public static void llenarArray(int[] vector) {
        Random gen = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = gen.nextInt(LIMIT + 1);
        }
    }

    /**
     * Runs over an Array
     * 
     * @param vector
     */
    public static void visualizarArray(int[] vector) {
        for (int a : vector) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void visualizarArray(int[] vector, int base) {
        for (int a : vector) {
            if (a % base == 0)
                System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void visualizarPar(int[] vector) {
        visualizarArray(vector, 2);
    }

    public static void visualizarMultiplo3(int[] vector) {
        visualizarArray(vector, 3);
    }

    public static void main(String[] args) {

        int[] vector = new int[10];

        String menu = """
                MENÚ PRINCIPAL
                ==============
                1.-Rellenar array
                2.-Visualizar contenido del array
                3.-Visualizar contenido par
                4.-Visualizar contenido multiplo de 3
                0.-Salir del menu
                """;

        boolean repeats = true;

        do {
            System.out.print(menu);
            boolean valid = false;

            do {
                int opt = Utils.leerInt("Selecciona una opción: ");

                valid = opt >= 0 && opt <= 4;

                if (!valid) {
                    System.out.println("Entrada no valida");
                    continue;
                }

                switch (opt) {

                    case 0:
                        repeats = false;
                        break;

                    case 1:
                        llenarArray(vector);
                        break;

                    case 2:
                        visualizarArray(vector);
                        break;

                    case 3:
                        visualizarPar(vector);
                        break;

                    case 4:
                        visualizarMultiplo3(vector);
                        break;
                }

            } while (!valid);

        } while (repeats);
    }
}
