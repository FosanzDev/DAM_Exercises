package com.fosanzdev.T11.Ej5Adv.InventoryCore;

import com.fosanzdev.T11.Ej5Adv.ItemCore.Item;

public class Inventory {

    public final static int MAX_CASILLAS = 10;
    private final Casilla[] casillas;

    public Inventory(){
        this.casillas = new Casilla[MAX_CASILLAS];
    }

    public Inventory(int casillas){
        this.casillas = new Casilla[casillas];
    }

    public Casilla[] getCasillas() {
        return casillas;
    }

    public Casilla getCasilla(int index){
        return casillas[index];
    }

    public void addItem(int index, Item item, int cantidad){
        getCasilla(index).addItem(item, cantidad);
    }


    //TODO: Correct null pointer exception
    public void addItem(Item item, int cantidad){
        for (Casilla casilla : casillas) {
            if (casilla == null) continue;
            if (casilla.addItem(item, cantidad))
                break;
        }
    }

    public void addItem(Item item){
        addItem(item, 1);
    }

    public void removeItem(int index, Item item, int cantidad){
        getCasilla(index).removeItem(item, cantidad);
    }

    public void removeItem(Item item, int cantidad){
        for (Casilla casilla : casillas) {
            if (casilla.removeItem(item, cantidad))
                break;
        }
    }

    public String printInventory() {
        StringBuilder sb = new StringBuilder();
        for (Casilla casilla : casillas) {
            if (casilla == null) sb.append("Empty\n");
            else if (casilla.getItem() != null) {
                sb.append(casilla.getItem().getName()).append(" x").append(casilla.getCantidad()).append("\n");
            }
        }
        return sb.toString();
    }
}
