package com.fosanzdev.T11.Ej5Adv.Items.Consumables.Potions;

import com.fosanzdev.T11.Ej5Adv.ItemCore.Modifier;

import java.util.HashMap;
import java.util.Map;

public class HealingPotion extends Potion{

    private final static int DEFAULT_DURATION = 60;
    private final static HashMap<Modifier, Integer> DEFAULT_MODIFIERS = new HashMap<>(Map.of(
            Modifier.HEALTH, 10
    ));

    public HealingPotion(int duration) {
        super(DEFAULT_MODIFIERS, duration);
    }

    public HealingPotion() {
        super(DEFAULT_MODIFIERS, DEFAULT_DURATION);
    }

    @Override
    public void use() {
        //Empty method
    }

    @Override
    public void eat() {
        // Drinking a healing potion logic
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
