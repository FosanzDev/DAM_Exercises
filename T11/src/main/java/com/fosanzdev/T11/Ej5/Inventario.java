package com.fosanzdev.T11.Ej5;

public class Inventario {

    private static final int TAMANO_BASE = 7;

    private Casilla[] casillas;

    public Inventario(int tamano) {
        casillas = new Casilla[tamano];
        for (int i = 0; i < casillas.length; i++) {
            casillas[i] = new Casilla();
        }
    }

    public Inventario() {
        this(TAMANO_BASE);
    }

    public boolean addItem(Item item){
        for (Casilla casilla : casillas) {
            if(casilla.addItem(item)){
                return true;
            }
        }
        return false;
    }

    public boolean removeItem(Item item){
        for (Casilla casilla : casillas) {
            if(casilla.removeItem(item)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Casilla casilla : casillas) {
            sb.append(casilla.toString()).append("\n");
        }
        return sb.toString();
    }
}
