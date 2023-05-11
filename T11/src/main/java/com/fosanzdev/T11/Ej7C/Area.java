package com.fosanzdev.T11.Ej7C;

public class Area {

    private String nombre;
    private Fila[] filas;
    private int[] filasVip;
    private double precio;
    private int numFilas;
    private int numAsientos;

    public Area(String nombre, int numFilas, int numAsientos, int[] filasVip, double precio){
        this.nombre = nombre;
        this.filasVip = filasVip;
        this.precio = precio;
        this.numFilas = numFilas;
        this.numAsientos = numAsientos;
        filas = new Fila[numFilas]; // Create array of Fila objects

        // Create Fila objects and add them to the array
        for(int i=0; i<numFilas; i++){
            filas[i] = new Fila(i+1, numAsientos);
        }

        // Set vip property of Fila objects
        for(int i=0; i<filasVip.length; i++){
            filas[filasVip[i]-1].setVip(true);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Fila[] getFilas() {
        return filas;
    }

    public int[] getFilasVip() {
        return filasVip;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumFilas() {
        return numFilas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }
}
