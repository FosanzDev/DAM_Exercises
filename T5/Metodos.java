public class Metodos{
    public static void main(String[] args) {
        saludo("Pepe");
        double x = suma(3, 2);
        System.out.println("Suma = " + x);
    }

    public static double suma(double a, double b){
        return a + b;
    }

    public static void saludo(String nombre){
        System.out.println("Hola " + nombre);
    }
}