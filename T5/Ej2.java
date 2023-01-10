import java.util.Scanner;

public class Ej2 {

    //Formula = PI x R^2
    public static double area(double radio){
        return Math.PI*radio*radio;
    }

    //Formula = 2 x PI x R
    public static double longitud(double radio){
        return 2*Math.PI*radio;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca un radio: ");
        double radio = lector.nextDouble(); lector.nextLine();

        System.out.printf("Area: %.3f\nLongitud: %.3f",
                            area(radio),    longitud(radio));

        lector.close();
    }
}
