package com.fosanzdev.T11.Ej5Adv.ItemCore;

public abstract class Generators extends Item {
    public Generators(String name, int maxStack) {
        super(name, maxStack);
    }


    public abstract void use();
}
