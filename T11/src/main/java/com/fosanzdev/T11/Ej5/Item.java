package com.fosanzdev.T11.Ej5;

public class Item {
    private String name;
    private int damage;
    private int durability;
    private String type;
    private Apilable stackSize;

    public Item(String name, int damage, int durability, String type, Apilable stackSize) {
        this.name = name;
        this.damage = damage;
        this.durability = durability;
        this.type = type;
        this.stackSize = stackSize;
    }

    public Item(String name, int damage, int durability, String type) {
        this(name, damage, durability, type, Apilable.X1);
    }

    public Item(String name, int damage, int durability) {
        this(name, damage, durability, "Other", Apilable.X1);
    }

    public Item(String name, int damage) {
        this(name, damage, 0, "Other", Apilable.X1);
    }

    public Item(String name) {
        this(name, 0, 0, "Other", Apilable.X1);
    }

    public Item(String name, Apilable apilable) {
        this(name, 0, 0, "Other", apilable);
    }

    public Apilable getApilable() {
        return stackSize;
    }

    @Override
    public String toString(){
        return "Item{" +
                "name='" + name + '\'' +
                ", durability=" + durability +
                '}';
    }
}
