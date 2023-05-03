package com.fosanzdev.T11.Ej5Adv.ItemCore;

public abstract class Consumables extends Item {

    private int durability;
    private int damage;
    private int protection;
    private int hunger;
    private boolean isEdible;
    private boolean isWearable;
    private boolean isEnchantable;


    //Main constructor
    public Consumables(String name, int maxStack, int durability, int damage, int protection, int hunger, boolean isEdible, boolean isWearable, boolean isEnchantable) {
        super(name, maxStack);
        this.durability = durability;
        this.damage = damage;
        this.protection = protection;
        this.hunger = hunger;
        this.isEdible = isEdible;
        this.isWearable = isWearable;
        this.isEnchantable = isEnchantable;
    }

    // Constructor for edible items
    // Food, potions, etc.
    public Consumables(String name, int hunger){
        this(name, 64, 0, 0, 0, hunger, true, false, false);
    }

    // Constructor for wearable items
    // Armor, Pumpkins, etc.
    public Consumables(String name, int durability, int protection){
        this(name, 1, durability, 0, protection, 0, false, true, true);
    }

    // Constructor for tools
    // Weapons, tools, etc.
    public Consumables(String name, int durability, int damage, boolean isEnchantable){
        this(name, 1, durability, damage, 0, 0, false, false, isEnchantable);
    }

    public abstract void use();
    public abstract void eat();
    public abstract void wear();
    public abstract void enchant();
}
