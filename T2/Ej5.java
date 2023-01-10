public class Ej5{
    public static void main(String[] args) {
        
        final int ALTO = 15;
        final int ANCHO = 25;

        System.out.printf("Datos: %d cm alto y %d cm ancho\n", ALTO, ANCHO);
        System.out.println("Perímetro: " + (ALTO*2+ANCHO*2) + " cm");
        System.out.println("Área: " + ALTO*ANCHO + " cm^2");
    }
}