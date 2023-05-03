package com.fosanzdev.T11.Ej5Adv.Items.Consumables;

import com.fosanzdev.T11.Ej5Adv.ItemCore.Consumables;

public class IronSword extends Consumables {

    public IronSword(){
        super("Iron Sword", 100, 50, true);
    }

    @Override
    public void use() {
        //Using an iron sword logic
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
        //Enchanting an iron sword logic
    }
}
