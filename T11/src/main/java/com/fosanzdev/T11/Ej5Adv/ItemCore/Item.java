package com.fosanzdev.T11.Ej5Adv.ItemCore;

public abstract class Item {
    public static int idCounter = 0;

    int id;
    String name;
    Stackable maxStack;

    public Item(String name, int maxStack){
        this.id = idCounter++;
        this.name = name;
        this.maxStack = Stackable.getStackable(maxStack);
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getMaxStack(){
        return maxStack.getValue();
    }
}
