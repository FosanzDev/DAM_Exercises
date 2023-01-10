public class Ej29 {
    public static void main(String[] args) {

        //Se crean 3 arrays con la nota media de 20 alumnos
        double[] trim1 = new double[20];
        double[] trim2 = new double[20];
        double[] trim3 = new double[20];

        //Se rellenan los arrays con una nota entre 0 y 10
        for (int i = 0; i < trim1.length; i++) {
            trim1[i] = (Math.random() * 10);
            trim2[i] = (Math.random() * 10);
            trim3[i] = (Math.random() * 10);
        }

        //Se crea un array con la nota media de cada alumno
        double[] medias = new double[20];
        for (int i = 0; i < medias.length; i++) {
            medias[i] = (trim1[i] + trim2[i] + trim3[i]) / 3;
        }

        //Se crean 3 variables que guardan la nota maxima de cada trimestre

        double max1 = 0;
        double max2 = 0;
        double max3 = 0;

        //Se recorre cada uno de los arrays y se obtienen las notas maximas


        for (int i = 0; i < trim1.length; i++) {
            if (trim1[i] > max1) {
                max1 = trim1[i];
            }
        }


        for (int i = 0; i < trim2.length; i++) {
            if (trim2[i] > max2) {
                max2 = trim2[i];
            }
        }

        for (int i = 0; i < trim3.length; i++) {
            if (trim3[i] > max3) {
                max2 = trim3[i];
            }
        }

        //Se obtiene y guarda la nota media de cada uno de los trimestres
        double media1 = 0;
        double media2 = 0;
        double media3 = 0;

        for (int i = 0; i < trim1.length; i++) {
            media1 += trim1[i];
        }

        for (int i = 0; i < trim2.length; i++) {
            media2 += trim2[i];
        }

        for (int i = 0; i < trim3.length; i++) {
            media3 += trim3[i];
        }

        media1 /= trim1.length;
        media2 /= trim2.length;
        media3 /= trim3.length;

        //Se imprime una tabla refleje la nota de cada alumno en cada uno de los trimestres
        //en la ultima columna se imprime la nota media del alumno.
        //Las notas solo tienen 2 decimales

        System.out.println("Alumno\t\tTrim1\t\tTrim2\t\tTrim3\t\tMedia");
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Alumno %d\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f", i+1, trim1[i], trim2[i], trim3[i], medias[i]);
            System.out.println();
        }

        System.out.println();

        //Se imprime otra tabla con las notas maximas de cada trimestre

        System.out.printf("Máximas\t\t%.2f\t\t%.2f\t\t%.2f", max1, max2, max3);
        System.out.println();

        //Se imprime otra tabla con la media de cada trimestre con un numero
        //entre parentesis junto a cada nota media que refleja cuantos alumnos
        //han superado la nota media de ese trimestre.
        //Ejemplo: 3,4(6) --> 6 alumnos han sacado mas de 3,4 en el trimestre

        System.out.printf("Medias(nº Al.)\t%.2f (%d)\t%.2f (%d)\t%.2f (%d)", media1, superan(trim1, media1), media2, superan(trim2, media2), media3, superan(trim3, media3));
    }

    public static int superan(double[] array, double media) {
        int superan = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > media) {
                superan++;
            }
        }
        return superan;
    }
}
