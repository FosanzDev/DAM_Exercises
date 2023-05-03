package com.fosanzdev.T11.Ej5Adv.InventoryCore;

import com.fosanzdev.T11.Ej5Adv.ItemCore.Item;
import com.fosanzdev.T11.Ej5Adv.Items.Correspondences;

public class Casilla {
    private int cantidad;
    private Item item;

    public Casilla(Item item, int cantidad){
        this.item = item;
        this.cantidad = cantidad;
    }

    public Casilla(){
        this.item = null;
        this.cantidad = 0;
    }

    //TODO: Cambiar el booleano por un resto por asi decirlo
    //     para que se pueda saber si se ha podido añadir o no
    //    el item a la misma casilla. En caso de que no se haya
    //    podido añadir, se deberia de pasar el item a la siguiente
    //    casilla y asi sucesivamente hasta que se pueda añadir
    //    todos los items a las casillas.

    //La implementacion actual no permite añadir items a la casilla
    // siguiente en caso de que no se puedan añadir todos los items

    public boolean addItem(Item item, int cantidad) {
        if (this.item == null) {
            this.item = item;
            this.cantidad = Math.min(cantidad, item.getMaxStack());
            return true;

        } else if(Correspondences.compare(this.item, item)) {
            this.cantidad = Math.min(this.cantidad + cantidad, item.getMaxStack());
            return true;
        }

        return false;
    }

    public boolean removeItem(Item item, int cantidad){
        if (Correspondences.compare(this.item, item)){
            if (cantidad > 0) {
                this.cantidad -= cantidad;
                if (this.cantidad <= 0) this.item = null;
                return true;
            }
        }
        return false;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Item getItem() {
        return item;
    }
}
