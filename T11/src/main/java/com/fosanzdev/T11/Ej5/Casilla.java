package com.fosanzdev.T11.Ej5;

public class Casilla {

    private Apilable apilable;
    private int cantidad;
    private Item item;

    public Casilla(Apilable apilable, int cantidad, Item item) {
        this.apilable = apilable;
        this.cantidad = cantidad;
        this.item = item;
    }

    public Casilla(){
        this(Apilable.X1, 0, null);
    }

    public boolean addItem(Item item){
        if(this.item == null){
            this.item = item;
            this.cantidad = 1;
            this.apilable = item.getApilable();
            return true;

        }else if(this.item == item){
            if(this.cantidad < apilable.getValue()){
                this.cantidad++;
                return true;
            }
        }
        return false;
    }

    public boolean removeItem(Item item){
        if(this.item == item){
            if(this.cantidad > 0){
                this.cantidad--;
                if(this.cantidad == 0){
                    this.item = null;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String itemName = item == null ? "Empty" : item.toString();
        return "Casilla{" +
                "cantidad=" + cantidad +
                ", item=" + itemName +
                '}';
    }
}
