package com.fosanzdev.T11.Ej5Adv;

import com.fosanzdev.T11.Ej5Adv.InventoryCore.Inventory;
import com.fosanzdev.T11.Ej5Adv.ItemCore.Modifier;
import com.fosanzdev.T11.Ej5Adv.Items.Consumables.Axe;
import com.fosanzdev.T11.Ej5Adv.Items.Consumables.Potions.HealingPotion;
import com.fosanzdev.T11.Ej5Adv.Items.Generators.AcaciaBoat;
import com.fosanzdev.T11.Ej5Adv.Items.Objects.EnchantedBook;

import java.util.HashMap;
import java.util.Map;

public class Ej5Adv {

    public Ej5Adv(){
        Inventory inventory = new Inventory();

        inventory.addItem(new Axe());
        inventory.addItem(new Axe(), 50);
        inventory.addItem(new AcaciaBoat(), 2);
        inventory.addItem(new EnchantedBook(
                new HashMap<Modifier, Integer>(Map.of(
                        Modifier.ABSORPTION, 5,
                        Modifier.HEALTH, 3
                ))
        ));
        inventory.addItem(new HealingPotion());

        System.out.println(inventory.printInventory());
    }
}
