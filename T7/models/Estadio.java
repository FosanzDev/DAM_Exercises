package models;

public class Estadio {
    private final int capacidad;
    private String nombre;
    private final String ciudad;
    private String propietario;

    public Estadio(int capacidad, String nombre, String ciudad, String propietario) {
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Estadio{" + 
        "capacidad=" + capacidad + 
        ", nombre=" + nombre + 
        ", ciudad=" + ciudad + 
        ", propietario=" + propietario
        + '}';
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPropietario() {
        return propietario;
    }

    //Setters

    public void setNombre(String nombre) {
        if(nombre != null && nombre.length() >= 3)
            this.nombre = nombre;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    

}
