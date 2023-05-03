package com.fosanzdev.T11.Ej5Adv.Items.Consumables;

import com.fosanzdev.T11.Ej5Adv.ItemCore.Consumables;

public class Apple extends Consumables {

    public Apple(){
        super("Apple", 5);
    }

    @Override
    public void use() {
        //Empty method
    }

    @Override
    public void eat() {
        //Eating an apple logic
    }

    @Override
    public void wear() {
        //Empty method
    }

    @Override
    public void enchant() {
        //Empty method
    }
}
