public class Ej28 {
    public static void main(String[] args) {

        // Se crea un array con 500 chars que sean numeros entre el 65 y el 65+26
        int[] array = new int[500];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 26) + 65);
        }

        //Se crea un array que guarda el numero de veces que aparece cada numero en array
        int[] array2 = new int[26];
        for (int i = 0; i < array.length; i++) {
            array2[array[i] - 65]++;
        }

        // Se imprimen las letras mayusculas junto a cada valor de array2
        for (int i = 0; i < array2.length; i++) {
            System.out.println((char) (i + 65) + ": " + array2[i]);
        }

        //se imprime la suma de todos los valores de array2
        // int suma = 0;
        // for (int i = 0; i < array2.length; i++) {
        //     suma += array2[i];
        // }

        // System.out.println("Suma: " + suma);
        
    }
}
