public class Ej27 {
    public static void main(String[] args) {

        // Creacion de un array numerico de 50 elementos aleatorios
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        // Creacion de otro array numerico pero de 20 elementos aleatorios
        int[] array2 = new int[20];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100);
        }

        // Se crea un array 50x20
        int[][] array3 = new int[50][20];

        // Se rellena el array 50x20 de manera que array3[i][j] = array1[i] * array2[j]
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = array[i] * array2[j];
            }
        }

        // Se imprime el array 50x20
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
