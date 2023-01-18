import models.Estadio;
import models.Jugador;  

public class Prueba {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(1, "Juan", 20, "Español", 100);
        Estadio estadio = new Estadio(1000, "Mestalla", "Madrid", "Quasimodo");
            estadio.setNombre(null);
    }

}
