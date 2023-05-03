package com.fosanzdev.T11.Ej5Adv.Items.Consumables;

import com.fosanzdev.T11.Ej5Adv.ItemCore.Consumables;

public class Axe extends Consumables {
    public Axe(){
        super("Axe", 100, 5, true);
    }

    @Override
    public void use() {
        //Using an axe logic
    }

    @Override
    public void eat() {
        //Empty method
    }

    @Override
    public void wear() {
        //Empty method
    }

    @Override
    public void enchant() {
        //Enchanting an axe logic
    }
}
