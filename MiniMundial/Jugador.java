public class Jugador {
    private final String nombre;
    private final int portero;
    private final int defensa;
    private final int regate;
    private final int pase;
    private final int tiro;

    public Jugador(String nombre, int portero, int defensa, int regate, int pase, int tiro){
        this.nombre = nombre;
        this.portero = portero;
        this.defensa = defensa;
        this.regate = regate;
        this.pase = pase;
        this.tiro = tiro;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPortero() {
        return portero;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getRegate() {
        return regate;
    }

    public int getPase() {
        return pase;
    }

    public int getTiro() {
        return tiro;
    }
    
}