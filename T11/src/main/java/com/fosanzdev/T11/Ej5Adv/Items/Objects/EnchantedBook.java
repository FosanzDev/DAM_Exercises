package com.fosanzdev.T11.Ej5Adv.Items.Objects;

import com.fosanzdev.T11.Ej5Adv.ItemCore.Modifier;
import com.fosanzdev.T11.Ej5Adv.ItemCore.Objects;

import java.util.HashMap;
import java.util.Map;

public class EnchantedBook extends Objects {

    private final HashMap<Modifier, Integer> modifiers;

    public EnchantedBook(Map<Modifier, Integer> modifiers) {
        super("Enchanted Book", 1);
        this.modifiers = new HashMap<>(modifiers);
    }

    public HashMap<Modifier, Integer> getModifiers() {
        return modifiers;
    }

    @Override
    public void use() {
        // Usage logic
    }
}
