public class Jugador {
    private int idJugador;
    private String nombre;
    private int edad;
    private String nacionalidad;
    private int puntuacion;

    //Creating the constructor
    public Jugador(int idJugador, String nombre, int edad, String nacionalidad, int puntuacion) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.puntuacion = puntuacion;
    }

    //Creating the getters

    public int getIdJugador() {
        return idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    //Creating the setters

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    //Creating the toString
    @Override
    public String toString() {
        return "Jugador{" +
                "idJugador=" + idJugador +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }

    //Creating a function that increments the puntuation
    public static void incrementarPuntuacion(Jugador jugador, int puntos) {
        jugador.setPuntuacion(jugador.getPuntuacion() + puntos);
    }

    //Creating a function that increments by 1 the puntuation
    public static void incrementarPuntuacion(Jugador jugador) {
        jugador.setPuntuacion(jugador.getPuntuacion() + 1);
    }


    
}
