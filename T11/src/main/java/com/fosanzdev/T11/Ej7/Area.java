package com.fosanzdev.T11.Ej7;

public class Area {

    private boolean vip;
    private int numFilas;
    private int asientosPorFila;
    private String nombre;
    private Fila[] filas;

    public Area(boolean vip, int numFilas, int asientosPorFila, String nombre){
        this.vip = vip;
        this.nombre = nombre;
        this.numFilas = numFilas;
        this.asientosPorFila = asientosPorFila;
        this.filas = new Fila[numFilas];

        for(int i = 0; i < numFilas; i++){
            this.filas[i] = new Fila(i, asientosPorFila);
        }
    }

    public Area(Area area){
            this.vip = area.isVip();
        this.nombre = area.getNombre();
        this.numFilas = area.getNumFilas();
        this.asientosPorFila = area.getAsientosPorFila();
        this.filas = new Fila[numFilas];

        for(int i = 0; i < numFilas; i++){
            this.filas[i] = new Fila(i, asientosPorFila);
        } }

    public boolean isVip() {
        return vip;
    }

    public int getNumFilas() {
        return numFilas;
    }

    public int getAsientosPorFila() {
        return asientosPorFila;
    }

    public String getNombre(){
        return this.nombre;
    }
}