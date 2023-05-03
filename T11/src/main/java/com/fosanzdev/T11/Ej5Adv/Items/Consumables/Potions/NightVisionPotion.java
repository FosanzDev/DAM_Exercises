package com.fosanzdev.T11.Ej5Adv.Items.Consumables.Potions;

import com.fosanzdev.T11.Ej5Adv.ItemCore.Modifier;

import java.util.HashMap;
import java.util.Map;

public class NightVisionPotion extends Potion{

    private final static int DEFAULT_DURATION = 60;
    private final static HashMap<Modifier, Integer> DEFAULT_MODIFIERS = new HashMap<>(Map.of(
            Modifier.NIGHT_VISION, 1,
            Modifier.BLINDNESS, -1
    ));

    public NightVisionPotion(int duration) {
        super(DEFAULT_MODIFIERS, duration);
    }

    public NightVisionPotion() {
        super(DEFAULT_MODIFIERS, DEFAULT_DURATION);
    }

    @Override
    public void use() {
        // Empty method
    }

    @Override
    public void eat() {
        // Drink logic
    }

    @Override
    public void wear() {
        // Empty method
    }

    @Override
    public void enchant() {
        // Empty method
    }


}
