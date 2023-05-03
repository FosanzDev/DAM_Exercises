package com.fosanzdev.T11.Ej5Adv.ItemCore;

public abstract class Objects extends Item{

    public Objects(String name, int maxStack) {
        super(name, maxStack);
    }

    public abstract void use();
}
