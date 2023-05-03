package com.fosanzdev.T11.Ej5Adv.Items.Consumables;

import com.fosanzdev.T11.Ej5Adv.ItemCore.Consumables;

public class GoldenBoots extends Consumables {

    public GoldenBoots(){
        super("Golden Boots", 100, 3);
    }

    @Override
    public void use() {
        //Wear or unwear golden boots logic (?)
    }

    @Override
    public void eat() {
        //Empty method
    }

    @Override
    public void wear() {
        //Wearing golden boots logic
    }

    @Override
    public void enchant() {
        //Enchanting golden boots logic
    }

}
